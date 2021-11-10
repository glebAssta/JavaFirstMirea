package ru.mirea.task13;

public class TestmyArray {
    public static void main(String[] args)
    {
        myArray<String> list = new myArray<>();
        list.add("Hello");
        list.add("I need");
        list.add("some");
        list.add("milk");
        list.add("field to set");
        list.add("!!11!!!!!1!!");

        list.remove(3);

        list.set(3, "milk");

        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i) + " ");
        }
    }
}
