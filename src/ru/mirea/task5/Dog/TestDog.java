package ru.mirea.task5.Dog;

public class TestDog {
    public static void main(String[] args) {
        Mops d1 = new Mops("Chapa", 6, "man",  2);
        Taxa d2 = new Taxa("Lyla", 4,"woman", 2);
        d1.displayInfo();
        d2.displayInfo();
    }
}