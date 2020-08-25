package Array;
import java.util.Scanner;

public class Adding_two_matrix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter the columns");
		int column = sc.nextInt();
		
		int[][] a = new int[rows][column];
		int[][] b = new int[rows][column];
		int[][] add = new int[rows][column];
		
		//Taking A matrix
		System.out.println("Enter the first matrix:");
		for(int i=0 ; i<rows; i++) {
			for(int j=0 ; j<column ; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		//Taking b matrix
		System.out.println("Enter the Second matrix:");
		for(int i=0 ; i<rows; i++) {
			for(int j=0 ; j<column ; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		
		//Showing the addition of the matrix
		System.out.println("Enter the first matrix:");
		for(int i=0 ; i<rows; i++) {
			for(int j=0 ; j<column ; j++) {
				add[i][j] = a[i][j]+b[i][j];
				System.out.print(add[i][j]+ " ");
			}
			System.out.println();
		}
		
 		sc.close();
	}
}
