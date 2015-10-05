package com.pbz4esilv.model;

import oracle.jrockit.jfr.JFR;

import javax.swing.JFrame;
import javax.swing.JPanel;

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
    }
}


