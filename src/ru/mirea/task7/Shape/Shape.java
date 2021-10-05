package ru.mirea.task7.Shape;

public abstract class Shape
{
    protected String color;
    protected boolean filled;

    public Shape (String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public Shape ()
    {
        this.color = "white";
        this.filled = false;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor ( String color )
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled ( boolean filled )
    {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public String toString ()
    {
        return this.color + " shape, filled - " + this.filled;
    }
}
