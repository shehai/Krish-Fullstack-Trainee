/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shehani.singleton;
import java.sql.Connection;

/**
 *
 * @author ASUS
 */
public class Singleton {
     public static void main(String[] args) {
        // TODO code application logic here
        
        long start;
        long end;
        
        DBManager dbManager = DBManager.getDBmanager();
        System.out.println(dbManager);
        
        
        start=System.currentTimeMillis();
        Connection connection = dbManager.getConnection();
        end=System.currentTimeMillis();
        
        System.out.println(end-start);
        
        DBManager dbManager1= DBManager.getDBmanager();
         System.out.println(dbManager1);
          start=System.currentTimeMillis();
        Connection connection1 = dbManager1.getConnection();
        end=System.currentTimeMillis();
           System.out.println(end-start);
       
        
       
    }
    
    
}
