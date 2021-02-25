package SearchElementInMatrix;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int target = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //This is Naive Approach O(n*m)
        boolean naiveFound = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j]==target){
                    naiveFound = true;
                    break;
                }
            }
        }

        System.out.println("Status through naive approach is: "+naiveFound);

        //This is better Approach O(n*m)
        boolean betterFound = false;
        for(int i = 0; i < arr.length; i++){
            if(target >= arr[i][0]){
                for(int j = 0; j < arr[0].length; j++){
                    if(target==arr[i][j]){
                        betterFound = true;
                    }
                }
            }
        }

        System.out.println("Status through better approach is: "+betterFound);

        //This is the optimal Approach
        boolean optimalFound = false;
        int a = 0;
        int b = m-1;
        while(a < n && b >= 0){
            if(arr[a][b] == target){
                optimalFound = true;
            }
            if(arr[a][b] > target){
                b--;
            }else{
                a++;
            }
        }
        System.out.println("Status throgh optimal approach is: "+optimalFound);
    }
}
/*
4 3 3
1 3 5 7
10 11 16 20
23 30 34 60
*/
