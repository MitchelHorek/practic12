package com.company;

import javax.swing.*;
import javax.swing.plaf.ComboBoxUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main extends JFrame implements ItemListener {
    JComboBox box;
    JButton button = new JButton("Click me,pls");

    Main(){
        super("ПРиветик, планеты");
        setLayout(new FlowLayout());
        setSize(100,100);
        setLocation(new Point(400,400));
        Planet mass[] = Planet.values();
        String masString[]=new String[mass.length];
        for(int i= 0; i<mass.length;i++){
            masString[i] = mass[i].name();
        }
        box = new JComboBox(masString);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int index = box.getSelectedIndex();
                JOptionPane.showMessageDialog(null,Planet.values()[index].getGravitaion());

            }
        });

        add(box);
        add(button);
        setVisible(true);
        setResizable(false);

    }

    public static void main(String[] args) {
        new Main();

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println("text");


    }
}
