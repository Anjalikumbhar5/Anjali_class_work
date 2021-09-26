package basic;

import java.util.Scanner;

public class pattern 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		for(int i=0;i<=4;i++) 
			
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j ||i>=j)
				{
				System.out.print("*");
				}
				else
					System.out.print(" ");

				
				
			}
			System.out.println();

		}
}
}