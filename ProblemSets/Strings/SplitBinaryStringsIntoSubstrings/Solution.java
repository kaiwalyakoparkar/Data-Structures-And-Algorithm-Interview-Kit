package SplitBinaryStringsIntoSubstrings;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // Solution with O(n) complexity
        int countZero = 0;
        int countOne = 0;
        int pair = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                countZero++;
            }else if(s.charAt(i) == '1'){
                countOne++;
            }

            if(countZero==countOne){
                pair++;
            }
        }
        if(pair != 0){
            System.out.println("Pairs required are : " + pair);
        }else{
            System.out.println("Pairs required are : -1");
        }
        
    }
}