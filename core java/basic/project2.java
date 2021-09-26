
package basic;

import java.util.Scanner;
class method
{
	void a(int a,int b)
	{
		System.out.println(a+b);
	}
	void a(int a ,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void sub(int a1 ,int b1) 
	{
		System.out.println(a1-b1);

		
	}
	void sub(int a2,int b2,int c2) {
		System.out.println(a2-b2-c2);

		
	}
	
}


public class project2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("value of a=5,b=2,c=2");
		for(int i=0;i<=5;i++) {
		System.out.println("Enter operation which you want to perform\n1.Add\n2.Sub");
		
		Scanner sc=new Scanner (System.in);
		int op=sc.nextInt();
		switch(op) 
		{
		case 1:
		{
			System.out.println("enter how many number you want to Add");
			Scanner sc1=new Scanner (System.in);
			int num=sc1.nextInt();
			
		if(num==2) 
		{
			System.out.println("Addition of two number is" );
			method m=new method();
			m.a(5, 2);
			
		}
		else if(num==3) 
		{
			System.out.println("Addition of three number is");
			method m=new method();

			m.a(5, 2,02);

		
		}
		break;
		}
		case 2:
		{
			System.out.println("enter how many number you want to subtract");
			Scanner sc1=new Scanner (System.in);
			int num=sc1.nextInt();

            if(num==2)
            {
            	
            
			System.out.println("subtraction of two number is " );
			method m=new method();
			m.sub(5, 2);
            }
            else if(num==3)
            {
    			System.out.println("Subtraction of three number is");
    			method m=new method();

    			m.sub(5, 2,2);

            }
            }
			
			
			
		}
		
		}
		
	

}
}
