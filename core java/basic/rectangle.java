package basic;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter breadth and length");
		int b=sc.nextInt();
		int l=sc.nextInt();
		if(b==l) {
			System.out.println("it is Square");
		}
		else {
			System.out.println("it is not Square");

		}

	}

}
