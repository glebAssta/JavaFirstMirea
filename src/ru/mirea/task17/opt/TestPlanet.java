package ru.mirea.task17.opt;
import com.sun.source.util.Plugin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.temporal.JulianFields;

enum Planet
{
    Mercury(3.302, 2440), Venus(48.69, 6052), Earth(59.74, 6378), Mars(6.419, 3397), Jupiter(18990, 71490), Saturn(5685, 60270), Uranus(868.5, 25560), Neptune(1024, 24760), Pluto(0.13, 1151);

    private double mass;
    private int radius;

    Planet(double m, int r)
    {
        mass = m;
        radius = r;
    }

    double getMass()
    {
        return mass;
    }

    int getRadius()
    {
        return radius;
    }

    double getGravityForce()
    {
        return 6.67 * getMass() / getRadius() / getRadius() * 1000000;
    }
}

public class TestPlanet extends JFrame
{
    JLabel label = new JLabel("");
    private JPanel panel = new JPanel();
    private BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
    private Planet obj;

    public TestPlanet()
    {
        super("Task_17");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(300, 300);
        this.startWindow();
    }

    private void startWindow()
    {
        panel.setLayout(boxLayout);
        panel.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(label);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createPlanetMenu());
        setJMenuBar(menuBar);

        add(panel);
    }

    private JMenu createPlanetMenu()
    {
        JMenu planet = new JMenu("Planet");
        JMenuItem mercury = new JMenuItem("Mercury");
        JMenuItem venus = new JMenuItem("Venus");
        JMenuItem earth = new JMenuItem("Earth");
        JMenuItem mars = new JMenuItem("Mars");
        JMenuItem jupiter = new JMenuItem("jupiter");
        JMenuItem saturn = new JMenuItem("Saturn");
        JMenuItem uranus = new JMenuItem("Uranus");
        JMenuItem neptune = new JMenuItem("Neptune");
        JMenuItem pluto = new JMenuItem("Pluto");
        planet.add(mercury);
        planet.addSeparator();
        planet.add(venus);
        planet.addSeparator();
        planet.add(earth);
        planet.addSeparator();
        planet.add(mars);
        planet.addSeparator();
        planet.add(jupiter);
        planet.addSeparator();
        planet.add(saturn);
        planet.addSeparator();
        planet.add(uranus);
        planet.addSeparator();
        planet.add(neptune);
        planet.addSeparator();
        planet.add(pluto);

        mercury.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                obj = Planet.Mercury;
                label.setText(obj + " Gravity Force is " + obj.getGravityForce());
            }
        });
        venus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                obj = Planet.Venus;
                label.setText(obj + " Gravity Force is " + obj.getGravityForce());
            }
        });
        earth.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                obj = Planet.Earth;
                label.setText(obj + " Gravity Force is " + obj.getGravityForce());
            }
        });
        mars.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                obj = Planet.Mars;
                label.setText(obj + " Gravity Force is " + obj.getGravityForce());
            }
        });
        jupiter.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                obj = Planet.Jupiter;
                label.setText(obj + " Gravity Force is " + obj.getGravityForce());
            }
        });
        saturn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                obj = Planet.Saturn;
                label.setText(obj + " Gravity Force is " + obj.getGravityForce());
            }
        });
        uranus.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                obj = Planet.Uranus;
                label.setText(obj + " Gravity Force is " + obj.getGravityForce());
            }
        });
        neptune.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                obj = Planet.Neptune;
                label.setText(obj + " Gravity Force is " + obj.getGravityForce());
            }
        });
        pluto.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                obj = Planet.Pluto;
                label.setText(obj + " Gravity Force is " + obj.getGravityForce());
            }
        });

        return planet;
    }

    public static void main(String[] args)
    {
        new TestPlanet().setVisible(true);
    }
}