package ru.mirea.task6.Nameable;

import ru.mirea.task6.Nameable.Nameable;

public class Planet implements Nameable {
    private String name;
    public Planet (String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}