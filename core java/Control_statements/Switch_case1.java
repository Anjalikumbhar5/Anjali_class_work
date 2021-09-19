package Control_statements;

import java.util.Scanner;

public class Switch_case1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter month between 1-12");
		String month=sc.nextLine();
		Scanner sc1=new Scanner (System.in);
		System.out.println("Enter year between");
		String year=sc1.nextLine();
		switch(month)
		{
		case "1":
			System.out.println("jan" + year +"  has 30 days");
		
        case "2":
			System.out.println("feb" + year +"  has 28 days");

		case "3":
			System.out.println("march" + year +"  has 31 days");

		case "4":
			System.out.println("April " + year +"  has 30 days");


		case "5":
			System.out.println("may" + month + year +"  has 31 days");
          break;

		case "6":
			System.out.println("june "  + year + "  has 30 days");
			break;


		case "7":
			System.out.println("jully" + year +" has 31 days");
			break;



		case "8":
			System.out.println("aug" + year +"  has 31 days");
			break;



		case "9":
			System.out.println("sept" + year +" 30 days");
			break;



		case "10":
			System.out.println("oct" + year +"31 days");
			break;



		case "11":
			System.out.println("nov" + year +" has 30 days");
			break;



		case "12":
			System.out.println("dec" + year +" has 31 days");
			break;



		


			
		
		
	
		}



		

	}

}
