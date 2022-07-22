/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shehani.mementopattern;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class CareTaker {
    
    Stack<Cart.CartMomemnto> history =new Stack();
    
    public void save(Cart cart){
    
        history.push(cart.save());
    
    }
    
    public void revert(Cart cart){
    
            if(!history.isEmpty()){
                cart.revert(history.pop());
            
            
            }else{
            
                System.out.println("Cannot undo");
            
            }
    
    }
    
   
}
