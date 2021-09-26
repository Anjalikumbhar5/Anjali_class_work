package basic;
//example of types of variable
public class example {
	static int a=5;//static variable 
	int b=9;//instance variable
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=99;//local variable
		System.out.println(c);
		example e1=new example();
		e1.a=25;
		System.out.println(e1.a);
		example e2=new example();
		e2.b=30;
		System.out.println(e2.b);

		


	}

}
