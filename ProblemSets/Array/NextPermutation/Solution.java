package NextPermutation;
import java.util.*;

public class Solution{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < nums.length ; i++){
            nums[i] = sc.nextInt();
        }

        //This is optimal solution
        //find first decreasing digit
        int mark = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                mark = i - 1;
                break;
            }
        }

        if (mark == -1) {
            reverse(nums, 0);
        }

        int idx = nums.length-1;
        for (int i = nums.length-1; i >= mark+1; i--) {
            if (nums[i] > nums[mark]) {
                idx = i;
                break;
            }
        }

        swap(nums, mark, idx);

        reverse(nums, mark + 1);

        for(int i = 0 ; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void swap(int[] arr, int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
    public static void reverse(int[] arr, int ind1){
        int i = ind1;
         int j = arr.length-1;
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}
