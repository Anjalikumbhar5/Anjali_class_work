package polymorphizm;
//method overriding
class ggf{
	void cycle()
	{
		System.out.println("father has cycle");
	}
	void add(int a ,int b) {
		System.out.println(a+b);
	}
}
class gf extends ggf
{
	void cycle()
	{
		System.out.println("son has cycle");

	}
}
class f extends gf{
	void cycle() {
		System.out.println("son has cycle");

		
	}
}
class son extends f{
	void cycle() {
		System.out.println("son has cycle");

		
	}
}


public class poly {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		son s=new son();
		s.cycle();
		s.add(10, 20);

	}

}
