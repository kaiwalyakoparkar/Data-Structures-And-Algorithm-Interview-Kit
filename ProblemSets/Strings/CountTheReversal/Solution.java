package CountTheReversal;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int ans = reversal(str);
        System.out.println("Solution is : "+ans);
    }
    public static int reversal(String s){
	     
	     int ans =0;
	     
	     Stack<Character> sk = new Stack<>();
	     
	     if(s.length() % 2 != 0){
	         
	         return -1;
	         
	     }else{
	         
	         for(int i=0; i<s.length(); i++){
	             
	             char c = s.charAt(i);
	             
	             if(c == '{'){
	                 
	                 sk.push(c);
	                 
	             }else if(!sk.isEmpty() && c == '}' && sk.peek() == '{'){
	                 
	                 sk.pop();
	                 
	             }else if(!sk.isEmpty() && c == '}' && sk.peek() == '}'){
	                 
	                 sk.push(c);
	                 
	             }else{
	                 
	                 sk.push(c);
	                 
	             }
	             
	         }
	         
	         }
	         
	         while(!sk.isEmpty()){
	             
	             char a = sk.pop();
	             
	             char b = sk.pop();
	             
	             if(a == b){
	                 
	                 ans = ans +1;
	                 
	             }else{
	                 
	                 ans = ans +2;
	                 
	             }
	         
	     }
	     
	     if(sk.isEmpty()){
	         
	         return ans;
	         
	     }
	     
	     return -1;
	}
}