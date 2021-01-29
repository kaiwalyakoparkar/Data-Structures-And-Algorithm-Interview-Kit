package MinimiseTheMaiximumDifferenceBtwHeights;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

       if (n == 1)
        return;

        // Sort all elements
        Arrays.sort(arr);

        // Initialize result
        int ans = arr[n-1] - arr[0];

        // Handle corner elements
        int small = arr[0] + k;
        int big = arr[n-1] - k;
        int temp = 0;

        if (small > big)
        {
            temp = small;
            small = big;
            big = temp;
        }

        // Traverse middle elements
        for (int i = 1; i < n-1; i ++)
        {
            int subtract = arr[i] - k;
            int add = arr[i] + k;

            // If both subtraction and addition
            // do not change diff
            if (subtract >= small || add <= big)
                continue;

            // Either subtraction causes a smaller
            // number or addition causes a greater
            // number. Update small or big using
            // greedy approach (If big - subtract
            // causes smaller diff, update small
            // Else update big)
            if (big - subtract <= add - small)
                small = subtract;
            else
                big = add;
        }

        System.out.println("Answer is: " + Math.min(ans, big - small));
    }
}
