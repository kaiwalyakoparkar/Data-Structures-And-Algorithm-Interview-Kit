package PrintAllSubsequences;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        
        //Brute-Force approach with O(n^3) Complexity
        System.out.println("Brute-Force solution is : ");
        List<String> str1 = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            String temp1 = "";
            temp1 = temp1 + s.charAt(i);
            if(!str1.contains(temp1)){
                System.out.println(s.charAt(i));
                str1.add(temp1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                String temp2 = "";
                temp2 = temp2 + s.charAt(i);
                temp2 = temp2 + s.charAt(j);
                if(!str1.contains(temp2)){
                    System.out.println(temp2);
                    str1.add(temp2);
                    if (j - i >= 2 && !str1.contains(s.substring(i,j+1))) {
                        System.out.println(s.substring(i, j+1));
                        str1.add(s.substring(i, j+1));
                    }
                }
            }
        }


        System.out.println();
        //Optimal Approach with O(n) Complexity
        System.out.println("Optimal solution is : ");
        List<String> str = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(!str.contains(s.substring(i,j+1))){
                    System.out.println(s.substring(i, j+1));
                    str.add(s.substring(i,j+1));
                }
                String temp = new String();
                temp = temp + s.charAt(i);
                temp = temp + s.charAt(j);
                if(!str.contains(temp) && i != j){
                    System.out.println(temp);
                    str.add(temp);
                }
            }
        }

    }
}