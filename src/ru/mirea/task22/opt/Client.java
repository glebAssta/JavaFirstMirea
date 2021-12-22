package ru.mirea.task22.opt;

public class Client implements Chair
{
    private String name, sex;
    private int age;

    public Client(String name, String sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void sit(Chair chair)
    {
        System.out.println(name + " have sat on " + chair.GetType() + " chair!");
    }

    public String GetType()
    {
        return "human";
    }
}