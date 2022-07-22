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
public class Bus extends Vehicle{

    private int numberofSeats;

    public int getNumberofSeats() {
        return numberofSeats;
    }

    public void setNumberofSeats(int numberofSeats) {
        this.numberofSeats = numberofSeats;
    }

    @Override
    public String toString() {
        return "Bus{" + "numberofSeats=" + numberofSeats + '}';
    }
    
    
}
