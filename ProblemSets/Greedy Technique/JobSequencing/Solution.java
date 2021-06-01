package JobSequencing;
import java.util.*;

public class Solution{
    //Debugging purpose
    public static void display(int[] debug){
        //Prints the entire arry so that the algorithm can be dubugged
        for(int i = 0; i < debug.length; i++){
            System.out.print(debug[i]+" ");
        }
        System.out.println();//Just prints extra line
    }

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
        int j = 2;

        //Main logic execution
        for(int i = 1; i < arr.length; i = i+3){
            //Condition 1
            if(maxProfit[arr[i]-1] == 0){
                maxProfit[arr[i]-1] = arr[i+1];
                // display(maxProfit);
            }
            //Condition 2
            else if(arr[i+1] > maxProfit[arr[i]-1]){
                maxProfit[arr[i]-1] = arr[i+1];
                // display(maxProfit);
            }
            //Condition 3
            else if(arr[i]-j >= 0){
                boolean flag = false;
                do{
                    if(maxProfit[arr[i]-j] == 0){
                        maxProfit[arr[i]-j] = arr[i+1];
                        flag = true;
                        // display(maxProfit);
                        break;
                    }else if(maxProfit[arr[i]-j] != 0 && arr[i+1] > maxProfit[arr[i]-j]){
                        maxProfit[(arr[i]-j)] = arr[i+1];
                        // display(maxProfit);
                        flag = true;
                        break;
                    }
                    j++;
                }while(flag != true && arr[i]-j >= 0);
            }
        }

        //Debugging purpose only!
        display(maxProfit);

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
1 2 100 2 1 19 3 2 27 4 1 25 5 1 15
*/
