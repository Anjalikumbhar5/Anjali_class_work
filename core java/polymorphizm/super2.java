package polymorphizm;
//method calling using super keyword
class audi
{
	void color() 
	{
		System.out.println("This is color of car");
	}
}
class bike1 extends audi
{
	void color() 
	{
		System.out.println("This is color of bike");

	}
	void a() {
	super.color();	
	
	color();
	}
}
public class super2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		bike1 b=new bike1();
		b.a();

	}

}
