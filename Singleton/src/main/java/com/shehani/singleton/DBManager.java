/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shehani.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class DBManager {
    
       private static volatile DBManager dbManager ;//= new DBManager();
    private static volatile Connection connection;
    
    private DBManager(){
    
    if(dbManager!=null){
    
            throw new RuntimeException("please use getDBManager method");
    }
    }
    
    public static DBManager getDBmanager(){
    
        if(dbManager==null){
          synchronized(DBManager.class){
              
              if(dbManager==null){
            dbManager = new DBManager();
              }
          }
        
        }
        
        return dbManager;
    }
    
    
    public Connection getConnection(){
        
        
        if(connection==null){
        
                synchronized(DBManager.class){
                
                    if(connection==null){
                    
                        String url="jdbc:mysql://localhost/sample?" +
                                  "user=root&password=root";
                        try{
                        connection=DriverManager.getConnection(url);  
                        }catch(SQLException e){
                        
                            e.printStackTrace();
                        }
                        
                    }
                }
        
        
        }
    
        return connection;
    
    }
}
