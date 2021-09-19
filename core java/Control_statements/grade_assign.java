package Control_statements;

import java.util.Scanner;

public class grade_assign 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks=sc.nextInt();
		if(marks>90 || marks==90)
		{
			System.out.println("A Grade");
		}
		else if(marks>25 && marks<45)
		{
			System.out.println("B Grade");

		}
		else if(marks>50 && marks<60)
		{
			System.out.println("c Grade");

		}
		else if(marks>45 && marks<50)
		{
			System.out.println("grade is D");

		}
		else if(marks>25 && marks<45) {
			System.out.println("grade is z");

			
		}
		else {
			System.out.println("grade is j");

		}
		}
		

	}


