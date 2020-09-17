/*
 *
 * @author : Kaiwalya Koparkar
 * @date : 17/ 09/ 2020
 * @resource : www.pepcoding.com
 * 
 */
package Recursion;
import java.util.*;


public class FindMaxOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int max = FindMax(arr,0);
		System.out.println(max);
	}
	
	static int FindMax(int arr[], int i) {
		
		if(i == arr.length - 1){
	         return arr[i];
	      }
	      
	      int misa = FindMax(arr, i + 1);
	      if(misa > arr[i]){
	         return misa;
	      } else {
	         return arr[i];
	      }
		
	}
}
