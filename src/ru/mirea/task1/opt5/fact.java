package ru.mirea.task1.opt5;
import java.util.Scanner;

public class fact {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n;

        n = scanner.nextInt();
        int k = n + 1;
        int f = 1;
        for(int i = 1; i <= n; i++){
            k-=1;
            while(k >= 1){
                f *= k;
            }
        }
        System.out.println(f);

    }
}
