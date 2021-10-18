package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Guesska extends JFrame {

    private JPanel panel = new JPanel();
    private int n = (int) (Math.random()*20);
    JLabel label1 = new JLabel("Попробуй угадай,n число от 0 до 20");
    private int count = 0;
    private boolean flag = false;

    public Guesska(){
        super("угадайка");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setSize(600, 600);
        setVisible(true);
        this.start();
    }

    private void start(){

        JTextField smallField;
        smallField = new JTextField(15);
        panel.add(smallField);

        JButton button_set = new JButton("Точняк это число");
        button_set.addActionListener(e -> {
            count ++;
            if (count < 3){
                if(flag){
                    JOptionPane.showMessageDialog(Guesska.this, "You have already won!");
                    flag = true;
                }
                else{
                    JOptionPane.showMessageDialog(Guesska.this, "You Looser!");
                }
            }
            else if(Integer.parseInt(smallField.getText()) == n){
                JOptionPane.showMessageDialog(Guesska.this,"You won");
            }
            else {
                if(Integer.parseInt(smallField.getText()) < n){
                    JOptionPane.showMessageDialog(Guesska.this,"You loose, your number smaller then mine");
                }
                else if(Integer.parseInt(smallField.getText()) > n){
                    JOptionPane.showMessageDialog(Guesska.this,"You loose, your number bigger then mine");
                }
                else if(flag){
                    JOptionPane.showMessageDialog(Guesska.this,"You have already won!");
                }
            }
            if(count == 3){
                JOptionPane.showMessageDialog(Guesska.this,"You total looser");
                System.exit(0);
            }
        });
        panel.add(button_set);
        panel.add(label1);
        add(panel);
    }
    public static void main(String[] args) {
        new Guesska();
    }
}
