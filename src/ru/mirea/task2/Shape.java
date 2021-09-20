package ru.mirea.task2;

public class Shape {
    private int data;

    public Shape() {
        data = 0;
    }

    public Shape(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Shape {" + "data = " + data + "}";
    }
}