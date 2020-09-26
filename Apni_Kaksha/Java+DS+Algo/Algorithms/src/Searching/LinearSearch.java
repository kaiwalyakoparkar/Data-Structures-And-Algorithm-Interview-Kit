/*
 * @author: Kaiwalya Koparkar
 * @TimeStamp: 5:28 pm Saturday, 26 September 2020 (IST)
 *
 */
package Searching;
import java.util.*;
public class LinearSearch {

	public static int search(int arr[], int size, int element) {
		
		for(int i=0; i<size; i++) {
			if(arr[i]==element) {
				return i;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int element = sc.nextInt();       
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int result = search(arr, size, element);
		
		if(result == -1) {
			System.out.println("Element not found");
			
		}else {
			System.out.println("Element found at"+result);
		}
	}
}
