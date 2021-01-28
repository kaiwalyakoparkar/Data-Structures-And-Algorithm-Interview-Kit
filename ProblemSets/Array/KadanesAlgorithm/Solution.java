package KadanesAlgorithm;
import java.util.Scanner;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //This is solution with worst time complexity of O (n^3)
        int sum = 0;
        int max = arr[0];
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                    if(sum > max){
                        max = sum;
                    }
                }
                sum = 0;
            }
            sum = 0;
        }
        System.out.println("Solution through worst complexity is: "+max);


        //This is solution with better time complexity of O (n^2)
        sum = 0;
        max = arr[0];
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length; j++){
                sum += arr[j];
                if(sum > max){
                    max = sum;
                }
            }
            sum = 0;
        }
        System.out.println("Solution through better complexity is: "+max);


        //This is solution with best complexity. this is Kadane's algorithm O (n)
        sum = 0;
        max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(sum < 0){
                sum = 0;
            }
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
        }
        System.out.println("Solution through kadane's algorithm is: "+max);
    }
}
