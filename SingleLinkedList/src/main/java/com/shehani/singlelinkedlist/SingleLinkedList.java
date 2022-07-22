/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shehani.singlelinkedlist;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author ASUS
 */
public class SingleLinkedList  {
    
    private LinkNode head;
    
    public SingleLinkedList(){
     
      this.head=null;
    }

    public LinkNode getHead() {
        return head;
    }
    
    
    public void Insertion(int node){
        
        LinkNode newLinkNode = new LinkNode(node);
        newLinkNode.next=head;
        head=newLinkNode;
       
    
    }
    
    
    public void displayLinkedList(){
        
        LinkNode current=head;
        ArrayList<Integer> array = new ArrayList<>();
        
        while(current!=null){
        array.add(current.data);
        current= current.next;
        }
        
        System.out.println("LinkedList : "+ array);
    }
    
     public boolean checkPalindrome(){
         
        
        LinkNode current=head;
        boolean isPalindrome =false;
        Stack<Integer> stack= new Stack<> ();
        
        while(current!=null){

         stack.push(current.data);
       
        
        current= current.next;
        }
        
        while(head!=null){
            
            int reverseData = stack.pop();
            
            
            if(head.data==reverseData){
                
                isPalindrome=true;
            
            }else{
            
                isPalindrome=false;
                break;
            
            }
            
             head= head.next;
           
        }
        
        return isPalindrome;
    
    
    
     }
    
    
}
