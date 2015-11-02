package com.pbz4esilv.model;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * Created by ChiChi on 05/10/2015.
 */
public class GUI extends JFrame {
    
    public GUI(){
        super();
        build();
    }

    private void build(){
        //Titre de la fenêtre
        this.setTitle("Index Equity MIF2");
        //Taille de la fenêtre
        this.setSize(1000,700);
        //Centrer la fenêtre
        this.setLocationRelativeTo(null);
        //Fermer la fenêtre avec la croix
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Rend la fenêtre visible
        this.setVisible(true);

        //On instancie un objet JPanel qui contiendra nos boutons et autres
        JPanel panel = new JPanel();
        //new GridLayout(0,1)
        //pan.setBackground(Color.BLACK);
        this.setContentPane(panel);

        Border border = BorderFactory.createTitledBorder("Selection");
        panel.setBorder(border);

        //On ajoute une Combobox
        JComboBox combo = new JComboBox();
        combo.setPreferredSize(new Dimension(100,20));
        panel.add(combo);
        //Pour ajouter un index : combo.addItem("index");

        //On ajoute un bouton
        JButton bouton1 = new JButton("LOAD");
        panel.add(bouton1);


        //On ajoute un menu
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);

        JMenu menu = new JMenu();
        //menu.add(menuItem);
        menuBar.add(menu);

        Container contentPane = this.getContentPane();
        contentPane.add(panel, BorderLayout.CENTER);
    }
}


