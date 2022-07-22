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
public class SSF extends Handler {
    
     @Override
    public double applyTax(Invoice invoice){
        
        invoice.setTax(invoice.getTax()+invoice.getAmount()*0.04);
        System.out.println("SSF calculated");
        
        return invoice.getTax();
    }
    
    
    
    
}
