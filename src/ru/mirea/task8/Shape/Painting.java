package ru.mirea.task8.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Painting extends JFrame
{
    public void paint(Graphics g)
    {
        super.paint(g);
        Random rand = new Random();

        Rectangle rec;
        Circle cir;
        Triangle tri;
        for (int i = 0; i < 10; i++)
        {
            switch (1 + (int) (Math.random() * 3))
            {
                case (1):
                    rec = new Rectangle(100 + (int) (Math.random() * 1100), 100 + (int) (Math.random() * 700));
                    rec.Print(g);
                    break;
                case (2):
                    cir = new Circle(100 + (int) (Math.random() * 1100), 100 + (int) (Math.random() * 700));
                    cir.Print(g);
                    break;
                case(3):
                    tri = new Triangle(100 + (int) (Math.random() * 1100), 100 + (int) (Math.random() * 700));
                    tri.Print(g);
                    break;
            }
        }


    }

    public Painting()
    {
        super("Lab5_1");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(1200, 800);
        setVisible(true);
    }

    public static void main (String[] args)
    {
        new Painting().setVisible(true);
    }
}