package ru.mirea.task3.Human;

public class Hand {
    private String fingerLength, size;

    public Hand(String len, String sz){
        fingerLength = len;
        size = sz;
    }

    public String getFingerLength(){
        return fingerLength;
    }

    public void setFingerLength(String len){
        fingerLength = len;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String sz){
        size = sz;
    }
}
