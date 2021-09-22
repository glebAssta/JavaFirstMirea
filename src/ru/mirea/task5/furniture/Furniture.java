package ru.mirea.task5.furniture;

public abstract class Furniture {
    private String material;
    private int amount;
    public Furniture(String material, int amount){
        this.material = material;
        this.amount = amount;
    }
    public Furniture(){
        this.material = "oak wood";
    }
    public String getMaterial(){
        return this.material;
    }
    public float getAmount(){
        return this.amount;
    }
}