/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackofstrings;

/**
 *
 * @author faridrh
 */
public class ArraysStack {
    private String [] s;
    private int N= 0;
    
    public ArraysStack( int capacity){
        
        s= new String[capacity];
    }
    
    
     
     
    public void push (String item){
       s[N++]= item;
    }
    
   public String pop(){
       
        return s[--N];
   }
   
   public boolean isEmpty(){
    return N==0 ;
} 
    
}
