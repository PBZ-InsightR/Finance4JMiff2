package com.pbz4esilv.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Finance4JApp extends Application {
    ComboBox<String> comboBox;
    Button loadButton;


    @Override
    public void start(Stage primaryStage) throws IOException {

        Pane mainPane = FXMLLoader.load(getClass().getResource("Finance4J.fxml"));

        HBox hbox = (HBox) mainPane.getChildren().get(0);

        comboBox = (ComboBox<String>) hbox.getChildren().get(0);
        comboBox.getItems().add("AXA");
        comboBox.getItems().add("Allianz");
        comboBox.getItems().add("Bred");


        loadButton = (Button) hbox.getChildren().get(1);
        loadButton.setText("LOAD");


        loadButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });


        Scene scene = new Scene(mainPane, 1000, 700);

        primaryStage.setTitle("Index Equity MIF2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}