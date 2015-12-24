package com.pbz4esilv.gui;

import com.pbz4esilv.model.Equity;
import com.pbz4esilv.model.Index;
import com.sun.org.apache.xpath.internal.operations.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Callback;


import javax.swing.*;
import java.io.IOException;
import java.lang.String;
import java.util.*;

public class Finance4JApp extends Application {

    private Stage primaryStage;
    private Pane rootLayout;

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public Finance4JApp() {}

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("BoursoVinci");
        this.primaryStage.getIcons().add(new Image("file:src/main/resources/images/logo_stocks.png"));
        initAccueil();
    }

    /**
     * Initialize la page d'accueil
     */
    public void initAccueil() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Finance4JApp.class.getClassLoader().getResource("com/pbz4esilv/gui/Finance4J.fxml"));
            rootLayout = (Pane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

            // Give the controller access to the main app.
            MainController controller = loader.getController();
            controller.setMain(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    static class XCell extends ListCell<String> {

        List<Equity> listeq;
        HBox hbox = new HBox();
        Label label = new Label("(empty)");
        Label label2= new Label("(empty)");
        Label label3= new Label("(empty)");
        Pane pane = new Pane();
        Button button = new Button("(>)");
        Button button2 = new Button("(>)");
        String lastItem;

        public XCell(List<Equity> listeq) {
            super();
            this.listeq=listeq;
            hbox.getChildren().addAll(label, label2,label3, pane, button, button2);
            HBox.setHgrow(pane, Priority.ALWAYS);
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println(lastItem + " : " + event);
                }
            });
        }

        @Override
        public void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
            label.setText(null);  // No text in label of super class
            if (empty) {
                lastItem = null;
                setGraphic(null);
            } else {
                lastItem = item;
                label.setText(item != null ? item : "<null>");

                for(final Equity x: listeq)
                    if (Objects.equals(item, x.getName())) {
                        System.out.println(label);
                        String value = x.getTicker();
                        String value2;
                        value2 = String.valueOf(x.getPrice());
                        label2.setText(", Ticker : " + value);
                        label3.setText(", Price : " + value2);
                    }
                setGraphic(hbox);
            }
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();
        Scene scene = new Scene(pane, 300, 150);
        primaryStage.setScene(scene);
        ObservableList<String> list = FXCollections.observableArrayList();
        Index indexEquityMainControllerCAC40 =new Index("CAC40",new Date(),1);
        for(final Equity x: indexEquityMainControllerCAC40.getList()) {
            list.add(x.getName());

        }
            ListView<String> lv = new ListView<>(list);
        lv.setCellFactory(new Callback<ListView<String>, ListCell<String>>() {
            @Override
            public ListCell<String> call(ListView<String> param) {
                return new XCell(indexEquityMainControllerCAC40.getList());
            }
        });
        pane.getChildren().add(lv);
        primaryStage.show();
        */


    public static void main(String[] args) {
        launch(args);
    }
}

