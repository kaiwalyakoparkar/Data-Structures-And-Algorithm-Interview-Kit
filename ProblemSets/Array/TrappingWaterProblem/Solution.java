package TrappingWaterProblem;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //This is brute-force approach
        int trappedWater = 0;
        for(int i = 1; i < n - 1; i++)
        {

            // Find maximum element on its left
            int left = arr[i];
            for(int j = 0; j < i; j++)
            {
                left = Math.max(left, arr[j]);
            }

            // Find maximum element on its right
            int right = arr[i];
            for(int j = i + 1; j < n; j++)
            {
                right = Math.max(right, arr[j]);
            }

            // Update maximum water value
            trappedWater += Math.min(left, right) - arr[i];
        }
        System.out.println("The Trapped water through brute-force is: "+trappedWater);

        //This is optimal solution

        int trappedWater2 = 0;
        // maximum element on left and right
        int left_max = 0, right_max = 0;

        // indices to traverse the array
        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            if (arr[lo] < arr[hi]) {
                if (arr[lo] > left_max)

                    // update max in left
                    left_max = arr[lo];
                else

                    // water on curr element =
                    // max - curr
                    trappedWater2 += left_max - arr[lo];
                lo++;
            }
            else {
                if (arr[hi] > right_max)

                    // update right maximum
                    right_max = arr[hi];

                else
                    trappedWater2 += right_max - arr[hi];
                hi--;
            }
        }

        System.out.println("Trapped water through optimal approach is : "+trappedWater2);
    }
}
