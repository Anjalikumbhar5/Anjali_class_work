package exception_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_Not_Found_exeption {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			File file=new File("E:\\Users\\NIKHIL\\Desktop\\ppt");
			FileReader fr=new FileReader(file);
			
		}
		catch(FileNotFoundException e) {
			System.out.println("Sorry file not exist");
		}
		

	}

}
