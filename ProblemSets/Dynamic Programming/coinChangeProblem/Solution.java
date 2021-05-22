package coinChangeProblem;
import java.util.*;

public class Solution{

    /*
    @param 1 : s[] :- This contains all the available coins
    @param 2: n :- This contains total amount to be paid
    @param 3: m :- This contains no of coins available
    @retun combination :- This returns all the possible combinations to the main method
    */
    public static int count(int s[], int n, int m){
        if(s.length == 0){
            return 0;
        }else if(s.length ==1 && n % s[0] == 0){
            return 1;
        }

        int combination = 0;
        int dp[][] = new int[m][n+1];

        for(int i = 0; i < dp.length; i++){
            dp[i][0] = 1;
        }
        for(int i = 0; i < dp[0].length; i++){
            dp[0][i] = 1;
        }

        for(int i = 1; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(dp[i][j]==0 && s[i] > j){
                    dp[i][j] = dp[i-1][j];
                }else if(dp[i][j]==0 && s[i] <= j){
                    dp[i][j] = dp[i-1][j]+dp[i][j-s[i]];
                }
            }
        }
        combination = dp[m-1][n];
        //Debugging purpose
        // for(int i = 0; i < dp.length; i++){
        //     for(int j = 0; j < dp[0].length; j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        return combination;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Enter the total price to pay
        int n = sc.nextInt();
        //Enter the elements in the array
        int m = sc.nextInt();
        //Taking the input for available coins
        int coins[] = new int[m];
        for(int i = 0; i < coins.length; i++){
            coins[i] = sc.nextInt();
        }

        //Computing the no. of combination
        int combination = count(coins, n, m);

        //Printing the output
        System.out.println("There are total "+combination+" combinations to pay !");
    }
}
