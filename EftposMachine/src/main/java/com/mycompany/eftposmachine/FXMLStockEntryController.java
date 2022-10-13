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
 * 
 * 
 */
public class FXMLStockEntryController implements Initializable {

    //Instance variables for the UI controls 
    @FXML
    private TextField tfProductID;
    
    @FXML
    private TextField tfProductName;
    
    @FXML
    private TextField tfProductQuantity;
    
    @FXML
    private TextArea taStockDis;
    
    DataHandler data; //Instance variable to hold a reference to the DataHandler object
    
    //Method to clear all fields on the scene
    private void clearAllFields()
    {
        tfProductID.clear();
        tfProductName.clear();
        tfProductQuantity.clear();
        taStockDis.clear();
    }     
    
    //Action event handler for the Back button on the Private Owner tab 
    @FXML
    private void handleButtonExitAction (ActionEvent event) throws Exception  {
        System.out.println("You have pressed the Back button!");
        
        clearAllFields();
        
        try {
            EftposMachine.setRoot("FXMLMenu");
        } catch (IOException e){
           System.out.println(e); 
        }

    }
    //Action handler for the add product to order button
    @FXML
    private void handleButtonAddProduct (ActionEvent event) throws Exception {
        
    }
    //action handler for the save purchase button
    @FXML
    private void handleButtonSavePurchase (ActionEvent event) throws Exception{
        //save data to the arraylist
        data.saveDatatoFiles();  
    }
  
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        data = EftposMachine.getDataHandler(); //Assigns the Data Handler object reference to an instance variable
    }    
    
}



