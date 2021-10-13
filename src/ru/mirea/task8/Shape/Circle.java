package ru.mirea.task8.Shape;

import java.awt.*;

public class Circle extends Shape {

    public Circle (int x, int y)
    {
        super(x, y);
    }

    public void Print(Graphics g)
    {

        g.fillOval(getX(), getY(), 10 + (int) (Math.random() * 100), 10 + (int) (Math.random() * 100));
    }

}
