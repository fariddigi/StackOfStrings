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
public class ArraysQueue {
    private String [] s;
    private int N=0;
    private int front =-1;
    private int rear=0;
    
    
    public ArraysQueue (int capacity){
        
        s = new String [capacity] ;
    }
    
    
     public void enqueue (String item)
    {
      if (s.length == N) resize (2*s.length);
        s[N++]= item;
    }
    
    public String dequeue()
    {   
        front++;
        String item = s[front] ;
        s[front]=null;
        return item;

    }
    
    private void resize (int capacity){
        String [] copy = new String [capacity];
        for (int i = 0; i < 10; i++) {
            copy[i]= s[i] ;
                    s= copy;
        }
        
        
    }
    
    public boolean isEmpty(){
    return N == 0;
    
    }
    
    public int size(){
        
       int size= s.length;
       return size;
    }
    
}
