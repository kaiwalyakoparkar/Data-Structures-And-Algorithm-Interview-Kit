package Sorting;
import java.util.*;
public class Inbuilt_Functions {

//	public static void main(String[] args) {
		
		// A sample Java program to sort an array of integers 
		// using Arrays.sort(). It by default sorts in 
		// ascending order 
//		import java.util.Arrays; 

//		public class SortExample 
//		{ 
			public static void main(String[] args) 
			{ 
				// Our arr contains 8 elements 
				int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 

				Arrays.sort(arr); //This uses the Randomized Quick sort

				for(int i=0; i<arr.length-1; i++) {
					System.out.print(" "+arr[i]);
				}
				 
			} 
		//} 

		
//	}
	
}
