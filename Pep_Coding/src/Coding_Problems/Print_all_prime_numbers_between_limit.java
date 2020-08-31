package Coding_Problems;
import java.util.*;
public class Print_all_prime_numbers_between_limit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Starting:");
		int startno = sc.nextInt();
		System.out.println("Ending");
		int endno = sc.nextInt();
		sc.close();
		//Looping
		for(int i=(startno+1); i<endno ; i++) {
			int div =2;
			while(div*div<=i) {
				if(i%div==0) {
					break;
				}
				div++;
			}
			if(div*div>i) {
				System.out.println(i);
			}
			else {
				continue;
			}
		}
		
	}
}
