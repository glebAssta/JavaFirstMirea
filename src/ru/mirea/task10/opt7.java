package ru.mirea.task10;

public class opt7 {
    public static void recursion(int n, int k) {

        if (k > n / 2) {
            System.out.println(n);
            return;
        }

        if (n % k == 0) {
            System.out.println(k);
            recursion(n / k, k);
        }
        else {
            recursion(n, ++k);
        }
    }
    public static void main(String[] args) {
        recursion(150, 2);
    }
}
