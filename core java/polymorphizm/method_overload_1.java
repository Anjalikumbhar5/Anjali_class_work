package polymorphizm;
//method overloading
class method
{
	 void add(int a,int b)
	{
		
		System.out.println("This is first method" +(a+b) );
		
	}
     void add(int a, int b,int c)
	{
		System.out.println("This is first method" +(a+b+c) );

	}
}

public class method_overload_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		method m=new method();
		m.add(10, 10);
		
		
		

	}

}
