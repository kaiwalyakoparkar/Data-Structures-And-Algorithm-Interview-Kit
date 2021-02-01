package CountIntversion;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length ;i++){
            arr[i] = sc.nextInt();
        }

        //This is bruteforce approach
        int count = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length ;j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }

        System.out.println("The count is : "+count);

        //This is optimal solution using mergeSort:

        System.out.println("The count using mergesort is "+mergeSortAndCount(arr, 0, arr.length-1));
    }

    public static int mergeSortAndCount(int[] arr, int left, int right){
        int count = 0;
        if(left > right){
            int mid = (left+right)/2;

            count += mergeSortAndCount(arr, left, mid);
            count += mergeSortAndCount(arr, mid+1, right);

            count += mergeSort(arr, left, mid, right);
        }

        return count;
    }

     public static int mergeSort(int[] arr, int low, int mid, int high){
        int[] left = Arrays.copyOfRange(arr, low, mid+1);
        int[] right = Arrays.copyOfRange(arr, mid+1, high+1);

        int i=0, j=0, k = low, swaps = 0;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
                swaps += (mid + 1) - (low + i);
            }
        }
        return swaps;
    }
}
