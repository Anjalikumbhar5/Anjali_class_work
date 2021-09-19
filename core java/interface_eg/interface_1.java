package interface_eg;
//example of interface

public class interface_1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CBI c=new CBI();
		c.amount();
		c.name();
		c.num();

	}

}
interface SBI
{
	 void amount();
	void name();
	
}
class CBI implements SBI
{

	@Override
	public void amount() {
		System.out.println("amount is 10000");
		
	}

	@Override
	public void name() {
		System.out.println("name is Anjali");
	
		
	}
	void num() {
		int a=100;
		System.out.println(a);
	}
}