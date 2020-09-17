/*
 * 
 *@author : Kaiwalya Koparkar
 *@date : 17/09/ 2020
 *@resource : www.pepcoding.com 
 * 
 */
package Recursion.Practice;
import java.util.*;

public class PracticeSet1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		pract1(n);
	}
	public static void pract1(int n){
		if(n==0) {
			return;
		}
		
		System.out.println(n);//when added up prints reverse
		pract1(n-1);
		System.out.println(n);//when added down prints ascending
	}
}
