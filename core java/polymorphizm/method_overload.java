package polymorphizm;
//method overloading
class Anjali{
	void add(int a,double b)
	{
		System.out.println("This is first method" +(a+b));
	}
	void add(int a, int b)
	{
		System.out.println("This is second method" +(a+b));

		
	}
}

public class method_overload {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Anjali a=new Anjali();
		a.add(10, 10);

		
	}

}
