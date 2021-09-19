package exception_examples;

import java.util.Scanner;

public class try_eg {

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of A:");
		int p=sc.nextInt();
		Scanner s=new Scanner (System.in);
		System.out.println("enter value of B:");
		int q=s.nextInt();
		System.out.println(p+q);
       try {
    	   
   		System.out.println(p/q);

       }
       catch(ArithmeticException w)
       
       {
   		System.out.println("sorry");

       }
		System.out.println(p*q);

		




	}

}
