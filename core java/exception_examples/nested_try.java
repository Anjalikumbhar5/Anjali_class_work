package exception_examples;

public class nested_try {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
			try {
				System.out.println("Arithmatic exception");
				int a=10;
				int b=0;
				int c=a/b;
			}catch(ArithmeticException e) {
				System.out.println(e);

				
			}
		}
		
	}
}
		
		