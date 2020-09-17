/*
 * 
 * @author : Kaiwalya Koparkar
 * @date : 17/ 09/ 2020
 * @resource : www.pepcoding.com  
 * 
 */
package Recursion;
import java.util.*;

public class DisplayArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int idx = n-1;
		Display(arr,idx);
	}
	
	static void Display(int arr[], int i) {
		
		if(i<0) {
			return;
		}
		
		Display(arr, i-1);
		System.out.println(arr[i]);
	}
}
