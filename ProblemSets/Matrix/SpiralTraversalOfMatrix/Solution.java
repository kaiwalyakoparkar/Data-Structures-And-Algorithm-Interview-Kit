package SpiralTraversalOfMatrix;
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

        int min = 0;
        int max = arr.length-1;

        while(min < max){
            //up wall
            for(int i = min; i <= max; i++){
                System.out.print(arr[min][i]+" ");
            }
            //right wall
            for(int i = min+1; i <= max; i++){
                System.out.print(arr[i][max]+" ");
            }
            //down wall
            for(int i = max-1; i >=min; i--){
                System.out.print(arr[max][i]+" ");
            }
            //right wall

            for(int i = max-1; i > 0; i--){
                if(i != min){
                    System.out.print(arr[i][min]+" ");
                }
            }
            min++;
            max--;
        }
    }
}
/*
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
*/
