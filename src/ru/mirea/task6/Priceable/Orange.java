package ru.mirea.task6.Priceable;

public class Orange implements Priceable {
    private int cost;
    private String colour;

    public Orange(int cost, String colour){this.colour = colour;this.cost = cost;}

    public int getCost() {return cost;}
}
