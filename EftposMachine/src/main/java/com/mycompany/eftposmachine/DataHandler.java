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

        Stock stock = new Stock(productID, productName, productInStock, productSold, productTotal, totalAmountSold, totalAmountStock, totalMoney);
        System.out.println(stock.toString());
        return stock;
    }

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

    public void saveDatatoFiles() {
        System.out.println("Saving records to files...");
        //Save customer records to the data file
        try
        {
            Formatter out = new Formatter(customerFileName);    //open file
       
            int totalCustomerNumber = customerList.size();
        
               
            for (Customer curCustomer:customerList)
            {   
                    out.format((curCustomer).toString());
                    System.out.println("Customer: " + (curCustomer).toString());    
            }
            
            System.out.println("Total number of customer records saved: " + totalCustomerNumber);

            out.close();//close file
           } catch(SecurityException ex)  {
                 JOptionPane.showMessageDialog(null,"SecurityException: "+ ex.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
           }  catch(FileNotFoundException ex)   {
                 JOptionPane.showMessageDialog(null,"FileNotFoundException: " + ex.getMessage(), "Error",JOptionPane.INFORMATION_MESSAGE);
        }
        //Save stock records to the data file
        try
        {
            Formatter out = new Formatter(stockFileName);    //open file
       
            int totalStockNumber = stockList.size();
        
               
            for (Stock curStock:stockList)
            {   
                    out.format((curStock).toString());
                    System.out.println("Stock: " + (curStock).toString());    
            }
            
            System.out.println("Total number of stock records saved: " + totalStockNumber);

            out.close();//close file
           } catch(SecurityException ex)  {
                 JOptionPane.showMessageDialog(null,"SecurityException: "+ ex.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
           }  catch(FileNotFoundException ex)   {
                 JOptionPane.showMessageDialog(null,"FileNotFoundException: " + ex.getMessage(), "Error",JOptionPane.INFORMATION_MESSAGE);
        }
        //Save money records to the data file
        try
        {
            Formatter out = new Formatter(moneyFileName);    //open file
       
            int totalMoneyNumber = moneyList.size();
        
               
            for (Money curMoney:moneyList)
            {   
                    out.format((curMoney).toString());
                    System.out.println("Money: " + (curMoney).toString());    
            }
            
            System.out.println("Total number of money records saved: " + totalMoneyNumber);

            out.close();//close file
           } catch(SecurityException ex)  {
                 JOptionPane.showMessageDialog(null,"SecurityException: "+ ex.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
           }  catch(FileNotFoundException ex)   {
                 JOptionPane.showMessageDialog(null,"FileNotFoundException: " + ex.getMessage(), "Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }//end of the SaveDatatoFiles method 

    public void addCustomerRecord(Customer customer) {
        System.out.println("Record was added: " + ((Customer)customer).toString());
        customerList.add(customer);
    }

    public void addStockRecord(Stock stock) {
        System.out.println("Record was added: " + ((Stock)stock).toString());
        stockList.add(stock);
    }

    public void addMoneyRecord(Money money) {
        System.out.println("Record was added: " + ((Money)money).toString());
        moneyList.add(money);
    }
    //method to create the files
  /*  public void createFiles(){
        //create money file
        try{
            File moneyFile = new File("Money.txt");//creates object of file
            if(moneyFile.exists()){//checks if file exists
                 
            }
            else{
                moneyFile.createNewFile();//makes the new file
                JOptionPane.showMessageDialog(null, "File has been made");
            }
            
        }catch(IOException e){
              JOptionPane.showMessageDialog(null,"IOException: " + e.getMessage(), "Error",JOptionPane.INFORMATION_MESSAGE);
            
        }
        //create stock file
        try {
            File stockFile = new File("Stock.txt");//create object of stock file
            if (stockFile.exists()) {//checks if the file exists
                
            } else {
                stockFile.createNewFile();//creates the new file
                JOptionPane.showMessageDialog(null, "File has been made");
            }
        } catch (IOException e) {
             JOptionPane.showMessageDialog(null,"IOException: " + e.getMessage(), "Error",JOptionPane.INFORMATION_MESSAGE);
        }
        //create customer file
        try {
            File customerFile = new File("Customer.txt");//creates object of file
            if (customerFile.exists()) {//checks if the file exists
                
            } else {
                customerFile.createNewFile();//makes the new file
                JOptionPane.showMessageDialog(null, "File has been made");
                
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"IOException: " + e.getMessage(), "Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }*/

}
