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
public class VAT extends Handler{
    
    @Override
    public double applyTax(Invoice invoice){
        
        invoice.setTax(invoice.getTax()+ invoice.getAmount()*0.01);
        System.out.println("VAT calculated");
        
        if(invoice.getAmount()<=100){
        
            return invoice.getTax();
        
        }else{
            return successor.applyTax(invoice);
        
        }
        
       
    
    }
    
    
    
}
