package ReverseTheString;
import java.util.*;

public class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //There are 3 types of different inputs in this question

        //1st type char array
        int n;
        char[] st = {'h','e','l', 'l','o'};

        int a = 0;
        int b = st.length-1;
        while (a <= b) {
            char temp = st[a];
            st[a] = st[b];
            st[b] = temp;
            a++;
            b--;
        }
        for (int i = 0; i < st.length; i++) {
            System.out.print(st[i]+" ");
        }

        //2nd type
        String s = sc.nextLine();
        int m = s.length();
        char[] string = new char[m];
        for(int i = 0; i < string.length; i++){
            string[i] = s.charAt(i);
        }
        int c = 0;
        int d = string.length - 1;
        while (c <= d) {
            char temp = string[c];
            string[c] = string[d];
            string[d] = temp;
            c++;
            b--;
        }
        for (int i = 0;i<string.length;i++) {
            System.out.print(string[i]+ " ");
        }

        //3rd type
        StringBuilder str = new StringBuilder("Hello");
        str.reverse();
        System.out.println(str);
    }    
}
