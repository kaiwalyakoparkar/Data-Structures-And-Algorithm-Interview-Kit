package CommonElementsInAllRows;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0 ; j < mat[0].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        //This is optimal solution with time complexity of O(m * n)
        Map<Integer,Integer> mp = new HashMap<>();
        for (int j = 0; j < m; j++){
            mp.put(mat[0][j], 1);
        }
        for (int i = 1; i < n; i++){
            for (int j = 0; j < m; j++) {
                // If element is present in the map and
                // is not duplicated in current row.
                if (mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i){
                    // we increment count of the element
                    // in map by 1
                    mp.put(mat[i][j], i + 1);

                    // If this is last row
                    if (i == n - 1){
                        System.out.print(mat[i][j] + " ");
                    }
                }
            }
        }


    }
}
/*
4 5
1 2 1 4 8
3 7 8 5 1
8 7 7 3 1
8 1 2 7 9
*/
