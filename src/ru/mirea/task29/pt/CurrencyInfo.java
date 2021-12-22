package ru.mirea.task29.pt;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CurrencyInfo implements Serializable
{
    private static final long serialVersionUID = 1L;

    private int wood;
    private int stone;
    private int gold;

    public CurrencyInfo(int wood, int stone, int gold)
    {
        this.wood = wood;
        this.stone = stone;
        this.gold = gold;
    }

    public void setWood(int wood)
    {
        this.wood = wood;
    }

    public int getWood()
    {
        return wood;
    }

    public void setStone(int stone)
    {
        this.stone = stone;
    }

    public int getStone()
    {
        return stone;
    }

    public void setGold(int gold)
    {
        this.gold = gold;
    }

    public int getGold()
    {
        return gold;
    }

    public String toString()
    {
        return "SavedGame{" + "wood = " + wood + ", stone = " + stone + ", gold = " + gold + '}';
    }

    public static void main(String[] args)
    {
        int wood = 45;
        int stone = 35;
        int gold = 35000;

        CurrencyInfo savedGame = new CurrencyInfo(wood, stone, gold);
        try
        {
            FileOutputStream outputStream = new FileOutputStream("A:\\прога 3 сем\\src\\ru\\mirea\\task29\\pt\\save.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(savedGame);

            objectOutputStream.close();
        }
        catch (IOException e)
        {
            System.out.println("Something wrong with file stream: " + e);
        }

        try
        {
            FileInputStream fileInputStream = new FileInputStream("A:\\прога 3 сем\\src\\ru\\mirea\\task29\\pt\\save.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            CurrencyInfo loadGame = (CurrencyInfo) objectInputStream.readObject();

            System.out.println(savedGame);
        }
        catch (IOException e)
        {
            System.out.println("Something wrong with file stream: " + e);
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Something wrong with object type: " + e);
        }
    }
}