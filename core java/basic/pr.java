package basic;

import java.util.Scanner;

public class pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		String primeNo="i";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int num=sc.nextInt();
		for(int i=2;i<num;i++)
		{
		
             if(num%i==0)
			{
				flag=true;
				
				
				break;
			}
		}
		
		
		if(flag==false)
		{
			System.out.println("entered a value is prime");

		}
		else
		{
			System.out.println("entered a value is not prime");

		}
		System.out.println(primeNo);


	}

}
