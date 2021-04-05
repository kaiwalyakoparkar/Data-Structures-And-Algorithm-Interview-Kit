package RomanToInt;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        //Main solution
        int answer = convert(s);
        System.out.println(answer);
    }
    public static int convert(String s){
        int ans = findInt(s.charAt(s.length()-1));
        for(int i = s.length()-2; i >= 0; i--){
            int curr = findInt(s.charAt(i));
            if(curr < findInt(s.charAt(i+1))){
                ans += findInt(s.charAt(i+1))-curr;
            }else{
                ans += curr;
            }
        }
        return ans;
    }
    public static int findInt(char c){
        int ret = 0;
        switch(c){
                case 'I':
                    ret = 1;
                    break;
                case 'V':
                    ret =5;
                    break;
                case 'X':
                    ret = 10;
                    break;
                case 'L':
                    ret = 50;
                    break;
                case 'C':
                    ret = 100;
                    break;
                        case 'D':
                    ret = 500;
                    break;
                case 'M':
                    ret = 1000;
                    break;
            }
        return ret;
    }
}
