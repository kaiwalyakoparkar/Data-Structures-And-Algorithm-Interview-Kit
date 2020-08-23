package PrimeNumber;
import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number You want to check :");
		int num = sc.nextInt();
		sc.close();
		
		int flag;
		for(int i=2; i < num ; i++) {
			if(num%i==0) {
				flag=1;
				System.out.println("It is a not prime number");
				break;
			}else {
				flag=0;
				System.out.println("It is a prime number");
				break;
			}
		}
		
	}
}
