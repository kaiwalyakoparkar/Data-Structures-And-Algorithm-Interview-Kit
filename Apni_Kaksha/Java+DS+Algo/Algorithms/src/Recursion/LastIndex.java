/*
 * 
 *@author : Kaiwalya Koparkar
 *@date : 17 / 09/ 2020
 *@resource : www.pepcoding.com
 * 
 */
package Recursion;
import java.util.*;

public class LastIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		sc.close();
		int li = lastIndex(arr,0,x);
		System.out.println(li);
	}
	static int lastIndex(int[] arr, int i, int x){
		if(i == arr.length){
		    return -1;
		 }

		 int liisa = lastIndex(arr, i + 1, x);
		 if(liisa != -1){
		    return liisa;
		 } else if(arr[i] == x){
		    return i;
		 } else {
		    return -1;
		 }
	}
}


