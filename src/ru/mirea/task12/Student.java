package ru.mirea.task12;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    private int ID;
    private String name;
    private int totalPoints;
    public Student (int id, String name, int points) {
        setID(id);
        setName(name);
        setTotalPoints(points);
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
    public int getTotalPoints() {
        return totalPoints;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", totalPoints=" + totalPoints +
                '}';
    }
}

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.getTotalPoints() - o1.getTotalPoints();
    }
}

class StudentTest {

    private Student[] createFirstTestArr() {
        Student[] testArr = new Student[4];
        testArr[0] = (new Student(1, "Andrey", 30));
        testArr[1] = (new Student(2, "Roman", 33));
        testArr[2] = (new Student(3, "Vladimir", 10));
        testArr[3] = (new Student(4, "Evgeney", 13));

        return testArr;
    }

    private Student[] createSecondTestArr() {
        Student[] testArr = new Student[3];
        testArr[0] = (new Student(5, "Ashot", 17));
        testArr[1] = (new Student(6, "Murad", 5));
        testArr[2] = (new Student(7, "Dmitry", 57));

        return testArr;
    }

    private void insertionSortTest() {
        Student[] students = createFirstTestArr();
        System.out.println("before insertion sort:");
        for (Student st : students)
            System.out.println(st);

        insertionSort((Student[]) students);
        System.out.println("after insertion sort:");

        for(Student st : students)
            System.out.println(st);
    }

    private void qSortTest() {
        Student[] students = createFirstTestArr();

        System.out.println("before qsort:");
        for (Student st : students)
            System.out.println(st);

        Comparator cmprtr = new SortingStudentsByGPA();
        Arrays.sort(students, cmprtr);

        System.out.println("after qsort (in descending order):");
        for(Student st : students)
            System.out.println(st);
    }

    private void mergeSortTest() {
        Student[] students = createFirstTestArr();
        Student[] students2 = createSecondTestArr();

        System.out.println("before mergesort:");
        System.out.println("first arr:");
        for (Student st : students)
            System.out.println(st);
        System.out.println("second arr:");
        for (Student st : students2)
            System.out.println(st);

        Student[] merged = mergeAndSort(students, students2);
        System.out.println("after mergesort:");

        for (Student st : merged)
            System.out.println(st);
    }

    public static void insertionSort(Student[] arr) {
        for (int left = 0; left < arr.length; left++) {
            Student value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.getTotalPoints() < arr[i].getTotalPoints()) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }
    }

    public Student[] mergeAndSort(Student[] arr1, Student[] arr2) {
        Student[] merged = new Student[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++)
            merged[i] = arr1[i];
        for (int i = 1; i <= arr2.length; i++)
            merged[i + arr2.length] = arr2[i - 1];

        mergeSort(merged, 0, merged.length - 1);

        return merged;
    }

    private void merge(Student arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        Student L[] = new Student[n1];
        Student R[] = new Student[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getTotalPoints() <= R[j].getTotalPoints()) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private void mergeSort(Student arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    void start() {
        insertionSortTest();
        qSortTest();
        mergeSortTest();
    }
}

class SortingTaskTest {
    public static void main(String[] args) {
        StudentTest st = new StudentTest();
        st.start();
    }
}