/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shehani.singlelinkedlist;

import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class LinkNode {
    
    public int data;
    public LinkNode next;

    public LinkNode(int data) {
        this.data = data;
        this.next=null;
    }
    
    
    
    public void displayLinkNode(){
        
        System.out.println("data:"+data);
    
    
    }
    

}
