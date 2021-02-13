package ThreeWayPartitioning;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int low = sc.nextInt();
        int high = sc.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[n];
        for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            temp[i] = arr[i];
        }

        //This is Sorting solution with O (n*log*n) complexity
        Arrays.sort(temp);
        System.out.println("Solution through sortin is : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(temp[i]+" ");
        }

        //This is Dutch National Flag Problem O ( n ) complexity
        int start = 0, end = n-1;
        for(int i = 0; i <= end;){

            if(arr[i] < low){
                int temp1 = arr[i];
                arr[i] = arr[start];
                arr[start] = temp1;
                start++;
                i++;
            }else if(arr[i] > high){
                int temp1 = arr[i];
                arr[i] = arr[end];
                arr[end] = temp1;
                end--;
            }else {
                i++;
            }

        }
        System.out.println();
        System.out.println("Solution through dutch national flag solution is : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
