package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Matches extends JFrame{

    private JPanel panel = new JPanel();

    private int count_Milan = 0;
    private int count_Madrid = 0;
    private BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

    JLabel label1 = new JLabel("Result: 0 X 0");
    JLabel label2 = new JLabel("Last Scorer:");
    JLabel label3 = new JLabel("Winner: DRAW");

    public Matches(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(300, 300);
        setVisible(true);
        this.start();

    }
    private void start(){
        panel.setLayout(boxLayout);

        JButton button_Milan = new JButton("Milan");
        button_Milan.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                count_Milan+=1;
                label1.setText("Result:" + count_Milan +"X" + count_Madrid);
                label2.setText("Last Scorer: Milan");
                if (count_Madrid < count_Milan){
                    label3.setText("Winner: Milan");
                }
                else
                if (count_Madrid > count_Milan){
                    label3.setText("Winner: Madrid");
                }
                else
                {
                    label3.setText("Winner: Draw");
                }
                panel.add(label1);
                panel.add(label2);
                panel.add(label3);
            }
        });

        JButton button_Madrid = new JButton("Madrid");
        button_Madrid.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                count_Madrid+=1;
                label1.setText("Result:" + count_Milan +"X" +count_Madrid);
                label2.setText("Last Scorer:" + "Madrid");
                if (count_Madrid < count_Milan){
                    label3.setText("Winner: Milan");
                }
                else
                if (count_Madrid > count_Milan){
                    label3.setText("Winner: Madrid");
                }

                else
                {
                    label3.setText("Winner: Draw");
                }
                panel.add(label1);
                panel.add(label2);
                panel.add(label3);

            }
        });
        panel.add(button_Milan);
        panel.add(button_Madrid);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        add(panel);

    }
    public static void main (String[] args)
    {
        new Matches().setVisible(true);
    }
}
