/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.eftposmachine;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 * @author 12177330
 */
//this class launches the application
public class EftposMachine extends Application {

    /**
     * This file loads FXML, creates dataHandler Object and launches application
     */
    private static Scene scene;
    private static DataHandler dataHandler;

    //Launchs Menu page and adds text files to DataHandler
    @Override
    public void start(Stage stage) throws IOException {

        //Instantiates the DataHandler object
        dataHandler = new DataHandler("Customer.txt", "Stock.txt", "Money.txt");

        // Loads the Menu scene
        scene = new Scene(loadFXML("FXMLMenu"), 640, 480);
        stage.setScene(scene);
        stage.show();

    }

    // Method for switching scenes
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    //Method for loading FXML files 
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EftposMachine.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    //Method to return a reference to the data handler object  
    public static DataHandler getDataHandler() {
        return dataHandler;
    }

    // Method for exiting the app
    public static void exit() {
        dataHandler.saveDatatoFiles();
        Platform.exit();

    }

    // Main method Launches application
    public static void main(String[] args) {
        launch();
    }

}
