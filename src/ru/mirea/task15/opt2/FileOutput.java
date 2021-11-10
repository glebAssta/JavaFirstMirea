package ru.mirea.task15.opt2;
import java.io.*;

public class FileOutput {
    public static void main(String[] args) throws IOException
    {
        File file = new File("X:\\МИРЭА\\Java_pr\\JavaFirstMirea\\src\\ru\\mirea\\task15\\testfile.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        int i;
        while( (i = fileInputStream.read()) != -1 )
        {
            System.out.print( (char)i );
        }

        fileInputStream.close();
    }
}
