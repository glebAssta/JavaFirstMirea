package ru.mirea.task8.opt3;


import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class gif extends JFrame{

    private JLabel gifLabel;
    private Container controls;

    public gif(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.startWindow();
    }

    void startWindow(){
        controls = new Container();
        controls = getContentPane();
        controls.setLayout(new FlowLayout());
        gifLabel = new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().createImage("C:\\Users\\glebo\\Downloads\\NyanCat.gif\\")));
        controls.add(gifLabel);

    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                gif w = new gif();
                w.setVisible(true);
            }
        });
    }
}