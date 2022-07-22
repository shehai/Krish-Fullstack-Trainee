/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shehani.builderpattern;

/**
 *
 * @author ASUS
 */
public class CarTelescopic2 {
     String insurnace;
    Boolean etc;
    String roadAssistance;
    String dropOffLocation;

    public CarTelescopic2(String insurnace, Boolean etc, String roadAssistance, String dropOffLocation) {
        this.insurnace = insurnace;
        this.etc = etc;
        this.roadAssistance = roadAssistance;
        this.dropOffLocation = dropOffLocation;
    }
    
    

    public CarTelescopic2(String insurnace, Boolean etc, String roadAssistance) {
        this(insurnace,etc,roadAssistance,null);
    }

    public CarTelescopic2(String insurnace, Boolean etc) {
        this(insurnace,etc,null);
    }

    public CarTelescopic2(String insurnace) {
        this(insurnace,null);
    }

    @Override
    public String toString() {
        return "CarTelescopic2{" + "insurnace=" + insurnace + ", etc=" + etc + ", roadAssistance=" + roadAssistance + ", dropOffLocation=" + dropOffLocation + '}';
    }
    
    
}
