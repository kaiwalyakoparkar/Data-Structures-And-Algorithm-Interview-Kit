package AlternateNegativeAndPositiveNumbers;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length ;i++){
            arr[i] = sc.nextInt();
        }

        //Shift array approach
        for(int i=0; i<arr.length;i++){
            if(i % 2 == 0){
                if(arr[i]>0){
                    int firstPos = findPos(arr, i);
                    if(firstPos == -1){
                        break;
                    }
                    shiftArr(arr, i, firstPos);
                }
            }
        }

        for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void shiftArr(int[]arr, int start, int end){
        int temp = arr[end];
        int i = end;
        while(i > start){
            arr[i] = arr[i-1];
            i--;
        }
        arr[start] = temp;
    }
    public static int findPos(int[] arr, int start){
        for(int i=start; i<arr.length; i++){
            if(arr[i]<0){
                return i;
            }
        }

        return -1;
    }
}