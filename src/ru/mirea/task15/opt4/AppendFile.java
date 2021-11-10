package ru.mirea.task15.opt4;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AppendFile {
    public static void main(String[] args) throws IOException
    {
        File file = new File("X:\\МИРЭА\\Java_pr\\JavaFirstMirea\\src\\ru\\mirea\\task15\\testfile.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);

        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();

        fileOutputStream.write(input.getBytes());

        fileOutputStream.close();
    }
}
