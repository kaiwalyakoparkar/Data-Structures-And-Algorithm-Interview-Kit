package Strings;

import java.util.Arrays;
		/*There are three techniques of solving it
		 *1. Take a one element of 1st array and then check if any element matches it in second string using loops
		 *Time Complexity : O(n^2)
		 *2. Sort the arrays in ascending order and compare both the strings
		 *Time Complexity : O(n*log*n)
		 *3. count the occurrence of the element in first array and match it with second array
		 *Time Complexity : O(n*log*n)*/

public class Anagrams_of_strings{
	public static String Sorting(String StringForSorting) {
		
		char tempString[] = StringForSorting.toCharArray();
		
		Arrays.sort(tempString);
		
		return new String(tempString);
	}
	
	public static void main(String[] args) {
		
		String FirstString = "cat";
		System.out.println("Before Sorting: "+FirstString);
		String SortedString1 = Sorting(FirstString);
		
		String SecondString = "act";
		System.out.println("Before Sorting: "+SecondString);
		String SortedString2 = Sorting(SecondString);
		
		if(SortedString1.equals(SortedString2)) {
			System.out.println("It is a Anagram!");
		}else {
			
			System.out.println("It is not a Anagram!");
			
		}
		
		
	}
}