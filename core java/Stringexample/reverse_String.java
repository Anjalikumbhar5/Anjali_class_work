package Stringexample;

import java.util.Scanner;

public class reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a String");
		a=sc.nextLine();
		System.out.println("After reverse String :");
		int i=a.length();
		while(i>0) {
			System.out.print(a.charAt(i-1));
			i--;
		}
		

	}

}
