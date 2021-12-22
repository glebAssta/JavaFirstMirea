package ru.mirea.task20.opt;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDate
{
    Date date = null;
    private  final  String  TIMEZONE_msc    = "Europe/Moscow";
    private  final  String  DATETIME_format = "yyyy-MM-dd HH:mm";

    public TestDate()
    {
        System.out.println();
        System.out.println("Developer: Goncharov Gleb");

        System.out.print("Time when task appeared: ");
        Calendar start = Calendar.getInstance();
        start.set(Calendar.DATE, 3);
        start.set(Calendar.MONTH, 11);
        start.set(Calendar.YEAR, 2021);
        start.set(Calendar.HOUR_OF_DAY, 11);
        start.set(Calendar.MINUTE, 36);
        date = start.getTime();
        TimeZone tm_msk = TimeZone.getTimeZone(TIMEZONE_msc);
        DateFormat df_msk = new SimpleDateFormat(DATETIME_format);
        df_msk.setTimeZone(tm_msk);
        String date_msk = df_msk.format(date);
        System.out.println(date_msk);

        date = new Date();
        System.out.print("Assignment time: ");
        tm_msk = TimeZone.getTimeZone(TIMEZONE_msc);
        df_msk = new SimpleDateFormat(DATETIME_format);
        df_msk.setTimeZone(tm_msk);
        date_msk = df_msk.format(date);
        System.out.println(date_msk);
    }

    public static void main(String[] args)
    {
        new TestDate();
        System.exit(0);
    }
}