package arrays;

import java.util.Arrays;

public class Sorting {
	// variable arguments
	public static void main(String...  args){
	int[] numbers = { 6, 9, 1 }; 
	Arrays.sort(numbers);
	for (int i = 0; i < numbers.length; i++) 
		System.out.print (numbers[i] + " ");
	
	/************************************
	 * Creating a Multidimensional Array
	 **********************************/
	int[][] vars1; //2D
	int vars2 [][];//2D
	int[] vars3[]; //2D
	int[] vars4 [], space [][]; // a 2D AND a 3D array
	
	int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
	System.out.println();
	System.out.println (differentSize.length + " "); // 3
	
	// rectangular array
	String [][] rectangle = new String[4][2];
	System.out.println();
	System.out.println (rectangle.length+ " "); //4
	
	

	}

}
