package ru.mirea.task2;

import java.util.Arrays;

public class TestDog {
    private Dog[] flock;
    private int number;

    public TestDog() {
        flock = new Dog[10];
        number = 0;
    }

    public void addDog(Dog dog) {
        flock[number] = dog;
        number++;
    }

    @Override
    public String toString() {
        String out = "TestDog {" + "flock = ";
        for (int i = 0; i < number; i++) {
            out += flock[i].toString();
            if (i != number - 1)
                out += ", ";
        }
        out += ", number = " + number + '}';
        return out;
    }
}