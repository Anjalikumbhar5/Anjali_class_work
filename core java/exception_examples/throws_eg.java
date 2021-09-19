package exception_examples;

import java.util.Scanner;

public class throws_eg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Div d=new Div();
		d.divi();
		System.out.println("hii");
		

	}

}
class Div{
	public void divi()throws ArithmeticException{
	Scanner sc=new Scanner (System.in);
	System.out.println("enter value of A");
	int a=sc.nextInt();
	Scanner sc1=new Scanner (System.in);
	System.out.println("enter value of B");
	int b=sc1.nextInt();
	System.out.println("division is "+ (a/b));

	
}
}