package CountAndSay;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = countAndSay(n);

        System.out.println("The answer is : " + s);
    }
    public static String countAndSay(int n){
        if(n==0) return null;
        if(n==1) return "1";
        if(n==2) return "11";

        String s = "11";
        for(int i = 3; i <= n; i++){
            s = s + '&';
            int c = 1;
            String t = "";
            for(int j = 1; j < s.length(); j++){
                if(s.charAt(j) != s.charAt(j-1)){
                    t = t + c;
                    t = t + s.charAt(j-1);
                    c=1;
                }else{
                    c++;
                }
            }

            s = t;
        }

        return s;
    }
}
