package polymorphizm;
class A{
	void a1() {
		int a=10;
		System.out.println("This is A");
	}
}
class B extends A{
	{
	super.a1();
		
	}
}

public class method_calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		

	}

}
