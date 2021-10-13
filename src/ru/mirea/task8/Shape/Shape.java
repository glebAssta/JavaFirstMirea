package ru.mirea.task8.Shape;

import java.awt.*;

public abstract class Shape {
    private int x;
    private int y;


    public Shape(int x, int y){
        this.x = x;

        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
