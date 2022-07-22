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
public class PlatinumPackage extends Package{
    
    @Override
     protected  void createPackage(){
     decorations.add(new FlowerGirlDeco()); 
     decorations.add(new ParentDeco());   
     decorations.add(new BridalDeco());
     decorations.add(new BridesMaidDeco());
     
     };
    
}
