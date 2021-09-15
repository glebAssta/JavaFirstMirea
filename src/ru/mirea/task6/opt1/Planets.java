package ru.mirea.task6.opt1;

public class Planets implements Nameable
{
    private String name;
    int radius;

    Planets(String name, int radius)
    {
        this.name = name;
        this.radius = radius;
    }

    public String getName()
    {
        return name;
    }
}