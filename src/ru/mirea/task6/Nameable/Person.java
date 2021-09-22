package ru.mirea.task6.Nameable;

import ru.mirea.task6.Nameable.Nameable;

public class Person implements Nameable {
    private String name;
    public Person (String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}