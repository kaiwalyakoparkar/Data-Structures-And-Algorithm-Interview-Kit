package knapsack;
import java.util.*;

public class Solution{
    //Debugging purpose
    public static void display(int dp[][]){
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    //Algoritmic method
    public static int knapSack(int W, int wt[], int val[], int n){
        //Initializations
        int benTransac = 0;
        int dp[][] = new int[n][W+1];

        //Main logic/algorithm
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                //Handles the first row
                if(i == 0 && j < wt[i]){
                    dp[i][j] = 0;
                }else if(i == 0 && j >= wt[i]){
                    dp[i][j] = val[i];
                }

                //Handles the rest rows
                if(i >= 1 && j < wt[i]){
                    dp[i][j] = dp[i-1][j];
                }else if(i >= 1 && j >= wt[i]){
                    int temp = dp[i-1][j-(wt[i])]+val[i];
                    dp[i][j] = Math.max(dp[i-1][j], temp);
                }
            }
        }

        //Debugging purpose
        display(dp);

        //Returning final answer
        benTransac = dp[dp.length-1][dp[0].length-1];
        return benTransac;
    }

    //The main handing method
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Number of weight and value pairs
        int w = sc.nextInt();//The restricted weight
        int weights[] = new int[n];//Weigths array
        for(int i = 0; i < weights.length; i++){
            weights[i] = sc.nextInt();
        }
        int values[] = new int[n];//Values array
        for(int i = 0; i < values.length; i++){
            values[i] = sc.nextInt();
        }

        int ans = knapSack(w,weights,values,n);//Takes the best beneficial transaction

        System.out.println("The most beneficial choice gets you "+ans+" values !");//Prints final answer
    }
}
