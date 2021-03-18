package LongestPalindromicSubstring;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        String s = sc.next();
        sb.append(s);

        //Brute force approach
        /** 
         * Declare a start point
         * Declare end point
         * Declare 1pointer from start and 2pointer from end
         * Constantly rotate the 1pointer and 2pointer and check if the string is palindrome
         * If it is palindrome and the size of current string is bigger than than length string then replace the length string with current string.
        */
        StringBuilder resultString = new StringBuilder("");
        int resultLength = 0;
        for (int start = 0; start < sb.length()-1; start++) {
            int flag = 0;
            for (int end = start; end < sb.length(); end++) {
                int a = start;
                int b = end;
                while(a <= b){
                    if(sb.charAt(a)!=sb.charAt(b)){
                        flag = 1;
                    }
                    a++;
                    b--;
                }
                if(flag==0){
                    if((end+1)-start > resultLength){
                        String temp = s.substring(start, end+1); //resultString.length()){
                        resultString = sb.append(temp);
                        resultLength = (end+1)-start;
                    }
                }
            }
        }
        System.out.println(resultString);
        System.out.println(resultLength);
    }
}
