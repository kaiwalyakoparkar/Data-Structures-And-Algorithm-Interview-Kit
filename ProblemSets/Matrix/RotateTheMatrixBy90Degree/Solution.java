package RotateTheMatrixBy90Degree;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //Brute-Force approach with O(n^2) extra space
        int rotMax[][] = new int[n][n];
        int p = n-1;
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                rotMax[c++][p] = arr[i][j];
            }
            c=0;
            p--;
        }
        System.out.println();
        System.out.println("Solution through Brute-force is: ");
        for(int i = 0; i < rotMax.length; i++){
            for(int j = 0; j < rotMax[0].length; j++){
                System.out.print(rotMax[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Solution through optimal approach is: ");
        //Optimal approach without extra space
        //Transposing the matrix
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //Reversing row wise
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; i < arr[0].length/2; i++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-1-j];
                arr[i][arr.length-1-j] = temp;
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
3
1 2 3
4 5 6
7 8 9
*/
