package ChocolateDistributionProblem;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //This is Sorting and subset Solution
        Arrays.sort(arr);
        int minDiff = 100000000;
        for(int i = 0; i <= n-m; i++){
            int j = (i + m) - 1;
            if((arr[j] - arr[i]) < minDiff){
                minDiff = arr[j] - arr[i];
            }
        }
        System.out.println("The minimum difference is : "+minDiff);
    }
}
