package MinimumSwapsAndKTogether;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n]; //This is for second approch
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }

        //This is brute-force approach with O ( n ^ 2) Complexity
        int count = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > k){
                for(int j = i+1; j < arr.length; j++){
                    if(arr[j] <= k){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println("Solution through brute force approach is: "+count);

        //This is Two Pointer & Sliding window technique
        count = 0;
        for(int i = 0; i < arr2.length; ++i){
            if(arr2[i] <= k){
                ++count;
            }
        }

        int greaterThanK = 0;
        for(int i = 0; i < arr2.length; ++i){
            if(arr2[i] > k){
                ++greaterThanK;
            }
        }

        int ans = greaterThanK;
        for(int i = 0, j = count; j < arr2.length; ++i,++j){
            if(arr2[i] > k){
                --greaterThanK;
            }
            if(arr2[j] > k){
                ++greaterThanK;
            }

            ans = Math.min(ans, greaterThanK);
        }
        System.out.println("Answer through Two Pointer & Sliding Window Technique is : "+ans);
    }
}
