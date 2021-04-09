package BoyerMooreAlgorithm;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String q = sc.next();

        //Main algorithm
        int position = boyerMoore(s, q);
    }
    public static int boyerMoore(String s, String q){
        int len = s.length() - q.length();
        for(int i = len; i >=0; i--){
           boolean rep = matchTheString(s.substring(i, i+q.length()-1),q);
           if(rep == true){
                return i;
           }
           int check = checkElement(s.substring(i, i+q.length()-1),q);
           if(check==-1 && i-q.length() >= 0){
                i = i-q.length();
           }else{
                i = check;
           }

        }
        return -1;
    }
    public static boolean matchTheString(String s1, String q1){
        for(int i=s1.length()-1; i >= 0; i--){
            if(s1.charAt(i) != q1.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static int checkElement(String s2, String q2){
        for(int i = 0; i < s2.length(); i++){
            if(q2.contains(s2.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
