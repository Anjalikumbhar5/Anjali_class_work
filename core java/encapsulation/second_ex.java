package encapsulation;
//encapsulation program
//encapsulation means wrapping data or hiding data .
class Account1
{
	private String name="Anjali";
	private int Amount=1000;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
}

public class second_ex {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Account1 a=new Account1();
		a.getName();
		a.setAmount(200);
		System.out.println(a.getName());
		System.out.println(a.getAmount());

		


	}

}
