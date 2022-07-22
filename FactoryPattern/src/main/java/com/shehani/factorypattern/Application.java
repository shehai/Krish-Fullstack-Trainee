/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shehani.factorypattern;

/**
 *
 * @author ASUS
 */
public class Application {
    
    public static void main(String[] args){
    
    Package aPackage=PackageFactory.createPackage(PackageCode.BASIC);
    System.out.println(aPackage);
    
     Package bPackage=PackageFactory.createPackage(PackageCode.PLATINUM);
    System.out.println(bPackage);
    
    }
    
}
