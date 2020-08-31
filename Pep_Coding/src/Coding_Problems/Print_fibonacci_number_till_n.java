package Coding_Problems;
import java.util.*;

public class Print_fibonacci_number_till_n {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the limit!");
		int n = scn.nextInt();//10
		scn.close();
		int i=0;
		int j=1;
		System.out.println(i);
		System.out.println(j);
		for(int l=0; l<(n-2); l++) {
			int k = i + j;
			System.out.println(k);
			i = j;
			j = k;
		}
	}
}
