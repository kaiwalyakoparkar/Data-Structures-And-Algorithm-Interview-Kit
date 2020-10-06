package DynamicProgramming.FibonacciSeries;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the fibonacci series:");
        int n = sc.nextInt();
        fib(n);
    }
    public static void fib(int n){
        int memo[] = new int[n];
        memo[0]=0; memo[1]=1;
        System.out.print(memo[0]+" "+memo[1]);
        for(int i=2 ;i<=n; i++){
            memo[i] = memo[i-1]+memo[i+2];
            System.out.print(" "+memo[i]);
        }
    }
}
