package fibonacciNumbers;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Taking the input for 'n'
        int n = sc.nextInt();
        int memo[] = new int[n];
        memo[0] = 0;
        memo[1] = 1;

        //Computing the Fibonacci using DP
        for(int i = 2; i < n; i++){
            memo[i] = memo[i-1]+memo[i-2];
        }
        //Printing the nth computational value
        System.out.println("Nth Fibonacci Number is : "+memo[n-1]);

        //The entire fibonacci Series would be
        for(int i = 0; i < memo.length; i++){
            System.out.print(memo[i]+" ");
        }
    }
}
