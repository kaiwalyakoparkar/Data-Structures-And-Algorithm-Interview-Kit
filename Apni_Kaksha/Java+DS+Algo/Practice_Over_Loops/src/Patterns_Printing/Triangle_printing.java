package Patterns_Printing;
import java.util.Scanner;

public class Triangle_printing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the triangle");
		int n = sc.nextInt();
		sc.close();
		
		for(int j=0; j<n ; j++) {
			
			for(int i=0; i<=j ; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
