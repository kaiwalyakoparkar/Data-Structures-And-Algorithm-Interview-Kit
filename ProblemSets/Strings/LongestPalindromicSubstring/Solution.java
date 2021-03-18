package LongestPalindromicSubstring;
import java.util.*;

public class Solution{

    static void printSubStr(String str, int low, int high) {
        for (int i = low; i <= high; ++i)
            System.out.print(str.charAt(i));
    }

    // This function prints the
    // longest palindrome subString
    // It also returns the length
    // of the longest palindrome
    static void bruteForce(String str) {
        // get length of input String
        int n = str.length();

        // All subStrings of length 1
        // are palindromes
        int maxLength = 1, start = 0;

        // Nested loop to mark start and end index
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int flag = 1;

                // Check palindrome
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = 0;

                // Palindrome
                if (flag != 0 && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }

        printSubStr(str, start, start + maxLength - 1);

        // return length of LPS
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        //Brute force approach
        /** 
         * Declare a start point
         * Declare end point
         * Declare 1pointer from start and 2pointer from end
         * Constantly rotate the 1pointer and 2pointer and check if the string is palindrome
         * If it is palindrome and the size of current string is bigger than than length string then replace the length string with current string.
        */
        bruteForce(s);

        //This is optimized approach
        
    }
}
