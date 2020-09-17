/*
 * 
 *@author : Kaiwalya Koparkar
 *@date : 17/09/2020
 *@resource : www.pepcoding.com 
 *
 */
package Recursion;
import java.util.*;

public class PrintDecreasing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		printDecreasing(n);
		
	}
	
	static void printDecreasing(int n){
		
		if(n==0) {
			return;
		}
		System.out.println(n);
		printDecreasing(n-1);
		
	}
}
