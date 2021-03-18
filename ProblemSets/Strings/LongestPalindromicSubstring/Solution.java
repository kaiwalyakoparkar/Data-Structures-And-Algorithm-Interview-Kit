package LongestPalindromicSubstring;
import java.util.*;

public class Solution{

    static void printOptimal(String str, int low, int high) {
        System.out.println(str.substring(low, high + 1));
    }

    // This function prints the longest
    // palindrome substring of str[].
    // It also returns the length of the
    // longest palindrome
    static void optimal(String str)
    {
        // get length of input string
        int n = str.length();
 
        // table[i][j] will be false if
        // substring str[i..j] is not palindrome.
        // Else table[i][j] will be true
        boolean table[][] = new boolean[n][n];
 
        // All substrings of length 1 are palindromes
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;
 
        // check for sub-string of length 2.
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
 
        // Check for lengths greater than 2.
        // k is length of substring
        for (int k = 3; k <= n; ++k) {
 
            // Fix the starting index
            for (int i = 0; i < n - k + 1; ++i) {
                // Get the ending index of substring from
                // starting index i and length k
                int j = i + k - 1;
 
                // checking for sub-string from ith index to
                // jth index iff str.charAt(i+1) to
                // str.charAt(j-1) is a palindrome
                if (table[i + 1][j - 1]
                    && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;
 
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        printOptimal(str, start,start + maxLength - 1);
    }

    static void printBruteForce(String str, int low, int high) {
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

        printBruteForce(str, start, start + maxLength - 1);
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
        System.out.println("Answer through bruteforce is : ");
        bruteForce(s);

        System.out.println();
        //This is optimized approach
        System.out.println("Answer through optimal is : " );
        optimal(s);

    }
}
