/*
 *
 *@author : Kaiwalya Koparkar
 *@data : 17/09/2020
 *@resource : www.pepcoding.com
 * 
 */
package Recursion;
import java.util.*;

public class PrintIncreasing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		printIncreasing(n);
	}
	
	static void printIncreasing(int n) {
		
		if(n==0) {
			return;
		}
		printIncreasing(n-1);
		System.out.println(n);
		
	}
}
