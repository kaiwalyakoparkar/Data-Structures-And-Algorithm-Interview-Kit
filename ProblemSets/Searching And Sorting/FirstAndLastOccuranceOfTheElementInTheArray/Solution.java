package FirstAndLastOccuranceOfTheElementInTheArray;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Taking the intial input
        int n = sc.nextInt();
        int target = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        //Fetching the output
        int res[] = new int[2];
        res[0] = findStartingIndex(nums, target);//finding the starting index
        res[1] = findEndingIndex(nums,target);//finding the ending index

        //Printing the answer
        System.out.println("Answer is "+res[0]+" & "+res[1]);
    }

    /*
     * Funtion: Finds the starting point of the target in the array
     * @Param nums = is the actual query array
     * @Param t = is the actual target we need to find
     * @return = returns the found index or -1
     */
    public static int findStartingIndex(int nums[], int t){
        int index = -1;//If nothing found will return -1

        //Index finding logic (Binary search)
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int midPoint = (start+end)/2;

            //if the target is less than midpoint that means it resides on the left half part
            if(nums[midPoint]>= t){
                end = midPoint-1;
            }else{
                start = midPoint+1;
            }

            //if finds the target adds it to the index
            if(nums[midPoint] == t){
                index = midPoint;
            }
        }

        //Return the index
        return index;
    }

     /*
     * Funtion: Finds the ending point of the target in the array
     * @Param nums = is the actual query array
     * @Param t = is the actual target we need to find
     * @return = returns the found index or -1
     */

    public static int findEndingIndex(int nums[], int t){
        int index = -1;//If nothing found will return -1

        //Finding the index logic
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int midPoint = (start+end)/2;
             //if the target is less than midpoint that means it resides on the left half part
            if(nums[midPoint] <= t){
                start = midPoint+1;
            }else{
                end = midPoint-1;
            }

            //This adds the found target index to the variable.
            if(nums[midPoint]==t){
                index = midPoint;
            }
        }

        //Return the index
        return index;
    }
}
