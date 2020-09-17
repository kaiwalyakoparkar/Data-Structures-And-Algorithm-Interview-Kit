/*
 *
 * @author : Kaiwalya Koparkar
 * @date : 17/09/2020
 * @resource : www.pepcoding.com
 * 
 */
package Recursion;
import java.util.*;

public class FirstIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		sc.close();
		int fi = firstIndex(arr,0,x);
		System.out.println(fi);
		
	}
	static int firstIndex(int[] arr, int i, int x){
		if(i==arr.length-1) {
			return -1;
		}
		
		if(arr[i]==x) {
			return i;
		}else {
			int fisa = firstIndex(arr,i+1,x);
			return fisa;
		}
		
	}
}
