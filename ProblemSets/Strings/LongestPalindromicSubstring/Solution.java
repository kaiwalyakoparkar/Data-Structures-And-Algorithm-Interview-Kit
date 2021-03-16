package LongestPalindromicSubstring;
import java.util.*;

public class Solution{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String q = sc.nextLine();//for example string is aaaabbaa

        String bruteCount = bruteforceApproach(q.toCharArray());//O(N^4) complexity
        System.out.println("Solution through brute force is : " + bruteCount);
    }

    public static boolean isPalindrome(char sub[]){
        boolean flag = true;

        int i = 0;
        int j = sub.length-1;

        while(i <= j){
            if(sub[i] != sub[j]){
                return false;
            }
            j--;
            i++;
        }

        return flag;
    }

    public static String bruteforceApproach(char q[]){
        String finString = "";
        for(int i = 0; i < q.length-1; i++){
            for(int j = 1; j < q.length; j++){
                if(isPalindrome(Arrays.copyOfRange(q,i,j))==true && j - i > finString.length()){
                    int k = i;
                    while(k <= j){
                        finString = finString + q[k];
                        k++;
                    }
                }
            }
        }
        return finString;
    }
}
