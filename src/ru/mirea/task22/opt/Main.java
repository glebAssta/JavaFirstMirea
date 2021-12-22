package ru.mirea.task22.opt;

import java.awt.event.ActionListener;

public class Main
{
    public static void main(String[] args)
    {
        Factory factory = new Factory(){};

        Chair chair1 = factory.getChair(ChairTypes.VICTORIAN);
        Chair chair2 = factory.getChair(ChairTypes.MULTIFUNCTIONAL);
        Chair chair3 = factory.getChair(ChairTypes.MAGIC);

        Client person = new Client("Ivan", "male", 22);
        person.sit(chair1);
        person.sit(chair2);
        person.sit(chair3);
    }
}