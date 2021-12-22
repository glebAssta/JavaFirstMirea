package ru.mirea.task27.opt1;
import java.util.*;
import java.util.stream.Collectors;

public class Vocabulary
{
    public static void main(String[] args)
    {
        Map<String, String> DATA_BASE = new HashMap<>();

        DATA_BASE.put("Новиков", "Богдан");
        DATA_BASE.put("Горохов", "Роберт");
        DATA_BASE.put("Седова", "Алиса");
        DATA_BASE.put("Архипова", "Виктория");
        DATA_BASE.put("Наумов", "Роберт");
        DATA_BASE.put("Попов", "Илья");
        DATA_BASE.put("Макаров", "Роберт");
        DATA_BASE.put("Овсянникова", "Ангелина");
        DATA_BASE.put("Данилов", "Глеб");
        DATA_BASE.put("Корчагина", "Алиса");

        System.out.printf("До: %s%n", DATA_BASE);

        HashMap<String, Integer> names = new HashMap<>();
        for (String surname : DATA_BASE.keySet())
        {
            String name = DATA_BASE.get(surname);
            names.put(name, names.getOrDefault(name, 0) + 1);
        }
        Set<String> surnames = new HashSet<String>();
        for (String surname : DATA_BASE.keySet())
            if (names.get(DATA_BASE.get(surname)) > 1)
                surnames.add(surname);
        for (String surname : surnames)
            DATA_BASE.remove(surname);

        System.out.printf("После: %s%n", DATA_BASE);
    }
}