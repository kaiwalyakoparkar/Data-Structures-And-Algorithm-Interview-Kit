package FirstAndLastOccuranceOfTheElementInTheArray;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//No of elements in the array
        int arr[] = new int[n];

        //Taking the input in the array
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();//No to found out
        findFL(arr, n, x);
    }
    public static void findFL(int arr[],int n,int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i]==x){
                System.out.print("Solution is "+i+" & "+count);
                break;
            }
        }
    }
}
