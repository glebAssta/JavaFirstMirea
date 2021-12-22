package ru.mirea.task19.opt;
import java.util.Scanner;

public class RightTriangle
{
    private int angle1, angle2, angle3;

    public RightTriangle(int a1, int a2, int a3) throws Exception
    {
        angle1 = a1;
        angle2 = a2;
        angle3 = a3;

        if( (angle1 + angle2 + angle3) != 180)
            throw new Exception("Sum of the angles is not equal to 180!!!");
        if(angle1 != 90 && angle2 != 90 && angle3 != 90)
            throw new Exception("Triangle is not right!!!");
    }

    public static void main(String[] args)
    {
        int angle1, angle2, angle3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter angles of the right triangle:");
        angle1 = scanner.nextInt();
        angle2 = scanner.nextInt();
        angle3 = scanner.nextInt();

        try
        {
            RightTriangle obj = new RightTriangle(angle1, angle2, angle3);
            System.out.println("Angles are entered right.");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}