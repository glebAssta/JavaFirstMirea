package ru.mirea.task8.opt2;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class picture extends JFrame{
    private JLabel pictureLabel;
    private Container controls;

    public picture(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        this.setSize(1200, 800);
        this.startWindow();
    }

    void startWindow(){
        controls = new Container();
        controls = getContentPane();
        controls.setLayout(new FlowLayout());
        pictureLabel = new JLabel(new ImageIcon("C:\\Users\\glebo\\OneDrive\\Рабочий стол\\paint\\K2.png"));
        controls.add(pictureLabel);

    }
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                picture w = new picture();
                w.setVisible(true);
            }
        });
    }

}
