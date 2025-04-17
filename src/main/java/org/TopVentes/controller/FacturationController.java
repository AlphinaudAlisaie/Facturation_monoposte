package org.TopVentes.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import org.TopVentes.model.*;

public class FacturationController extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Facturation");
        Vendeur vendeur = new Vendeur();
        Facturation facturation1 = new Facturation(vendeur, new Acheteur(), new Transaction());

        TabPane root = new TabPane();
        Tab tabOfFacturation = new Tab();
        tabOfFacturation.setText("Facturation 1");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/Facturation.fxml"));
        fxmlLoader.setControllerFactory(new Callback<Class<?>, Object>() {
            @Override
            public Object call(Class<?> param) {
                FacturationGraphicalController facturationGraphicalController = new FacturationGraphicalController(facturation1);
                return facturationGraphicalController;
            }
        });
        tabOfFacturation.setContent(fxmlLoader.load());
        root.getTabs().add(tabOfFacturation);

        Scene scene = new Scene(root, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
