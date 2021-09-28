package ru.mirea.task2;

public class Main {
    public static void main(String[] arg) {
        System.out.println("Testing class Shape");
        Shape shape = new Shape(11);
        System.out.println(shape);




        System.out.println("\nTesting class Ball");
        Ball ball1 = new Ball(2, "blue");
        Ball ball2 = new Ball(3);
        ball2.setColor("yellow");
        System.out.println(ball1);
        System.out.println(ball2);



        System.out.println("\nTesting class Book");
        book book1 = new book("Voina i mir", "Pushkin", 1800);
        book book2 = new book("Oblomov", "Ivan Goncharov");
        book book3 = new book("Remeslo");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        book1.setName("War and Peace");
        book2.setPublishingYear(1354);
        book3.setAuthor("Ivan Turgenev");
        book3.setPublishingYear(1123);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);



        System.out.println("\nTesting class TestDog");
        TestDog dogs = new TestDog();
        Dog dog1 = new Dog("Flex", 5);
        Dog dog2 = new Dog("Rave", 8);
        dogs.addDog(dog1);
        dogs.addDog(dog2);
        System.out.println(dogs);
    }
}