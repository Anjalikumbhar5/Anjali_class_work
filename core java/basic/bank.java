package basic;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BankAccount b=new BankAccount();
		b.getAccname();
		System.out.println("Account name is " +b.getAccname());
		b.getAccNumber();
        System.out.println("Account number is " +b.getAccNumber());
		b.getBalance();
		System.out.println("balace is " +b.getBalance());
		b.withdraw();
		b.diposite();
	  }

}
class BankAccount
{
	private String Accname="saving";
	private int AccNumber=101;
	public String getAccname() {
		return Accname;
	}
	public void setAccname(String accname) {
		Accname = accname;
	}
	public int getAccNumber() {
		return AccNumber;
	}
	public void setAccNumber(int accNumber) {
		AccNumber = accNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	 int balance=2000;
	void withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount for withdraw");
		int with=sc.nextInt();
		balance=balance-with;
		System.out.println(balance);
	}
	void diposite()
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter amount for deposite");
		int dep=sc1.nextInt();
		int balance2=balance+dep;
		System.out.println(balance2);

		
	}


 }
class Savaing extends BankAccount
{
	void interest() {
		System.out.println("Enter interest rate amount");
         Scanner sc3=new Scanner(System.in);
         int rate=sc3.nextInt();
        int balance1=balance+rate;
         System.out.println("after adding interest rate balance is "+balance1);
		
		
	}
	

	
	
	
}
