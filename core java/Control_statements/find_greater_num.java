package Control_statements;

import java.util.Scanner;

public class find_greater_num {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of A");
		int a=sc.nextInt();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of B");
		int b=sc.nextInt();
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter value of c");
		int c=sc.nextInt();
		if(a>b &&a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}








		






	}

}
