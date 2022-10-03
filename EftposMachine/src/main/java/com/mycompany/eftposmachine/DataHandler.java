/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eftposmachine;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author 12177330
 */
public class DataHandler {
    private final String customerFileName;
    private final String stockFileName;
    private final String moneyFileName;
    private final ArrayList<Customer> customerList;
    private final ArrayList<Stock> stockList;
    private final ArrayList<Money> moneyList;
    
    //Constructor method
    public DataHandler(String customerFileName, String stockFileName, String moneyFileName) {
        this.customerFileName = customerFileName;
        this.stockFileName = stockFileName;
        this.moneyFileName = moneyFileName;
        this.customerList = new ArrayList<>();
        this.stockList = new ArrayList<>();
        this.moneyList = new ArrayList<>();
        readDataFiles();
    }


    private Customer readCustomerRecord(StringTokenizer st) {
        int customerID = Integer.parseInt(st.nextToken());
        String customerName = st.nextToken();
        int customerPh = Integer.parseInt(st.nextToken());
        int amountOfPurchases = Integer.parseInt(st.nextToken());
        double totalMoneySpent = Double.parseDouble(st.nextToken());

        Customer customer = new Customer(customerID, customerName, customerPh, amountOfPurchases, totalMoneySpent);
        System.out.println(customer.toString());
        return customer;
    }


    private Stock readStockRecord(StringTokenizer st) {
        int productID = Integer.parseInt(st.nextToken());
        String productName = st.nextToken();
        int productInStock = Integer.parseInt(st.nextToken());
        int productSold = Integer.parseInt(st.nextToken());
        int productTotal = Integer.parseInt(st.nextToken());
        double totalAmountSold = Double.parseDouble(st.nextToken());
        double totalAmountStock = Double.parseDouble(st.nextToken());
        double totalMoney = Double.parseDouble(st.nextToken());

        Stock stock = new Stock(productID, productName, productInStock, productSold, productTotal,totalAmountSold,totalAmountStock,totalMoney);
        System.out.println(stock.toString());
        return stock;
    }
    
    private Money readMoneyRecord(StringTokenizer st) {
        double amountStock = Double.parseDouble(st.nextToken());
        double amountSold = Double.parseDouble(st.nextToken());
        double amountCash = Double.parseDouble(st.nextToken());
        double amountCard = Double.parseDouble(st.nextToken());
        double amountTotal = Double.parseDouble(st.nextToken());
        Money money = new Money(amountStock,amountSold, amountCash, amountCard,amountTotal);
        System.out.println(money.toString());
        return money;
    }

    private void readDataFiles() {
        System.out.println("Retrieving records from files...");

    }//end of the readDataFiles method


    public void saveDatatoFiles() {
        System.out.println("Saving records to files...");

    }//end of the SaveDatatoFiles method 


    public void addCustomerRecord() {

    }

    public void addStockRecord() {

    }
    
    public void addMoneyRecord() {

    }

}
