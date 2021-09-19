package exception_examples;

public class multiple_catch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
			/*int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);*/
			int arr[]=new int[5];
			System.out.println(arr[10]);
			
			
			
		}catch(ArithmeticException e) {
			System.out.println("Sorry...try again");
			
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Sorry..A...try again");

			
			
		}

	}

}
