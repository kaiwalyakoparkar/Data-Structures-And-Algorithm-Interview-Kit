/*
 *
 * @author : Kaiwalya Koparkar
 * @date : 17/02/2020
 * @resource : www.pepcoding.com
 * 
 */
package Recursion;
import java.util.*;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		
		//write code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		pdi(n);
		
	}
	
	static void pdi(int n) {
		
		if(n==0) {
			return;
		}
		System.out.println(n);
		pdi(n-1);
		System.out.println(n);
	}
}
