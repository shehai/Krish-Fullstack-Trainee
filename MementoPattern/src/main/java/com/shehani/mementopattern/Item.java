/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shehani.mementopattern;

/**
 *
 * @author ASUS
 */
public class Item {
    
    String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + '}';
    }
    
    
    
}
