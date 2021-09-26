package basic;

import java.util.Scanner;

public class cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Your choice");
		String choice=sc.next();
		int a,b,c;
		switch(choice)
		{
		case "Addition":
			Scanner add=new Scanner (System.in);
			System.out.println("Enter two number");
			int num1=add.nextInt();
			int num2=add.nextInt();
			c=num1+num2;
			System.out.println("Addition is " +c);
         break;
			
		case "subtracton":
			Scanner sub=new Scanner (System.in);
			System.out.println("Enter two number");
			int num3=sub.nextInt();
			int num4=sub.nextInt();
			c=num3-num4;
			System.out.println("substraction is " +c);

         break;
         
		case "multiplication":
			Scanner mul=new Scanner (System.in);
			System.out.println("Enter two number");
			int num5=mul.nextInt();
			int num6=mul.nextInt();
			c=num5*num6;
			System.out.println("multiplication" +c);

			break;
		case "division":
			Scanner div=new Scanner (System.in);
			System.out.println("Enter two number");
			int num7=div.nextInt();
			int num8=div.nextInt();
			c=num7/num8;
			System.out.println("division is " +c);
			break;
		case "square":
			Scanner sqr=new Scanner (System.in);
			System.out.println("Enter one number");
			int num9=sqr.nextInt();
			
			c=num9*num9;
			System.out.println("Square is " +c);


			break;
		case "cube":
			Scanner cube=new Scanner (System.in);
			System.out.println("Enter one number");
			int num10=cube.nextInt();
			
			c=num10*num10*num10;
			System.out.println("cube is " +c);

		break;
       

			
	

	}

}
}
