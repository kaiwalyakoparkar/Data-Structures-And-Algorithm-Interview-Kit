package Coding_Problems;
import java.util.*;

public class Is_Prime_Number {

	public static void main(String[] main) {
		
		Scanner scn = new Scanner(System.in);
		int times = scn.nextInt();
		int[] num = new int[times];
		boolean found = false;
		for(int i=0 ; i<times ; i++) {
			num[i] = scn.nextInt();
		}
		scn.close();
		for(int j=0 ; j<(num.length-1); j++) {
			for(int k=2; k<(num[j]); k++) {
			
			if(num[j]%k==0) {
				System.out.println("not prime");
				found = true;
				break;
				}
			}
			if(found==false) {
			System.out.println("prime");
			}
		}


	}
}
