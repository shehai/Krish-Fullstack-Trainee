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
public class NBT extends Handler{
    
     @Override
    public double applyTax(Invoice invoice){
        
        invoice.setTax(invoice.getTax()+invoice.getAmount()*0.02);
        System.out.println("NBT calculated");
        
        if(invoice.getAmount()>100.0 && invoice.getAmount()<=200.0){
        
            return invoice.getTax();
        
        }else{
            return successor.applyTax(invoice);
        
        }
    }
    
}
