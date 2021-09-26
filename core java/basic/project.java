package basic;

import java.util.Scanner;

public class project {
	static int a=3,b=3, c=a+b ,c1=a-b;
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("wlcome ");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age>=18) 
		{
			System.out.println("Select one operation\n1.add\n2.sub");
			Scanner sc1=new Scanner(System.in);
			System.out.println("enter your choice");
			String op=sc1.nextLine();
			switch (op)
			{
			case "add":
			{
				//int a=5,b=5;
				//int c=a+b;
				
				System.out.println(c);
				break;
			}
			case "sub":
			{
				
				System.out.println(c1);
                break;
			}
				
			}
				
			}
		
		else 
		{
			System.out.println("you are not eligible");
		}
		}
		
		}
