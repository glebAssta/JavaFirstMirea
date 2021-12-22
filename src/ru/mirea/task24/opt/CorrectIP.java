package ru.mirea.task24.opt;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class CorrectIP
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String ip;
        System.out.println("Enter IPv4:");
        ip = scanner.nextLine();
        String regex = "^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ip);
        System.out.println(ip +" : "+ matcher.matches());
    }
}