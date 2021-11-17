package ru.mirea.task15.opt1;
import java.io.*;
import java.util.Scanner;

public class FileWork {
    public static void main(String[] args) throws IOException
    {
        File file = new File("C:\\Users\\glebo\\OneDrive\\Рабочий стол\\3 семак\\прога\\file.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        fileOutputStream.write(input.getBytes());

        fileOutputStream.close();
    }

}
