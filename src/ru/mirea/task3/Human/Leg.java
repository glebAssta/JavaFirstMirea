package ru.mirea.task3.Human;

public class Leg {
    private String length, build;

    public Leg(String len, String bld){
        length = len;
        build = bld;
    }

    public String getLength(){
        return length;
    }

    public void setLength(String len){
        length = len;
    }

    public String getBuild(){
        return build;
    }

    public void setBuild(String bld){
        build = bld;
    }
}
