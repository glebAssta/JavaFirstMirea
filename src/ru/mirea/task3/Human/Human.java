package ru.mirea.task3.Human;
public class Human {
    public static void main(String[] args){
        Head head = new Head("black", "hazel");
        Hand hand = new Hand("short", "little");
        Leg leg = new Leg("short", "average-built");
        System.out.print("It is a human with "+head.getHairColor()+" hair, "+head.getEyeColor()+" eyes, "+hand.getSize()
                +" hands with "+hand.getFingerLength()+" fingers and "+leg.getLength()+" "+leg.getBuild()+" legs");
    }

}
