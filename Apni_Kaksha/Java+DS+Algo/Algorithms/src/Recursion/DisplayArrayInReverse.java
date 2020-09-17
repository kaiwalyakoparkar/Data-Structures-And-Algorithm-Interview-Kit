/*
 * 
 * @author : Kaiwalya Koparkar
 * @date : 17/ 09/ 2020
 * @resource : 
 * 
 * */
package Recursion;
import java.util.*;

public class DisplayArrayInReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int idx = 0;
		DisplayReverse(arr, idx);
	}
	
	static void DisplayReverse(int arr[], int i) {
		if(i>arr.length-1) {
			return;
		}
		
		DisplayReverse(arr,i+1);
		System.out.println(arr[i]);
	}
}
