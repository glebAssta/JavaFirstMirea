package ru.mirea.task11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouse extends JFrame{
    private JPanel panel = new JPanel();

    public mouse(){
        super("угадайка");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setSize(600, 600);
        setVisible(true);
        this.start();
    }
    private void start(){
        JButton button_south = new JButton("Это южная сторона");
        button_south.setBorder(BorderFactory.createMatteBorder(2, 4, 4, 4, Color.RED));
        button_south.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(mouse.this, "Now u in da south");
            }
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JButton button_western = new JButton("это западная сторона");
        button_western.setBorder(BorderFactory.createMatteBorder(2, 4, 2, 2, Color.RED));
        button_western.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(mouse.this, "Now u in da west");
            }
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JButton button_center = new JButton("это центр");
        button_center.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
        button_center.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(mouse.this, "Now u in da center");
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        JButton button_north = new JButton("это северная сторона");
        button_north.setBorder(BorderFactory.createMatteBorder(4, 4, 2, 4, Color.RED));
        button_north.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(mouse.this, "Now u in da south");
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        JButton button_east = new JButton("это восточная сторона");
        button_east.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 4, Color.RED));
        button_east.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(mouse.this, "Now u in da north");
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        panel.add(button_western, BorderLayout.WEST);
        panel.add(button_south, BorderLayout.SOUTH);
        panel.add(button_east, BorderLayout.EAST);
        panel.add(button_center, BorderLayout.CENTER);
        panel.add(button_north, BorderLayout.NORTH);
        add(panel);
    }
    public static void main(String[] args) {
        new mouse().setVisible(true);
    }
}
