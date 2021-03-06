package FindSpecificPairInMatrix;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        //Brute-force approach with O(n^4) complexity
        int maxValue = Integer.MIN_VALUE;

        // Consider all possible pairs mat[a][b] and
        // mat1[d][e]
        for (int a = 0; a < n - 1; a++){
          for (int b = 0; b < n - 1; b++){
             for (int d = a + 1; d < n; d++){
               for (int e = b + 1; e < n; e++){
                   if (maxValue < (mat[d][e] - mat[a][b])){
                       maxValue = mat[d][e] - mat[a][b];
                   }
               }
             }
          }
        }

        System.out.println("Solution through bruteforce is: "+maxValue);

        //This is optimal solution with O(n^2) complexity

        //stores maximum value
        int maxValue2 = Integer.MIN_VALUE;

        // maxArr[i][j] stores max of elements in matrix
        // from (i, j) to (N-1, N-1)
        int maxArr[][] = new int[n][n];

        // last element of maxArr will be same's as of
        // the input matrix
        maxArr[n-1][n-1] = mat[n-1][n-1];

        // preprocess last row
        int maxv = mat[n-1][n-1];  // Initialize max
        for (int j = n - 2; j >= 0; j--)
        {
            if (mat[n-1][j] > maxv)
                maxv = mat[n - 1][j];
            maxArr[n-1][j] = maxv;
        }

        // preprocess last column
        maxv = mat[n - 1][n - 1];  // Initialize max
        for (int i = n - 2; i >= 0; i--)
        {
            if (mat[i][n - 1] > maxv)
                maxv = mat[i][n - 1];
            maxArr[i][n - 1] = maxv;
        }

        // preprocess rest of the matrix from bottom
        for (int i = n-2; i >= 0; i--)
        {
            for (int j = n-2; j >= 0; j--)
            {
                // Update maxValue
                if (maxArr[i+1][j+1] - mat[i][j] > maxValue2)
                    maxValue2 = maxArr[i + 1][j + 1] - mat[i][j];

                // set maxArr (i, j)
                maxArr[i][j] = Math.max(mat[i][j],
                        Math.max(maxArr[i][j + 1],
                                       maxArr[i + 1][j]) );
            }
        }

        System.out.println("Optimal Solution is : "+maxValue2);
    }
}
/*
5
1 2 -1 -4 -20
-8 -3 4 2 1
3 8 6 1 3
-4 -1 1 7 -6
0 -4 10 -5 1
 */
