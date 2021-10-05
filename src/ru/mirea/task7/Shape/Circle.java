package ru.mirea.task7.Shape;

public class Circle extends Shape
{
    private double radius;

    public Circle()
    {
        super();
        radius = 0;
    }

    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return (3.14 * radius *  radius);
    }

    public double getPerimeter ()
    {
        return (2 * 3.14 * radius);
    }

    public String toString()
    {
        if(super.isFilled())
            return super.getColor() + " filled circle with " + getRadius();
        else
            return super.getColor() + " not filled circle with " + getRadius();
    }
}