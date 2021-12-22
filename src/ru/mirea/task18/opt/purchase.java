package ru.mirea.task18.opt;
import java.util.Scanner;

public class purchase
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name, temporary;
        int[] inn = new int[12];
        int sum1 = 0, sum2 = 0;
        int[] controll11 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8, 0};
        int[] controll12 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8, 0};

        System.out.println("Введите ваше ФИО");
        name = scanner.nextLine();

        System.out.println("Введите ваш ИНН");
        temporary = scanner.nextLine();
        for (int i = 0; i < 12; i++)
        {
            inn[i] = temporary.charAt(i) - '0';
        }

        try
        {
            for(int i = 0; i < 11; i++)
            {
                sum1 += inn[i] * controll11[i];
            }
            sum1 %= 11;
            if(sum1 > 9)
                sum1 %= 10;

            for(int i = 0; i < 12; i++)
            {
                sum2 += inn[i] * controll12[i];
            }
            sum2 %= 11;
            if(sum2 > 9)
                sum1 %= 10;

            if(sum1 != inn[10] || sum2 != inn[11])
                throw new Exception();

            System.out.print("ИНН действителен.");
        }
        catch (Exception e)
        {
            System.out.println("ИНН не действителен.");
        }
    }
}