package MaximumSizeRectangle;
import java.util.*;

public class Solution{
    //Method to find the largest rectangle in histogram and return it to main
    public static int createHistogram(int input[]){
        Deque<Integer> stack = new LinkedList<Integer>();
        int maxArea = 0;
        int area = 0;
        int i;
        for(i=0; i < input.length;){
            if(stack.isEmpty() || input[stack.peekFirst()] <= input[i]){
                stack.offerFirst(i++);
            }else{
                int top = stack.pollFirst();
                //if stack is empty means everything till i has to be
                //greater or equal to input[top] so get area by
                //input[top] * i;
                if(stack.isEmpty()){
                    area = input[top] * i;
                }
                //if stack is not empty then everythin from i-1 to input.peek() + 1
                //has to be greater or equal to input[top]
                //so area = input[top]*(i - stack.peek() - 1);
                else{
                    area = input[top] * (i - stack.peekFirst() - 1);
                }
                if(area > maxArea){
                    maxArea = area;
                }
            }
        }
        while(!stack.isEmpty()){
            int top = stack.pollFirst();
            //if stack is empty means everything till i has to be
            //greater or equal to input[top] so get area by
            //input[top] * i;
            if(stack.isEmpty()){
                area = input[top] * i;
            }
            //if stack is not empty then everything from i-1 to input.peek() + 1
            //has to be greater or equal to input[top]
            //so area = input[top]*(i - stack.peek() - 1);
            else{
                area = input[top] * (i - stack.peekFirst() - 1);
            }
        if(area > maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //This is histogram plotting solution
        int temp[] = new int[n];
        boolean isInitiated = false;
        int currMax = 0;
        int allMax = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(isInitiated == false){
                    temp[j] = arr[i][j];
                }else{
                    if(arr[i][j]==0){
                        temp[j] = 0;
                    }else{
                        temp[j] += arr[i][j];
                    }
                }
            }
            currMax = createHistogram(temp);
            //for(int j = 0; j < temp.length; j++){
                //System.out.print(temp[j]+" ");
            //}
            System.out.println();
            if(currMax >= allMax){
                allMax = currMax;
            }
            isInitiated = true;
        }

        System.out.println("Answer through the histogram plotting is : "+allMax);
    }
}
/*
4 4
0 1 1 0
1 1 1 1
1 1 1 1
1 1 0 0
*/
