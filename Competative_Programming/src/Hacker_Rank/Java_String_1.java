package Hacker_Rank;
import java.util.*;
public class Java_String_1 {

	public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        
        System.out.println(A.length()+B.length());
        char SortA[] = A.toCharArray();
        Arrays.sort(SortA);
        
        char SortB[] = A.toCharArray();
        Arrays.sort(SortB);
        
        int result = A.compareTo(B);
        
        if(result>0) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
        
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) 
        +" "+ B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
