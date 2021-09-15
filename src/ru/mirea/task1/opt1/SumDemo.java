package ru.mirea.task1.opt1;
import java.util.Scanner;

public class SumDemo {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        int sum = 0;
        System.out.println("Введите число:");
        for (int i=0; i < 10; i++)
        {
            array[i] = scanner.nextInt();
        }
        // проходим по всем элементов массива и суммируем каждое число
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Сумма элементов массива циклом for равна: " + sum);
        sum = 0;
        int i = 0;
        while( i < 10){
            sum += array[i];
            i += 1;
        }
        System.out.println("Сумма элементов массива циклом while равна: " + sum);
        sum = 0;
        int k = 0;
        do{
            sum += array[k];
            k += 1;
        } while(k < 10);
        System.out.println("Сумма элементов массива циклом do while равна: " + sum);
    }
}
