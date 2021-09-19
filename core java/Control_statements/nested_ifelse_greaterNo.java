package Control_statements;

public class nested_ifelse_greaterNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=40;
		int c=30;
		if (a>b)
		{
			if(a>c)
			{
				System.out.println("A is Greater");
			}
			else 
			{
				System.out.println("c is greatre");
			}
		}
		else 
		{
			if(b>c)
			{
				System.out.println("b");
			}
			else
			{
				System.out.println("c");

			}
		}
		
		}
}