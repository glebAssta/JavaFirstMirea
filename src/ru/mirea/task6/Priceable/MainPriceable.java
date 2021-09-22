package ru.mirea.task6.Priceable;

public interface MainPriceable {
    public static void main(String[] args)
    {
        Orange orange = new Orange(10, "red");
        System.out.println("Orange price is " + orange.getCost() + "$.");
        Magazine magazine = new Magazine(20, 30);
        System.out.println("Magazine price is " + magazine.getPrice() + "$.");
    }
}
