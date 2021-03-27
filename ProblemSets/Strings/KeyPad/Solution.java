package KeyPad;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String finAns2 = usingPreMatrix(s);
        System.out.println("Answer using matrix is : "+finAns2);
    }
    
    public static String usingPreMatrix(String s){
        String str[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7",
                "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };
        String st = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)==' '){
                st = st+"0";
            }else{
                int pos = s.charAt(i)-'A';
                st = st + str[pos];
            }
        }
        return st;
    }
}