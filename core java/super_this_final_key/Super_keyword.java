package super_this_final_key;

class Animal {
	void print() {
		
	
	String color="black";
	System.out.println(color);

	}	
}
class dog extends Animal
{
	void print() {
		
	
	String color="white";
	//super.print();
	System.out.println(color);

	
}}
public class Super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d=new dog();
		d.print();
	

	}

}
