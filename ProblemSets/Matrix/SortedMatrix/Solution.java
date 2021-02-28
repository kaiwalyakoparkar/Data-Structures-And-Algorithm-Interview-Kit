package SortedMatrix;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int temp[] = new int[n*n];
        int curr = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
                temp[curr] = arr[i][j];
                curr++;
            }
        }

        //Sorting the matrix
        Arrays.sort(temp);
        curr=0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = temp[curr];
                curr++;
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
4
10 20 30 40
15 25 35 45
27 29 37 48
32 33 39 50
*/
