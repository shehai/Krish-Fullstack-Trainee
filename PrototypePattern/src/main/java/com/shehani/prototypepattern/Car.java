/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shehani.prototypepattern;

/**
 *
 * @author ASUS
 */
public class Car extends Vehicle {
    
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" + "type=" + type + '}';
    }
    
    
}
