package collection_program;

 
import java.io.*;
import java.util.*;
  
public class linkedlist{ 
    public static void main(String[] args)
    {
  
        // Declaring the LinkedList
        LinkedList<Integer> ll
            = new LinkedList<Integer>();
  
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            ll.add(i);
  
        // Printing elements
        System.out.println(ll);
  
        // Remove element at index 3
        ll.remove(3);
  
        // Displaying the List
        // after deletion
        System.out.println(ll);
  
        // Printing elements one by one
        for (int i = 0; i < ll.size(); i++)
            System.out.print(ll.get(i) + " ");
    }
}

