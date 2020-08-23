package Raise_to_the_power_problem;
import java.util.Scanner;

public class Raise_to_the_power_problem{
	
	public static void main(String[] args) {
		
		//This programs intention is not to use he built in library pow()
		//but to do it by loops
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the base: ");
		int base = sc.nextInt();
		System.out.println("Please enter the power:");
		int power = sc.nextInt();
		int result=1;
		sc.close();
		
		for(int i=0; i<power ; i++) {
			
			result *= base;//That means result = result*a
		}
		
		System.out.println("The answer is : "+result);
	}
}
