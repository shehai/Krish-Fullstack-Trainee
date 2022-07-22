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
public class Application {
    
    
    
    
   public static void main(String[] args){
       
        Registry registry = new Registry();
    
    Car car = (Car)registry.getVehicle(VehicleType.CAR);
    System.out.println(car);
    
    car.setType("lux");
     System.out.println(car);
     
     Car car1 = (Car)registry.getVehicle(VehicleType.CAR);
    System.out.println(car1);
   
   }
    
   
     
     
    
}
