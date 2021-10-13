package ru.mirea.task8.Shape;

import ru.mirea.task8.Shape.Shape;

import java.awt.*;

public class Triangle extends Shape {
    public Triangle (int x, int y)
    {
        super(x, y);
    }

    public void Print(Graphics g)
    {
        g.fillPolygon(new int[] {getX(), (getX() - 50) + (int) (Math.random() * (getX() + 50)), (getX() - 50) + (int) (Math.random() * (getX() + 50))}, new int[] {getY(), (getY() - 50) + (int) (Math.random() * (getY() + 50)), (getY() - 50) + (int) (Math.random() * (getY() + 50))}, 3);
    }
}
