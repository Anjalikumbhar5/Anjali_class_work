package basic;

public class obj_creation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Addition a=new Addition();
		a.add();
		Subtraction s=new Subtraction();
		s.sub();

	}

}
class Addition
{
	public void add()
	{
		int a=10;
		int b=5;
		int c=a+b;
		System.out.println(c);
				
	}
}
class Subtraction
{
	public void sub()
	{
		int a1=10;
		int b1=5;
	    int c=a1-b1;
		System.out.println(c);

	    
	}
}
