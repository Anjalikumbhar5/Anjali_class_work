package basic;

import java.util.Scanner;

public class abc 
{
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String date="null";
		String dName="null";
		System.out.println("Hiiiii");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name");
		String name=s.nextLine();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks=s1.nextInt();
		if(marks>=80)
		{
			System.out.println("you are eligible");

		}
		else
		{
			System.out.println("you are  not eligible");

		}
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter code of degree ");
		String degree=s2.nextLine();
	     switch(degree) 
	     {
	     case "1":
	    	 dName="BE";
	    	 date="5 august";
	    	System.out.printf("your degree is  " + dName + " and your test is on " +date); 
	    	 
	     }
		
		

	}

}
