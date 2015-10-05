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
        //Titre de la fen�tre
        this.setTitle("Index Equity MIF2");
        //Taille de la fen�tre
        this.setSize(1000,700);
        //Centrer la fen�tre
        this.setLocationRelativeTo(null);
        //Fermer la fen�tre avec la croix
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Rend la fen�tre visible
        this.setVisible(true);
    }
}


