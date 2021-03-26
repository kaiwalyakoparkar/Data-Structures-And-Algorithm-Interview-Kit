package FindGreaterNumber;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //Optimal Solution
        int ind1 = -1;
        int ind2 = -1;
        for(int i = arr.length-2; i >=0; i--){
            if(arr[i] < arr[i+1]){
                ind1 = i;
                break;
            }
        }
        if(ind1==-1){
            reverse(arr,0);
        }else{
            for(int i = arr.length-1; i > ind1; i--){
                if(arr[i] > arr[ind1]){
                    ind2 = i;
                    break;
                }
            }
            swap(arr, ind1, ind2);
            reverse(arr, ind1+1);
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void reverse(int arr[], int idx){
        int a = idx;
        int b = arr.length-1;
        while(a <= b){
            swap(arr, a, b);
            a++;
            b--;
        }
    }
}