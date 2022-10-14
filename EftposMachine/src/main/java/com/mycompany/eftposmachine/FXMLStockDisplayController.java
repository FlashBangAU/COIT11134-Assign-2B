/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eftposmachine;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author 12177330
 */
//class to display stock in Application
public class FXMLStockDisplayController implements Initializable {

    //Instance variables for the UI controls 
    @FXML
    private TextArea taStockDisplay;

    DataHandler data; //Instance variable to hold a reference to the DataHandler object

    //Method to clear all fields on the scene
    private void clearAllFields() {
        taStockDisplay.clear();
    }

    //Action event handler for the Back button
    @FXML
    private void handleButtonExitAction(ActionEvent event) throws Exception {
        System.out.println("You have pressed the Back button!");

        clearAllFields();

        try {
            EftposMachine.setRoot("FXMLMenu");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        data = EftposMachine.getDataHandler(); //Assigns the Data Handler object reference to an instance variable
    }

}
