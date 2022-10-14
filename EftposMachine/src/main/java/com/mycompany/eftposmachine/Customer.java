/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eftposmachine;

/**
 *
 * @author 12177330
 */
public class Customer {
    int customerID;
    String customerName;
    int customerPh;
    int amountOfPurchases;
    double totalMoneySpent;

    public Customer(int customerID, String customerName, int customerPh, int amountOfPurchases, double totalMoneySpent) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPh = customerPh;
        this.amountOfPurchases = amountOfPurchases;
        this.totalMoneySpent = totalMoneySpent;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerPh() {
        return customerPh;
    }

    public void setCustomerPh(int customerPh) {
        this.customerPh = customerPh;
    }

    public int getAmountOfPurchases() {
        return amountOfPurchases;
    }

    public void setAmountOfPurchases(int amountOfPurchases) {
        this.amountOfPurchases = amountOfPurchases;
    }

    public double getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(double totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }

    @Override
    public String toString() {
        return "customerID=" + customerID + ", customerName=" + customerName + ", customerPh=" + customerPh + ", amountOfPurchases=" + amountOfPurchases + ", totalMoneySpent=" + totalMoneySpent;
    }
}
