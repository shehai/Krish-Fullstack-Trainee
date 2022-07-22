/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shehani.factorypattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public abstract class Package {
    
    protected List<Decoration> decorations = new ArrayList<>();
    
    public Package(){
        createPackage();
    }
    
    protected abstract void createPackage();
    
    @Override
    public String toString(){
    
        return "Package{"+"decorations="+decorations+'}';
    
    }
    
    
}
