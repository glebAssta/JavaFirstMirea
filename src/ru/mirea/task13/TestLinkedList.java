package ru.mirea.task13;

import java.util.LinkedList;

public class TestLinkedList
{
    public static void main(String[] args)
    {

        String str1 = new String("Hello World!");
        String str2 = new String("My first linked list test");
        String str3 = new String("I love Java");
        String str4 = new String("I live in constant pain");

        LinkedList<String> list = new LinkedList<>();
        list.add(str3);
        list.add(1, str2);
        list.addFirst(str1);
        list.addLast(str4);

        list.remove(1);
        System.out.println(list);

        System.out.println("First element of list: " + list.peekFirst());
        System.out.println("Last element of list: " + list.peekLast());

        list.set(0, "Why am I doing this?");
        System.out.println(list);

        System.out.println("Number of elements in list: " + list.size());

        System.out.println("Index of 'I live in constant pain': " + list.indexOf("I live in constant pain"));

        System.out.println("Check for 'Hello World!': " + list.contains("Hello World!"));

        System.out.println("String array:");
        String[] array = new String[list.size()];
        list.toArray(array);
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}