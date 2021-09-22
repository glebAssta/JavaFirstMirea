package ru.mirea.task6.Priceable;

public class Magazine implements Priceable{

    private int cost;
    private int size;

    public Magazine(int cost, int size){this.cost = cost; this.size = size;}
    public int getPrice() {
        return cost;
    }
}
