package basic;

import java.util.Scanner;

public class switch_case2 {

	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String day="null";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day between 1-7");
		int value=sc.nextInt();
		switch(value)
		{
		case 1:
			day="monday";
			System.out.println("you have enter "  +day);

			break;
		case 2:
			day="tuesday";
			System.out.println("you have enter "  +day);

			break;
		case 3:
			day="wednesday";
			System.out.println("you have enter "  +day);
		break;
		case 4:
			day="Thurusday";
			System.out.println("you have enter "  +day);
		break;
		case 5:
			day="Friday";
			System.out.println("you have enter "  +day);
		break;
		case 6:
			day="saturday";
			System.out.println("you have enter "  +day);
		break;
		case 7:
			day="Sunday";
			System.out.println("you have enter "  +day);
		break;
		default :
			System.out.println("enter valid number");
		

		}

	}

}
