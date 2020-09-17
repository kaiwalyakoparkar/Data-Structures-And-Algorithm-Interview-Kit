/*
 * 
 *@author : Kaiwalya Koparkar
 *@date : 17/ 09/ 2020
 *@resource : www.pepcoding.com
 * 
 */
package Recursion;
import java.util.*;


public class FindAllIndices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int[] iarr = allIndices(arr, x, 0, 0);
        sc.close();
        
        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
	}
	static int[] allIndices(int[] arr,int x,int idx,int fsf){
		if(idx == arr.length){
            return new int[fsf];
        }
        
        int[] iarr;

        if(arr[idx] == x){
            iarr = allIndices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
        } else {
            iarr = allIndices(arr, x, idx + 1, fsf);
        }
        
        return iarr;
	}
}
