package nthCatalanNumber;
import java.util.*;

public class Solution{
   
    //This method finds the catalan number
    public static int findCatalan(int n){
        if(n < 0){
            return -1;
        }

        if(n == 0 || n == 1){
            return 1;
        }

        int dp[] = new int[n];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < dp.length; i++){
            int a = 0;
            int b = i-1;
            int currSum = 0;

            while(a != i || b != -1){
                currSum += dp[a]*dp[b];
                a++;
                b--;
            }

            dp[i] = currSum;
        }

        return dp[dp.length-1];
    }

    //This is the main method
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int ans = findCatalan(n);

        System.out.println("Value of the nth Catalan is: "+ans);
    }
}