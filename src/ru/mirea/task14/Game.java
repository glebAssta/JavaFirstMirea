package ru.mirea.task14;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Deque<Integer> first_player = new ArrayDeque<Integer>();
        Deque<Integer> second_player = new ArrayDeque<Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите карты первого игрока: ");
        for (int i = 0; i < 5; ++i)
            first_player.addLast(sc.nextInt());

        System.out.println("Введите карты второго игрока: ");
        for (int i = 0; i < 5; ++i)
            second_player.addLast(sc.nextInt());

        System.out.println("Рука первого: " + first_player);
        System.out.println("Рука второго: " + second_player);
        int count_move = 0;
        boolean victory = false;
        for (int i = 0, card_first, card_second; i < 106; ++i)
        {
            card_first = first_player.pop();
            card_second = second_player.pop();
            if ((card_first > card_second) && (card_first != 9 && card_second == 0) || (card_first == 0 && card_second == 9))
            {
                first_player.addLast(card_first);
                first_player.addLast(card_second);
            }
            else
            {
                second_player.addLast(card_second);
                second_player.addLast(card_first);
            }

            if (first_player.isEmpty())
            {
                System.out.println("second");
                System.out.println("Количество ходов: " + Integer.toString(count_move + 1));
                victory = true;
                break;
            }
            else if (second_player.isEmpty())
            {
                System.out.println("first");
                System.out.println("Количество ходов: " + Integer.toString(count_move + (int)1));
                victory = true;
                break;
            }
            count_move++;
        }

        if (!victory)
        {
            System.out.println("botva");
            System.out.println("Количество ходов: " + count_move);
        }
    }
}
