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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SingleLinkedList list = new SingleLinkedList();
        list.Insertion(50);
        list.Insertion(20);
        list.Insertion(30);
        list.Insertion(20);
        list.Insertion(10);
        
        list.displayLinkedList();
        
        if(list.checkPalindrome()){
            
        System.out.println( "LinkedList is a Palindrome");
        
        }else{
        
         System.out.println( "LinkedList is not a Palindrome");
        }
        
    }
     
}
