package ArrayWithSumGreaterThanGivenValue;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int found = 0;
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //This is brute-force approach with O ( n ^ 3 ) Complexity
        int count = 1;
        while(count <= arr.length && found ==
                0){
            for(int i = 0; i < arr.length - (count-1); i++){
                int k = count-1 ;
                int current = 0;
                int j = i;
                while(j <= k){
                    current += arr[j];
                    j++;
                }
                if(current > x){
                    found = count;
                    break;
                }
            }
            count++;
        }
        System.out.println("Answer through brute-force approach is : "+(found-1));

        //This is optimal Solution with O ( n ) Complexity

        int sum = 0,currentMin = 0,overallMin = Integer.MAX_VALUE;
        int firstPointer = 0,secondPointer = 0;

        while(secondPointer < n){
            sum += arr[secondPointer++];
            currentMin++;
            //check if sum becomes greater,if yes then remove extra elements from start
            if(sum > x){
                while(sum-arr[firstPointer] > x){
                    sum -= arr[firstPointer++];
                    currentMin--;
                }
                overallMin = Math.min(overallMin,currentMin);
            }
        }
        System.out.println("Answer through optimal approach is : "+overallMin);
    }
}
