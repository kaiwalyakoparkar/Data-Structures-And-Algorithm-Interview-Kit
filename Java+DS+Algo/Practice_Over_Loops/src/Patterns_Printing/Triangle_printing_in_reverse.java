package Patterns_Printing;
import java.util.Scanner;
public class Triangle_printing_in_reverse {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of the triangle");
		int n = sc.nextInt();
		sc.close();
		
		for(int j=n; j>0 ; j--) {
			
			for(int i=j; i>0 ; i--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

