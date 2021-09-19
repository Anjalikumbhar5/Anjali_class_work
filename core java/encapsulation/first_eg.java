package encapsulation;
//encapsulation example
class Account
{
	private int acc_no=10;
	private String name;
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) 
	{
		this.acc_no = acc_no;
	}
	
}

public class first_eg 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Account acc=new Account();
		acc.getAcc_no();
		System.out.println(acc.getAcc_no());
		
		
	}
	
}
