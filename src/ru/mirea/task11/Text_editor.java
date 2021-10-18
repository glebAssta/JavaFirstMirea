package ru.mirea.task11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Text_editor extends JFrame{
    private JPanel panel = new JPanel(new BorderLayout());
    private JTextArea area = new JTextArea("", 8, 20);

    public Text_editor()
    {
        super("Task_11_3");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(300, 300);
        setVisible(true);
        this.startWindow();
    }

    private void startWindow()
    {
        panel.add(area);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createColorMenu());
        menuBar.add(createFontMenu());
        setJMenuBar(menuBar);
        add(panel);
    }

    private JMenu createColorMenu()
    {

        JMenu color = new JMenu("Color");
        JMenuItem black = new JMenuItem("Black");
        JMenuItem red = new JMenuItem("Red");
        JMenuItem green = new JMenuItem("Green");
        color.add(black);
        color.addSeparator();
        color.add(red);
        color.addSeparator();
        color.add(green);

        black.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                area.setForeground(Color.black);
            }
        });
        red.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                area.setForeground(Color.RED);
            }
        });
        green.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                area.setForeground(Color.green);
            }
        });

        return color;
    }

    private JMenu createFontMenu()
    {
        JMenu font = new JMenu("Font");
        JMenuItem var1  = new JMenuItem("Segoe Script BOLD");
        JMenuItem var2  = new JMenuItem("Courier ITALIC");
        JMenuItem var3 = new JMenuItem("TimesRoman PLAIN");
        font.add(var1);
        font.add( new JSeparator());
        font.add(var2);
        font.add( new JSeparator());
        font.add(var3);

        var1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                area.setFont(new Font("Segoe Script", Font.BOLD, 10));
            }
        });
        var2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                area.setFont(new Font("Courier", Font.ITALIC, 15));
            }
        });
        var3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                area.setFont(new Font("TimesRoman", Font.PLAIN, 20));
            }
        });

        return font;
    }

    public static void main (String[] args)
    {
        new Text_editor().setVisible(true);
    }
}
