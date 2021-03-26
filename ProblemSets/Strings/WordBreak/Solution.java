package WordBreak;
import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> li = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String temp = sc.next();
            li.add(temp);
        }
        String s = sc.next();

        // int answer = wordBreak(s, li);
        wordBreak(s, li);
        // System.out.println(answer);
    }
    /**
     * 
     * @param A : The actual query string which we need to break;
     * @param B : This is the dictonary of words.
     * @return : We have to return if it in in the dictornary or not.
     */
    public static void wordBreak(String A, ArrayList<String> B){
        //Declarations
        int[][] dp = new int[A.length()][A.length()]; 
        Set<String> st = new HashSet<>();
        for(int i = 0; i < B.size(); i++){
            st.add(B.get(i));
        }
        //Solution
        //for first diagonal
        int z = 0;
        while(z < A.length()){
            char c = A.charAt(z);
            if(st.contains(c)==true){ 
                dp[z][z] = 1;
            }
            z++;
        }
        //Debugging purpose : 
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        //Returning statement
        // return dp[0][A.length()-1];
    }
}
/**
test case
4
i
am
a
ace
iamace
 */