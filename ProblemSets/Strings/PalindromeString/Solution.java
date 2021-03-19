package PalindromeString;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = 0;
        int j = S.length()-1;
        int flag = 1;
        while(i <= j){
            if(S.charAt(i)!=S.charAt(j)){
                flag = 0;
                break;
            }
            i++;
            j--;
        }
        if(flag==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}