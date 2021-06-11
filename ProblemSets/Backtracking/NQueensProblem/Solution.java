package NQueensProblem;
import java.util.*;

public class Solution{
	//Main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		//Taking input for chess board metrices
		int n = sc.nextInt();
		int chess[][] = new int[n][n];

		//Making a initial function call
		printNQueens(chess, " ", n);
	}

	//Printing N Queens using recurrsion  
	public static void printNQueens(int chess[][],String qsf, int row){
		//
		if(row == chess.length){
			System.out.println(qsf+" . ");
			return;
		}

		for(int col = 0; col < chess.length; col++){
			if(isItSafePlaceForTheQueen(chess, row, col) == true){
				//Before Recusing (Operation on the current node)
				chess[row][col] = 1;
				//Resurrsive call
				printNQueens(chess, qsf + row + " - " + col + " , ", row+1);
				//Backtracking
				chess[row][col] = 0;
			}
		}
	}

	public static boolean isItSafePlaceForTheQueen(int chess[][], int row, int col){
		for(int i = row-1, j = col; i >= 0; i--){
			if(chess[i][j] == 1){
				return false;
			}
		}
		for(int i = row-1, j = col-1; i >=0 && j >= 0; i--,j--){
			if(chess[i][j] == 1){
				return false;
			}
		}
		for(int i = row-1, j = col +1; i >=0 && j< chess.length; i--, j++){
			if(chess[i][j] == 1){
				return false;
			}
		}
		return true;
	}
}