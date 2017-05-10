package arrays;

public class ArraysCreate {
	
	/*********************************
	  * Creating Arrays
	  * 
	  *********************************/
	//declaration with size only
	int[] numbers1 = new int[3];
	// value assign and declaration
	int[] numbers2 = {1,2,3};
	//space
	int [] animals;
	//Multiple “Arrays” in Declarations
	
	int [] ids, types; // ids and types are both int arrays
	// var is int and arra is arrays of int
	int arr[], var;
	
	//Creating an Array with Reference Variables
	public static void main(String args[]) {
		String [] bugs = { "cricket", "beetle", "ladybug" };
		String [] alias = bugs;
		System.out.println(bugs.equals(alias)); // true 
		System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
		
	//
		String[] strings = { "stringValue" };
	    Object[] objects = strings;
		 String[] againStrings = (String[]) objects;
		 //againStrings[0] = new StringBuilder(); // DOES NOT COMPILE 7: 
		 objects[0] = new StringBuilder(); // run time store exception
		 
		 /*********************************
		  * Accessing Arrays
		  * 
		  *********************************/
		}

}
