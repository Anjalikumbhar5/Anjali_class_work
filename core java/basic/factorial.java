package basic;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int fact =1;
		int i=1;
		
		while(i<=n)
		{
			fact =fact*i;
			i++;
		}
		System.out.println("factorial of " +n+ " is " +fact);

	}

}
