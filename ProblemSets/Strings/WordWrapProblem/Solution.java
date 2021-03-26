package WordWrapProblem;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution {
    static int INF = Integer.MAX_VALUE;
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
		    int n = in.nextInt();
		    int [] arr = new int[n];
		    for(int i=0 ; i<n ; i++)
		        arr[i] = in.nextInt();
		    int m = in.nextInt();      
		    
		    solveWordWrap(arr, n ,m);
		    System.out.println("");
		}
	}
	
    public static void solveWordWrap (int l[], int n, int M)  {  
    
        int[][] extras= new int[n+1][n+1];  
        int[][] lc = new int[n+1][n+1];  
        int[] c = new int[n+1];  
        int[] p = new int[n+1];  
  
        int i, j;  
        for (i = 1; i <= n; i++)  {  
            extras[i][i] = M - l[i-1];  
            for (j = i+1; j <= n; j++)  
                extras[i][j] = extras[i][j-1] - l[j-1] - 1;  
        }  
  
        for (i = 1; i <= n; i++) {     
            for (j = i; j <= n; j++) {  
                if (extras[i][j] < 0)  
                    lc[i][j] = INF;  
                else if (j == n && extras[i][j] >= 0)  
                    lc[i][j] = 0;  
                else
                    lc[i][j] = extras[i][j]*extras[i][j];  
            }  
        }  
        c[0] = 0;  
        for (j = 1; j <= n; j++)  {  
            c[j] = INF;  
            for (i = 1; i <= j; i++) {  
                if (c[i-1] != INF && lc[i][j] != INF &&  
                    (c[i-1] + lc[i][j] < c[j])) {  
                    c[j] = c[i-1] + lc[i][j];  
                    p[j] = i;  
                }  
            }  
        }  
        printSolution(p, n);  
    }
    
    public static int printSolution (int p[], int n) {  
        int k;  
        if (p[n] == 1)  k = 1;  
        else
            k = printSolution (p, p[n]-1) + 1;  
            System.out.print(p[n] +" "+n+" ");
        
        return k;  
    }  
}
