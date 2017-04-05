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
public class StackOfStrings <Item>{
    
    private Node first= null;

    
    private class Node {
        Item item;
        Node next;
    }
   
    
   public void push (Item item){
       
       Node oldfirst= first;
       first= new Node();
       first.item= item;
       first.next= oldfirst; 
    }
    
   public Item  pop(){
       
        Item item = first.item;
        first = first.next;
        return item;
   }
   
   public boolean isEmpty(){
    return first == null ;
} 
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StackOfStrings a = new StackOfStrings();
        a.push("Farid");
        a.push("Desktop");
        a.push(64);
        System.out.println(a.pop());
        
        ArraysStack b= new ArraysStack(3);
        b.push("Farid");
        b.push("Desktop");
        b.push("Pencil");
        System.out.println(b.pop());
        
        
        //
        QueueOfStrings c= new QueueOfStrings();
        c.enqueue("Farid");
        c.enqueue("Desktop");
        c.enqueue("Pencil");
        System.out.println(c.dequeue());
        
        ArraysQueue d = new ArraysQueue(6);
         d.enqueue("Farid");
        d.enqueue("Desktop");
        d.enqueue("Pencil");
        d.enqueue("Board");
        d.enqueue("chess");


        System.out.println(d.dequeue());
        System.out.println(d.dequeue());
         System.out.println(d.dequeue());
        System.out.println(d.dequeue());
        d.enqueue("tennis");
         System.out.println(d.dequeue());


        System.out.println(d.size());



    }
    
        
    
}
