package loop;

import java.util.Scanner;

public class pract 
{

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		int i=0;
		while(i<10) 
		{
			int a=10,b=20;int c=a+b;
			System.out.println(c);
			System.out.println("if u want to cintiue press 1");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			if(num==1) 
			{
				System.out.println("contiue");
			}
		    i++;
			
		}

	}

}
