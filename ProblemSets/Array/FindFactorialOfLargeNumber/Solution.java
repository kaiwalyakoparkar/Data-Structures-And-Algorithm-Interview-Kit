package FindFactorialOfLargeNumber;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long ans[] = new long[t];
        long arr[] = new long[t];
        for(int i =0 ; i<ans.length; i++){
            arr[i] = sc.nextInt();
            ans[i] = factorial(arr[i]);
        }

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static long factorial(long n){
        if(n == 0){
            return 1;
        }

        return(n * factorial(n-1));
    }
}