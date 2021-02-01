package BestTimeToBuyAndSellStocks;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //This is the bruteforce approach
        int profit = 0;
        for(int i = 0; i < arr.length -1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int sum = arr[j] - arr[i];
                    if(sum > profit){
                        profit = sum;
                    }
                }
            }
        }

        System.out.println("Max profit is : "+profit);


        //This is optimal solution
        int minimal = 1000000000;
        profit = 0;
        for(int i = 0; i < arr.length; i++){
            if(i != 0){
                if((arr[i] - minimal) > 0){
                    if((arr[i] - minimal) > profit){
                        profit = arr[i] - minimal;
                    }
                }
                if(arr[i] < minimal){
                    minimal = arr[i];
                }

            }else{
                if(arr[i] < minimal){
                    minimal = arr[i];
                }
            }
        }
        System.out.println("Max profit is : "+profit);
    }
}
