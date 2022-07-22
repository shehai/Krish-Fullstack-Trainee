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
public class Tax extends Handler {
    
     public double applyTax(Invoice invoice){
     
     return successor.applyTax(invoice);
     }
    
}
