/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eftposmachine;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.IOException;

/**
 *
 * @author 12177330
 */
//Controller class for the menu scene 
public class FXMLMenuController {

    //Action event handler for the Display Customer History button 
    @FXML
    private void handleButtonCustomerHisAction(ActionEvent event) throws Exception {
        System.out.println("You clicked on Customer History!");
        // Switch to the Customer History scene 
        try {
            EftposMachine.setRoot("FXMLCustomerDisplay");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    //Action event handler for the Display Order History button 
    @FXML
    private void handleButtonOrderHisAction(ActionEvent event) throws Exception {
        System.out.println("You clicked on Order History!");
        // Switch to the Order History scene 
        try {
            EftposMachine.setRoot("FXMLOrderHistory");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    //Action event handler for the Search Owner button 
    @FXML
    private void handleButtonStockDisAction(ActionEvent event) throws Exception {
        System.out.println("You clicked on Stock Display!");
        // Switch to the Display Product Stock scene 
        try {
            EftposMachine.setRoot("FXMLStckDisplay");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    //Action event handler for the Enter Order button 
    @FXML
    private void handleButtonOrderEntAction(ActionEvent event) throws Exception {
        System.out.println("You clicked on Order Entry!");
        //Switch to the Order Entry scene 
        try {
            EftposMachine.setRoot("FXMLOrderEntry");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    //Action event handler for the Enter New Stock button 
    @FXML
    private void handleButtonStockEntAction(ActionEvent event) throws Exception {
        System.out.println("You clicked on Order Entry!");
        //Switch to the Stock Entry scene 
        try {
            EftposMachine.setRoot("FXMLStockEntry");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    //Action event handler for the Exit button
    @FXML
    private void handleButtonExitAction(ActionEvent event) {
        System.out.println("You clicked on Exit!");
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to Close?");

        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {

                EftposMachine.exit();
            }
        });

    }

}
