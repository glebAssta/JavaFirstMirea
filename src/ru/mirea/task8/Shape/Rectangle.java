package ru.mirea.task8.Shape;

import java.awt.*;

public class Rectangle extends Shape
{
    public Rectangle (int x, int y)
    {
        super(x, y);
    }

    public void Print(Graphics g)
    {
        g.fillRect(getX(), getY(), 10 + (int) (Math.random() * 100), 10 + (int) (Math.random() * 100));
    }
}