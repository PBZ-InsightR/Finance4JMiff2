package com.pbz4esilv.gui;

import com.pbz4esilv.model.Equity;
import com.pbz4esilv.model.Index;
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
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Callback;


import javax.swing.*;
import java.io.IOException;
import java.util.*;

public class Finance4JApp extends Application {

    static class XCell extends ListCell<String> {
        List<Equity> listeq;
        HBox hbox = new HBox();
        Label label = new Label("(empty)");
        Label label2= new Label("(empty)");
        Pane pane = new Pane();
        Button button = new Button("(>)");
        Button button2 = new Button("(>)");
        String lastItem;

        public XCell(List<Equity> listeq) {
            super();
            System.out.println(lastItem+"1");
            /*for(final Equity x: listeq) {
                //if(lastItem==x.getName()) {
                    System.out.println(label);
                    String value = x.getTicker();
                    label2.setText(value);
               // }

            }*/
            this.listeq=listeq;
            hbox.getChildren().addAll(label, label2, pane, button, button2);
            System.out.println(lastItem+"2");
            HBox.setHgrow(pane, Priority.ALWAYS);
            System.out.println(lastItem+"3");
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

                for(final Equity x: listeq) {
                    if(Objects.equals(item, x.getName()))
                    {
                    System.out.println(label);
                    String value = x.getTicker();
                    label2.setText(" Ticker : "+value);
                    }

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
    }

    public static void main(String[] args) {
        launch(args);
    }
}

