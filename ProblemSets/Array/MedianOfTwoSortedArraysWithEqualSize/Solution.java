package MedianOfTwoSortedArraysWithEqualSize;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        //Merging and finding
        //This is merging program;
        int a = arr1.length-1;
        int b = 0;
        while(a >= 0 && b < n){
            if(arr1[a]>arr2[b]){
                int temp =  arr1[a];
                arr1[a] = arr2[b];
                arr2[b] = temp;
            }
            a--;
            b++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //Uncomment the below code two display the merged arrays.
        //for(int i = 0; i < arr1.length; i++){
            //System.out.print(arr1[i]+" ");
        //}
        //System.out.println();
        //for(int i = 0; i < arr2.length; i++){
            //System.out.print(arr2[i]+" ");
        //}

        //This is finding code
        int median = (arr1[n-1]+arr2[0])/2;
        System.out.println("The median of the two arrays with equal size is : "+median);
    }
}
