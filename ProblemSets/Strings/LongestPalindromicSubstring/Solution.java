package LongestPalindromicSubstring;
import java.util.*;

public class Solution{
    //This will find the answer through bruteforce
    public static boolean isPalindrome(String subString){
        boolean flag = true;

        int i = 0;
        int j = subString.length();

        while(i <= j){
            if(subString.charAt(i) != subString.charAt(j)){
                return false;
            }
            j--;
            i++;
        }

        return flag;
    }
    public static String bruteforceApproach(String q){
        String finString = "&";
        for(int i = 0; i < q.length()-1; i++){
            for(int j = 1; j < q.length(); j++){
                String s = q.substring(i,j);
                boolean pali = isPalindrome(s);
                if(pali == true && s.length() > finString.length()){
                    finString = s;
                }
            }
        }
        return finString;
    }
    // public static String betterCount(String q){

    // }
    // public static String betterCount(String q){

    // }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String q = sc.nextLine();//for example string is aaaabbaa

        // String bruteCount = bruteforceApproach(q);//O(N^4) complexity
        // String betterCount = betterCount(q);//O(N^2) complexity
        // String bestCount = bestCount(q);//O(N) complexity

        System.out.println("Solution through brute force is : " + bruteforceApproach(q));
        // System.out.println("Solution through better approach is : " + betterCount);
        // System.out.println("Solution through best approach is : " + bestCount);
    }
}