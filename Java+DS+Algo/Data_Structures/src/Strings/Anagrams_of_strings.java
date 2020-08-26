package Strings;

import java.util.Arrays;

public class Anagrams_of_strings {
	
	public static String sortString(String String1) 
    { 
        // convert input string to char array 
        char tempArray[] = String1.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray); 
    } 

	public static void main(String[] args) {
		
		/*There are three techniques of solving it
		 *1. Take a one element of 1st array and then check if any element matches it in second string using loops
		 *Time Complexity : O(n^2)
		 *2. Sort the arrays in ascending order and compare both the strings
		 *Time Complexity : O(n*log*n)
		 *3. count the occurrence of the element in first array and match it with second array
		 *Time Complexity : O(n*log*n)*/
		
		//I will be solving it with second method
		
		// Method to sort a string alphabetically 
	    // Driver method 
	     
	        String String1 = "cat"; 
	        String SortedString1 = sortString(String1);
	        System.out.println(SortedString1);
	        String String2 = "act";
	        String SortedString2 = sortString(String2);
	        System.out.println(SortedString2);
	          
	        if(SortedString1.equals(SortedString2)) {
	        	System.out.println("It is a Anagram");
	        }else {
	        	System.out.println("It is not a Anagram");
	        }
	        
	    
	}
}
