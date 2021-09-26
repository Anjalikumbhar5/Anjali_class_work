package collection_program;
import java.util.*;  
public class stack_eg{  
public static void main(String args[]){  
Stack<String> stack = new Stack<String>();  
stack.push("anjali");  
stack.push("anuja");  
stack.push("swara");  
stack.push("nikhil");  
stack.push("arya");  
stack.pop();  
Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  

