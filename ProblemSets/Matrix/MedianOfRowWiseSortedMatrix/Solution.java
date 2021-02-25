package MedianOfRowWiseSortedMatrix;
import java.util.*;

public class Solution{
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

        //This is Naive Solution with complexity of O(n*m log(n*m))
        int resultsArr[] = new int[n*m];
        int e = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                resultsArr[e] = arr[i][j];
                e++;
            }
        }
        Arrays.sort(resultsArr);
        System.out.println("Solution through naive approach is: "+resultsArr[resultsArr.length/2]);
    }
}

/*
 * This is a sample test case
 3 3
 1 3 5
 2 6 9
 3 6 9
*/
