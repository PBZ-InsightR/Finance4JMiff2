package com.pbz4esilv.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Finance4JApp extends Application {

    @Override
    public void start(Stage primaryStage) {

        HBox mainPane = new HBox();

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().add("AXA");
        comboBox.getItems().add("Allianz");
        comboBox.getItems().add("Bred");
        mainPane.getChildren().add(comboBox);

        Button loadButton = new Button("LOAD");
        mainPane.getChildren().add(loadButton);


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