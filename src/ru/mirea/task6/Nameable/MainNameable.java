package ru.mirea.task6.Nameable;

public class MainNameable {
    public static void main(String[] args) {
        Person p1 = new Person("Masha");
        Planet pl1 = new Planet("Jupiter");
        System.out.println(p1.getName());
        System.out.println(pl1.getName());
    }
}