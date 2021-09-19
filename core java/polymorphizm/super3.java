package polymorphizm;
class A1
{
	A1()
	{
		System.out.println("ghgh");
	}
}
class A2 extends A1
{
	A2( )
	{
		
		System.out.println("This is child constructor");

	}
}

public class super3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		A2 a=new A2();
		

	}

}
