package ru.mirea.task6.opt1;

public class Dogs implements Nameable
{
    private String name;
    int age;

    Dogs(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }
}