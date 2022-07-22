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
public class PackageFactory {
    
    public static Package createPackage(PackageCode packageCode){
    
        switch(packageCode){
        
            case BASIC:
                return new BasicPackage();
                
            case SILVER:
                return new SilverPackage();
                
            case PLATINUM:
                return new PlatinumPackage();
            default:
                return null;
                
        }
    
    }
    
}
