package coinChangeProblem;
import java.util.*;

public class Solution{
    //This displays the dp matrix (Only for debugging purpose)
    public static void display(int dp[][]){
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    /*
    @param 1 : s[] :- This contains all the available coins
    @param 2: n :- This contains total amount to be paid
    @param 3: m :- This contains no of coins available
    @retun combination :- This returns all the possible combinations to the main method
    */
    public static int count(int s[], int change, int coins){
        int dp[][]=new int [change][coins+1];
        for(int i = 0 ; i < change ;i++){
            dp[i][0]=1;
        }
        for(int i = 0 ;i < change ; i++){
            for(int j=1; j<=coins ;j++){
                if(i>0){
                    dp[i][j]=dp[i-1][j];
                }
                if(s[i]<=j){
                    dp[i][j]=dp[i][j]+dp[i][j-s[i]];
                }
            }
        }

        display(dp);
        return dp[change-1][coins];
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Enter the total price to pay
        int query = sc.nextInt();
        //Enter the elements in the array
        int n = sc.nextInt();
        //Taking the input for available coins
        int coins[] = new int[n];
        for(int i = 0; i < coins.length; i++){
            coins[i] = sc.nextInt();
        }

        //Computing the no. of combination
        int combination = count(coins, query, n);

        //Printing the output
        System.out.println("There are total "+combination+" combinations to pay !");
    }
}
