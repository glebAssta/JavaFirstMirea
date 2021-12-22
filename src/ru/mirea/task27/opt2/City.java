package ru.mirea.task27.opt2;
import java.util.*;

public class City
{
    private String town, country;

    public City(String town, String country)
    {
        this.town = town;
        this.country = country;
    }

    public static void main(String[] args)
    {
        City moscow = new City("Moscow", "Russia");
        City newYork = new City("New-York", "USA");
        City vinh = new City("Vinh", "Vietnam");
        City saratov = new City("Saratov", "Russia");

        Map<String, ArrayList<String>> map = new HashMap<>();
        map.put(moscow.country, new ArrayList<>(Arrays.asList(moscow.town, saratov.town)));
        map.put(newYork.country, new ArrayList<>(Collections.singletonList(newYork.town)));
        map.put(vinh.country, new ArrayList<>(Collections.singletonList(vinh.town)));

        System.out.println(map);
    }
}