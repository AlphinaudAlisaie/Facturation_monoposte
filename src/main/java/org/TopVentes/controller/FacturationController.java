package org.TopVentes.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;
import org.TopVentes.model.Facturation;

import java.awt.desktop.AppEvent;

public class FacturationController extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Facturation");
       // Facturation facturation1 = new Facturation();

        TabPane root = new TabPane();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/Facturation.fxml"));

        Tab tabOfFacture1 = new Tab();
        tabOfFacture1.setText("Facture 1");
        tabOfFacture1.setContent(fxmlLoader.load());

        Scene scene = new Scene(root, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
