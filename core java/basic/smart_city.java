package basic;

import java.util.Scanner;

public class smart_city {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		System.out.println("plese select from following\n1.Registration\n2.login");
		Scanner s=new Scanner(System.in);
		String op=s.nextLine();
		switch (op) 
		{
		case "Reg":
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your age");
			int age=sc.nextInt();
			if(age>=18 )
			{
				System.out.println("Congratulation You are eligible for regestration");
				System.out.println("Enter your name");
				Scanner sc1=new Scanner(System.in);
				String name=sc1.nextLine();
				System.out.println("Enter your age");
				Scanner sc2=new Scanner(System.in);
				int ag=sc2.nextInt();
				System.out.println("if you have marks more than 80 you will get free course");
				System.out.println("Enter your marks ");
				Scanner sc3=new Scanner(System.in);
				int mark=sc3.nextInt();
				if(mark>=80)
				{
					System.out.println("You have registerd for free course ");

				}
				else {
					System.out.println("You have to paid fee ");

				}

				
				System.out.println("Your registration is completed ");
				
				}
			else
			{
				

				System.out.println("Sorry you are not eligible");
				
			}


		}
		
		}
		
		

	}

}
