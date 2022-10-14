/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eftposmachine;

/**
 *
 * @author 12177330
 */
//This class is used for a Money object
public class Money {
//initialised varibles

    double amountStock;
    double amountSold;
    double amountCash;
    double amountCard;
    double amountTotal;
//constructor

    public Money(double amountStock, double amountSold, double amountCash, double amountCard, double amountTotal) {
        this.amountStock = amountStock;
        this.amountSold = amountSold;
        this.amountCash = amountCash;
        this.amountCard = amountCard;
        this.amountTotal = amountTotal;
    }

    //getters and setters
    public double getAmountStock() {
        return amountStock;
    }

    public void setAmountStock(double amountStock) {
        this.amountStock = amountStock;
    }

    public double getAmountSold() {
        return amountSold;
    }

    public void setAmountSold(double amountSold) {
        this.amountSold = amountSold;
    }

    public double getAmountCash() {
        return amountCash;
    }

    public void setAmountCash(double amountCash) {
        this.amountCash = amountCash;
    }

    public double getAmountCard() {
        return amountCard;
    }

    public void setAmountCard(double amountCard) {
        this.amountCard = amountCard;
    }

    public double getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(double amountTotal) {
        this.amountTotal = amountTotal;
    }

    //String override to release string varible
    @Override
    public String toString() {
        return "Money{" + "amountStock=" + amountStock + ", amountSold=" + amountSold + ", amountCash=" + amountCash + ", amountCard=" + amountCard + ", amountTotal=" + amountTotal + '}';
    }

}
