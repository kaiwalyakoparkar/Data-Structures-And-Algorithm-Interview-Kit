package MergeIntervals;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int[][] matrix = mergeIntervals(arr);
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col]+" ");
            }
        }
    }
    public static int[][] mergeIntervals(int[][] intervals){
        if(intervals.length <= 1){
            return intervals;
        }
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0],arr2[0]));

        List<int[]> outputArr = new ArrayList<>();
        int[] currentInterval = intervals[0];
        outputArr.add(currentInterval);

        for(int[] interval : intervals){
            int currentBegin = currentInterval[0];
            int currentEnd = currentInterval[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if(currentEnd >= nextBegin){
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            }else{
                currentInterval = interval;
                outputArr.add(currentInterval);
            }
        }

        return outputArr.toArray(new int[outputArr.size()][]);
    }
}
