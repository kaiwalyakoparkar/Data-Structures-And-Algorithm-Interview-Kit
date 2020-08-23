package For_Loops;

import java.util.Scanner;

public class Prime_Number {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number You want to check :");
		int num = sc.nextInt();
		sc.close();
		
		
		for(int i=2; i < num ;i++) {
			if(num%i==0) {
				System.out.println("It is a not prime number");
				break;
			}else {
				System.out.println("It is a prime number");
				break;
			}
		}
		
	}
}
