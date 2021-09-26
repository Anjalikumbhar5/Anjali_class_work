package basic;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter year year");
		int year=sc.nextInt();

		if(year%4==0)
		{
			System.out.println(" year is leap year");
			
		}
		else
		{
			System.out.println(" year is not leap year");
		}

	}

}
