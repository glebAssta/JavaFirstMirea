package ru.mirea.task3.Circle;

public class Circle {
    public double r; // радиус
    public double x; // абсцисса центра
    public double y; // ордината центра
    public void printCircle() {
        System.out.println("Окружность с центром ("+x+";"+y+") и радиусом "+r);
    }
    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }
    public void zoomCircle(double k) {
        r = r * k;
    }
}
