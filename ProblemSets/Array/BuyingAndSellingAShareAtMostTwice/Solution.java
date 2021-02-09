package BuyingAndSellingAShareAtMostTwice;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //Valley and peak approach
        /*
                           80
                           /
            30            /
           /  \          25
          /    15       /
         /      \      /
        2        10   /
                   \ /
                    8
         */
        int profit = 0;
        for(int i=1; i < arr.length; i++){
            int sub = arr[i] - arr[i - 1];
            if(sub > 0){
                profit += sub;
            }
        }

        System.out.println("Solution through valley and peak method is: "+profit);
    }
}
