/*
 * 
 *@author : Kaiwalya Koparkar
 *@date : 17/ 09/ 2020
 *@resource : www.pepcoding.com / Apni Kaksha(Youtube channel)
 * 
 */
package Recursion;
import java.util.*;

public class Factorial_of_n_numbers {

	public static void main(String[] main) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum = factorial(n);
		System.out.println(sum);
	}
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		
		int sum = n*factorial(n-1);
		return sum;
	}
}
