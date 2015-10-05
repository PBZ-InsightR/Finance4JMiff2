package com.pbz4esilv.model;

import javax.swing.*;

/**
 * Created by ChiChi on 05/10/2015.
 */
public class LauncherGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI fenetre = new GUI();
                fenetre.setVisible(true);
            }
        });
    }
}
