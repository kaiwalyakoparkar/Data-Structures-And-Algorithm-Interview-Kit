package CountPalindromicSubsequences;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        //Dynamic Programming solution
        int n = s.length();
        int[][] mat = new int[n][n];

        //Declaring all the places as negative
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                mat[i][j] = 0;
            }
        }

        for(int i = 0; i < mat.length; i++){
            for(int j = i; j < mat[0].length; j++){
                if(s.charAt(i)==s.charAt(j)){
                    if((j-i)<=1){
                        mat[i][j]=1;
                    }else if(mat[i+1][j-1]==1){
                        mat[i][j] = 1;
                    }
                }else{
                    mat[i][j] = 0;
                }
            }
        }

        //For debugging
        int counter=0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
                if(mat[i][j]==1){
                    counter++;
                }
            }
            System.out.println();
        }

        System.out.println("Solution is : "+counter);

    }
}
