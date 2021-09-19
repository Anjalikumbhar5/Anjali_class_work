package polymorphizm;
//variable calling using super keyword
class car
{
	String color="white";
}
class bike extends car
{
	String color="black";
	void printColor() 
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class super1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		bike b=new bike();
		b.printColor();

	}

}
