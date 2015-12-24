package com.pbz4esilv.gui;

import com.pbz4esilv.model.Equity;
import com.pbz4esilv.model.Index;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainController
{
    @FXML
    private Button closeButton;

    // Reference to the main application.
    private Finance4JApp main;

    /**
     * Is called by the main application to give a reference back to itself.
     *
     * @param mainApp
     */
    public void setMain(Finance4JApp mainApp) {
        this.main = mainApp;
    }

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public MainController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    }

    @FXML
    private void handlePalmares() {
        showPalmares();
    }

    /**
     * Méthode Permettant d'afficher la fenêtre Palmarès
     */
    public void showPalmares() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Finance4JApp.class.getClassLoader().getResource("com/pbz4esilv/gui/Palmares.fxml"));
            AnchorPane palmares = (AnchorPane) loader.load();

            // Create the Palmares Stage.
            Stage fenetre = new Stage();
            fenetre.setTitle("BoursoVinci");
            fenetre.getIcons().add(new Image("file:src/main/resources/images/logo_stocks.png"));
            Scene scene = new Scene(palmares);
            fenetre.setScene(scene);
            fenetre.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Cr�e un index avec les 40 titres du CAC40
    Index indexEquityMainControllerCAC40 =new Index("CAC40",new Date(),1);
}
