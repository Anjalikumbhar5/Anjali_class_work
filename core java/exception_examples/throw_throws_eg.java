package exception_examples;

public class throw_throws_eg {
	public static void validate(int age) {
	if(age<18) {
		throw new ArithmeticException("Sorry");
	}
	else {
		System.out.println("welcome");
	}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		validate(19);
		System.out.println("rest code");
		

	}

}
