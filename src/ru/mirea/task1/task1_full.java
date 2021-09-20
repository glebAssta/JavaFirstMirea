package ru.mirea.task1;
import java.util.Arrays;
import java.util.Scanner;

public class task1_full {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i=0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("1) ");
        var1(arr);
        System.out.println("2) ");
        var2(arr);
        System.out.println("4) ");
        var4(arr);
    }

    public static void var1(int[] arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        int i = 0;
        sum = 0;
        while (i != arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println(sum);
        i = 0;
        sum = 0;
        do {
            sum += arr[i];
            i++;
        }while (i != arr.length);
        System.out.println(sum);
    }

    public static void var2(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void var4(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}