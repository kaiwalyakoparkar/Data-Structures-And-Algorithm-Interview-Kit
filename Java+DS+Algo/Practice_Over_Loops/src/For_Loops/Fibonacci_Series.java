package For_Loops;

import java.util.Scanner;

public class Fibonacci_Series {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=0;
		int b=1;
		int n = sc.nextInt();
		sc.close();
		
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0; i<n-2 ; i++) {
			int c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
		
	}
}
