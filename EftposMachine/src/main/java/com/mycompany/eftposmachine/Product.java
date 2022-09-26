/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eftposmachine;

/**
 *
 * @author 12177330
 */
public class Product {
    int productID;
    String productName;
    int productInstock;
    int productSold;
    int productTotal;
    double totalAmountSold;
    double totalAmountStock;
    double totalMoney;

    public Product(int productID, String productName, int productInstock, int productSold, int productTotal, double totalAmountSold, double totalAmountStock, double totalMoney) {
        this.productID = productID;
        this.productName = productName;
        this.productInstock = productInstock;
        this.productSold = productSold;
        this.productTotal = productTotal;
        this.totalAmountSold = totalAmountSold;
        this.totalAmountStock = totalAmountStock;
        this.totalMoney = totalMoney;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductInstock() {
        return productInstock;
    }

    public void setProductInstock(int productInstock) {
        this.productInstock = productInstock;
    }

    public int getProductSold() {
        return productSold;
    }

    public void setProductSold(int productSold) {
        this.productSold = productSold;
    }

    public int getProductTotal() {
        return productTotal;
    }

    public void setProductTotal(int productTotal) {
        this.productTotal = productTotal;
    }

    public double getTotalAmountSold() {
        return totalAmountSold;
    }

    public void setTotalAmountSold(double totalAmountSold) {
        this.totalAmountSold = totalAmountSold;
    }

    public double getTotalAmountStock() {
        return totalAmountStock;
    }

    public void setTotalAmountStock(double totalAmountStock) {
        this.totalAmountStock = totalAmountStock;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", productName=" + productName + ", productInstock=" + productInstock + ", productSold=" + productSold + ", productTotal=" + productTotal + ", totalAmountSold=" + totalAmountSold + ", totalAmountStock=" + totalAmountStock + ", totalMoney=" + totalMoney + '}';
    }
    
    
}
