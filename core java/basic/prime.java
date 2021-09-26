package basic;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=29;
		boolean flag=false;
		for(int i=2;i<=num /2;++i)
		{
			if(num % 1==0)
			{
				flag =true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("number is prime number" +num);
		}
		else
		{
			System.out.println("number is not prime number" +num);

		}

	}

}
