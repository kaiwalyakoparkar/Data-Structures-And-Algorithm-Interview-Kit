package MedianOfTwoSortedArraysWithDifferentSize;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        //Merging and finding approach
        //Merging code
        int a = arr1.length-1;
        int b = 0;
        while(a >= 0 && b < arr2.length){
            if(arr1[a] > arr2[b]){
                int temp = arr1[a];
                arr1[a] = arr2[b];
                arr2[b] = temp;
            }
            a--;
            b++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //Uncomment the following code to see the merged arrays
        //for(int i = 0; i < arr1.length; i++){
            //System.out.print(arr1[i]+" ");
        //}
        //System.out.println();
        //for(int i = 0; i < arr2.length; i++){
            //System.out.print(arr2[i]+" ");
        //}
        //System.out.println();

        //This is finding
        int finLen[] = new int[n+m];
        int median = 0;
        int i;
        for(i = 0; i < arr1.length; i++){
            finLen[i] = arr1[i];
        }
        for(int j=0; j < arr2.length; j++){
            finLen[i] = arr2[j];
            i++;
        }

        if(finLen.length % 2 == 0){
            int mid = finLen.length / 2;
            median = (finLen[mid] + finLen[mid-1])/2;
        }else{
            int mid = finLen.length/2;
            median = finLen[mid];
        }

        System.out.println("The median of the two sorted array with different size is : "+median);
    }
}
