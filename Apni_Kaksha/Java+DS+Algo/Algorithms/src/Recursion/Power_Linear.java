/*
 * 
 * @author : Kaiwalya Koparkar
 * @date : 17/09/2020
 * @resource : www.pepcoding
 * 
 */
package Recursion;
import java.util.*;

public class Power_Linear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//this is the power
		int x = sc.nextInt();//this is the base
		sc.close();
		int ans = power(n,x);
		System.out.println(ans);
	}
	
	static int power(int n, int x) {
		
		if(x == 0){
		      return 1;
		}
		int xpnm1 = power(n, x - 1);
		int xpn = xpnm1 * n;
		return xpn;
		
	}
}
