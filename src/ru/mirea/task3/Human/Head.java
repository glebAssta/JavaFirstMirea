package ru.mirea.task3.Human;

public class Head {
    private String hairColor, eyeColor;

    public Head(String hair, String eyes){
        hairColor = hair;
        eyeColor = eyes;
    }

    public String getHairColor(){
        return hairColor;
    }

    public void setHairColor(String hair){
        hairColor = hair;
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public void setEyeColor(String eyes){
        eyeColor = eyes;
    }
}
