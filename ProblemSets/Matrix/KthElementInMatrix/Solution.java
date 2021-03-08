package KthElementInMatrix;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //This is brute-force approach
        int brut[] = new int[n*n];
        int p = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                brut[p++]=arr[i][j];
            }
        }
        Arrays.sort(brut);
        System.out.println("Solution through bruteforce is: "+brut[k-1]);

        //This is optimal Approach using min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < brut.length; i++){
            pq.add(brut[i]);
        }
        for(int i = 1; i < k; i++){
            pq.poll();
        }
        System.out.println("Solution through optimal approach is: "+pq.peek());
    }
}
/*
4 3
16 28 60 64
22 41 63 91
27 50 87 93
36 78 87 94
*/
