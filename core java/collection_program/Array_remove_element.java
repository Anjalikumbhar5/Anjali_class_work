package collection_program;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;


public class Array_remove_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArray= {1,2,3,4};
		int[] removed= ArrayUtils.removeElements(intArray,3);
		System.out.println(Arrays.toString(removed));

	}

}
