/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eftposmachine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author 12177330
 */
//This class is to Handle Data for the rest of the Application
public class DataHandler {
//initialise varibles and ArrayLists

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

    //prepares for customer file to customer ArrayList
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

    //prepares for stock file to stock ArrayList
    private Stock readStockRecord(StringTokenizer st) {
        int productID = Integer.parseInt(st.nextToken());
        String productName = st.nextToken();
        int productInStock = Integer.parseInt(st.nextToken());
        int productSold = Integer.parseInt(st.nextToken());
        int productTotal = Integer.parseInt(st.nextToken());
        double totalAmountSold = Double.parseDouble(st.nextToken());
        double totalAmountStock = Double.parseDouble(st.nextToken());
        double totalMoney = Double.parseDouble(st.nextToken());

        Stock stock = new Stock(productID, productName, productInStock, productSold, productTotal, totalAmountSold, totalAmountStock, totalMoney);
        System.out.println(stock.toString());
        return stock;
    }

    //prepares for money file to money ArrayList
    private Money readMoneyRecord(StringTokenizer st) {
        double amountStock = Double.parseDouble(st.nextToken());
        double amountSold = Double.parseDouble(st.nextToken());
        double amountCash = Double.parseDouble(st.nextToken());
        double amountCard = Double.parseDouble(st.nextToken());
        double amountTotal = Double.parseDouble(st.nextToken());
        Money money = new Money(amountStock, amountSold, amountCash, amountCard, amountTotal);
        System.out.println(money.toString());
        return money;
    }

    //reads files to respective ArrayList
    private void readDataFiles() {
        System.out.println("Retrieving records from files...");
        //Read customer records from the data file
        try {
            Scanner in = new Scanner(new FileReader(customerFileName)); //open file

            while (in.hasNextLine()) {
                String myEntry = in.nextLine();
                StringTokenizer st = new StringTokenizer(myEntry, ",");

                while (st.hasMoreTokens()) {
                    customerList.add(readCustomerRecord(st));
                }
            }// end of while loop
            in.close();//close file

            int totalCustomerNumber = customerList.size();
            System.out.println("Total number of customer records retrieved: " + totalCustomerNumber);

        } catch (ArrayIndexOutOfBoundsException ex) {

            JOptionPane.showMessageDialog(null, "ArrayOutOfBoundsException: " + ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException ex) {

            JOptionPane.showMessageDialog(null, "FileNotFoundException: " + ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);

        }
        //Read stock records from the data file
        try {
            Scanner in = new Scanner(new FileReader(stockFileName)); //open file

            while (in.hasNextLine()) {
                String myEntry = in.nextLine();
                StringTokenizer st = new StringTokenizer(myEntry, ",");

                while (st.hasMoreTokens()) {
                    stockList.add(readStockRecord(st));
                }
            }// end of while loop
            in.close();//close file

            int totalStockNumber = stockList.size();
            System.out.println("Total number of stock records retrieved: " + totalStockNumber);

        } catch (ArrayIndexOutOfBoundsException ex) {

            JOptionPane.showMessageDialog(null, "ArrayOutOfBoundsException: " + ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException ex) {

            JOptionPane.showMessageDialog(null, "FileNotFoundException: " + ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);

        }
        //Read money records from the data file
        try {
            Scanner in = new Scanner(new FileReader(moneyFileName)); //open file

            while (in.hasNextLine()) {
                String myEntry = in.nextLine();
                StringTokenizer st = new StringTokenizer(myEntry, ",");

                while (st.hasMoreTokens()) {
                    moneyList.add(readMoneyRecord(st));
                }
            }// end of while loop
            in.close();//close file

            int totalMoneyNumber = moneyList.size();
            System.out.println("Total number of money records retrieved: " + totalMoneyNumber);

        } catch (ArrayIndexOutOfBoundsException ex) {

            JOptionPane.showMessageDialog(null, "ArrayOutOfBoundsException: " + ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException ex) {

            JOptionPane.showMessageDialog(null, "FileNotFoundException: " + ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);

        }
    }//end of the readDataFiles method

    //method to save ArrayLists to files
    public void saveDatatoFiles() {
        System.out.println("Saving records to files...");
        //Save customer records to the data file
        try {
            Formatter out = new Formatter(customerFileName);    //open file

            int totalCustomerNumber = customerList.size();

            for (Customer curCustomer : customerList) {
                out.format((curCustomer).toString());
                System.out.println("Customer: " + (curCustomer).toString());
            }

            System.out.println("Total number of customer records saved: " + totalCustomerNumber);

            out.close();//close file
        } catch (SecurityException ex) {
            JOptionPane.showMessageDialog(null, "SecurityException: " + ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "FileNotFoundException: " + ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        //Save stock records to the data file
        try {
            Formatter out = new Formatter(stockFileName);    //open file

            int totalStockNumber = stockList.size();

            for (Stock curStock : stockList) {
                out.format((curStock).toString());
                System.out.println("Stock: " + (curStock).toString());
            }

            System.out.println("Total number of stock records saved: " + totalStockNumber);

            out.close();//close file
        } catch (SecurityException ex) {
            JOptionPane.showMessageDialog(null, "SecurityException: " + ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "FileNotFoundException: " + ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        //Save money records to the data file
        try {
            Formatter out = new Formatter(moneyFileName);    //open file

            int totalMoneyNumber = moneyList.size();

            for (Money curMoney : moneyList) {
                out.format((curMoney).toString());
                System.out.println("Money: " + (curMoney).toString());
            }

            System.out.println("Total number of money records saved: " + totalMoneyNumber);

            out.close();//close file
        } catch (SecurityException ex) {
            JOptionPane.showMessageDialog(null, "SecurityException: " + ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "FileNotFoundException: " + ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//end of the SaveDatatoFiles method 

    //method to add a Customer record from a data entry page
    public void addCustomerRecord(Customer customer) {
        JOptionPane.showMessageDialog(null, "Customer record added");
        customerList.add(customer);
    }

    //method to add a StockCustomer record from a data entry page
    public void addStockRecord(Stock stock) {
        JOptionPane.showMessageDialog(null, "Stock record added");
        stockList.add(stock);
    }

    //method to add a Money record from a data entry page
    public void addMoneyRecord(Money money) {
        JOptionPane.showMessageDialog(null, "Money record added");
        moneyList.add(money);
    }
}
