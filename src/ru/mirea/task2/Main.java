package ru.mirea.task2;

public class Main {
    public static void main(String[] arg) {
        System.out.println("Testing class Shape");
        Shape shape = new Shape(11);
        System.out.println(shape);

        System.out.println("\nTesting class Ball");
        Ball ball1 = new Ball(5, "yellow");
        Ball ball2 = new Ball(7.5);
        ball2.setColor("red");
        System.out.println(ball1);
        System.out.println(ball2);

        System.out.println("\nTesting class Book");
        book book1 = new book("", "Lev Tolstoy", 1869);
        book book2 = new book("Oblomov", "Ivan Goncharov");
        book book3 = new book("Fathers and Sons");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        book1.setName("War and Peace");
        book2.setPublishingYear(1857);
        book3.setAuthor("Ivan Turgenev");
        book3.setPublishingYear(1861);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("\nTesting class TestDog");
        TestDog dogs = new TestDog();
        Dog dog1 = new Dog("Jack", 10);
        Dog dog2 = new Dog("Bob", 2);
        dogs.addDog(dog1);
        dogs.addDog(dog2);
        System.out.println(dogs);
    }
}