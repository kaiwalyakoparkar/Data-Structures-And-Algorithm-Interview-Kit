package JobSequencing;
import java.util.*;

public class Solution{
    //Method which finds the maximum profit job array
    public static int[] jobSequencing(int[] arr, int n){
        // Array is in (Job id, Deadline, Profit) format
        int a = 0;//refers first job id
        int b = 1;//refers first Deadline
        int c = 2;//refers first profit

        //Finding the maximum deadline
        int maxDeadline = 0;
        for(int i = 1; i < arr.length; i = i+3){
            if(arr[i] > maxDeadline){
                maxDeadline = arr[i];
            }
        }

        //Declaring array which will contain maxProfit range
        int maxProfit[] = new int[maxDeadline];

        //Main logic execution
        for(int i = 1; i < arr.length; i = i+3){
            if(maxProfit[arr[i]-1] == 0){
                maxProfit[arr[i]-1] = arr[i+1];
            }else if(maxProfit[arr[i]-1] != 0 && arr[i+1] > maxProfit[arr[i]-1]){
                maxProfit[arr[i]-1] = arr[i+1];
            }else{
                for(int j = arr[i-1]; j >= 0; j--){
                    if(maxProfit[arr[i]-1] == 0){
                        maxProfit[arr[i]-1] = arr[i+1];
                    }else if(maxProfit[arr[i]-1] != 0 && arr[i+1] > maxProfit[arr[i]-1]){
                        maxProfit[arr[i]-1] = arr[i+1];
                    }
                }
            }
        }

        //Returning the final profit array
        return maxProfit;
    }

    //Main method
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of jobs");
        int n = sc.nextInt();
        int arr[] = new int[n*3];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int ans[] = jobSequencing(arr, n);

        int temp = 0;
        for(int i = 0; i < ans.length; i++){
            temp += ans[i];
        }
        System.out.println("Max profit is : "+temp);
    }
}

//Test cases
/*
Test case 1:
4
1 4 20 2 1 10 3 1 40 4 1 30

Test case 2:
5
1 2 100 2 1 19 3 2 27 4 1 25 5 1 15)
*/
