package For_Loops;
import java.util.Scanner;

public class Fraction_Addition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		float result = 0;
		for(int i=1; i<=n ; i++) {
			
			result += (1/i);
		}
		
		System.out.println("The result of the fractional addition is: "+ result);
	}
	
}
