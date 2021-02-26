package RowWithMaximumOnes;
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

        //This is Naive approach with O(n*m) complexity
        int count[] = new int[m];
        for(int i = 0; i < arr.length; i++){
            int point = 0;
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j]==1){
                    point++;
                }
            }
            count[i] = point;
        }

        int plot = 0;
        int max = count[0];
        for (int i = 1; i < count.length; i++){
            if (count[i] > max) {
                 max = count[i];
                 plot = i;
            }
        }

        System.out.println("Solution through Naive approach is : "+plot);

        //This is optimal approach with O(n+m) complexity
        int max2 = Integer.MIN_VALUE,ans=-1;
        for(int i=0;i<n;i++){
            int point=0;
            for(int j=0; j < m; j++){
                if(arr[i][j]==1){
                    point++;
                }
            }
            if(max2 < point && point > 0){
                max2 =point;
                ans = i;
            }

        }
        System.out.println("Solution through optimal approach is : "+ans);
    }
}
/*
4 4
0 1 1 1
0 0 1 1
1 1 1 1
0 0 0 0
 */
