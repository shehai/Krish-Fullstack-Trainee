/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shehani.chainofresponsibility;

/**
 *
 * @author ASUS
 */
public class Invoice {
    
    private int invoiceNumber;
    private double amount;
    private double tax;

    protected void setTax(double tax) {
        this.tax = tax;
    }

    public Invoice(int invoiceNumber, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
        
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public double getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }
    
    
    
    
    
    
    
}
