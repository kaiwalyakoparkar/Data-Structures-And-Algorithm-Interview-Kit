package MaximumProductSubarray;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int prod = 1;
        for(int i=0; i<arr.length; i++){
            prod *= arr[i];
            if(prod > max){
                max = prod;
            }
        }
        System.out.println(max);
    }
}
