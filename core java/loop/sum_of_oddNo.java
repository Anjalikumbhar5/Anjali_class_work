package loop;

public class sum_of_oddNo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int add=0;
		for(int i=1;i<20;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);

				add=add+i;

			}

		}
		System.out.println("sum of all odd number is " +add);


	}

}
