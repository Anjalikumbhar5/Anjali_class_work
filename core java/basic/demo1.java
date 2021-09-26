package basic;

import java.util.Scanner;

public class demo1 {

	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("WelCome to Edubrigde");
		
		System.out.println("Do you want to perform following operation");
		for(int i=0;i<=100;i++)
		{
		System.out.println("\n1.Add\n2.Sub\n3.mul\n4.Div");

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter operation");
	    String operation=sc.nextLine();
	    
	    
	    switch (operation)
	    {
	    case "Add":
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter two number");
			int a=sc1.nextInt();
			int b=sc1.nextInt();
			int c=a+b;
			System.out.println("Additon is " +c);

			break;
	    case "Sub":
			Scanner sc2=new Scanner(System.in);
			System.out.println("Enter two number");
			int a1=sc2.nextInt();
			int b1=sc2.nextInt();
			int c1=a1-b1;
			System.out.println("subtraction is " +c1);
			break;
			
	    case "Mul":
			Scanner sc3=new Scanner(System.in);
			System.out.println("Enter two number");
			int a3=sc3.nextInt();
			int b3=sc3.nextInt();
			int c3=a3*b3;
			System.out.println("Multiplication is " +c3);
			break;
	    case "Div":
			Scanner sc4=new Scanner(System.in);
			System.out.println("Enter two number");
			int a4=sc4.nextInt();
			int b4=sc4.nextInt();
			int c4=a4/b4;
			System.out.println("Additon is " +c4);
			break;
			default:
				System.out.println("Enter valid Choice");
				
		}
		System.out.println("If you want to continue press yes");
		Scanner str=new Scanner (System.in);
		String yes=str.nextLine();
		i++;
	
       

      
		


		
		

		
	}

}
}
