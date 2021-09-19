package Stringexample;

public class method_of_String {

	public static void main(String[] args)
	{
	
		System.out.println("****UpperCase & lowerCase ******");

		String s="Anjali";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("****trim******");
		String s1="  Anjali   ";
		System.out.println(s1.trim());
		System.out.println("****Start with and end with******");
		String s3="Anjali";
		System.out.println(s3.startsWith("A"));
		System.out.println(s3.endsWith("i"));
		System.out.println("****CharAt method******");
		System.out.println(s3.charAt(2));
		System.out.println("****Length of String******");

		System.out.println(s3.length());
		System.out.println("****concatination******");
		String s4="Anjali" +"Kumbhar";
		System.out.println(s4);
		System.out.println("****equals******");
		System.out.println(s.equals(s1));
		System.out.println("****==******");
		System.out.println(s==s1);
		System.out.println("****replace All******");
		String s5="Apple";
		String replaceString=s5.replaceAll("p", "q");
		System.out.println(replaceString);
		System.out.println("******compareTo*****");
		String s6="Anjali";
		String s7="Anjali";
		System.out.println(s6.compareTo(s7));
	
		
		
		}
		




		




		

	}


