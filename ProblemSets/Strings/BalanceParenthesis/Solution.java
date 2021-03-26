package BalanceParenthesis;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String x = sc.next();

        // Stack approach
        boolean isPair2 = stackApproach(x);
        System.out.println("Solution through stack approach is: "+isPair2);
    }

    public static boolean stackApproach(String x){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '{' || x.charAt(i) == '[' || x.charAt(i) == '(') {
                // push
                st.push(x.charAt(i));
            } else {
                // pop
                if (st.isEmpty() == true) {
                    return false;
                }
                char c = st.peek();
                if (x.charAt(i) == '}' && c != '{') {
                    return false;
                } else if (x.charAt(i) == ']' && c != '[') {
                    return false;
                } else if (x.charAt(i) == ')' && c != '(') {
                    return false;
                }
                st.pop();

            }
        }
        if (st.isEmpty() == true) {
            return true;
        }
        return false;
    }
}