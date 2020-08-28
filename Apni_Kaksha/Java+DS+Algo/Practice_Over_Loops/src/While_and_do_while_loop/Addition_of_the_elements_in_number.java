package While_and_do_while_loop;

import java.util.Scanner;

public class Addition_of_the_elements_in_number {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get addition");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		sc.close();
		
		while(temp>0){
			int LastDigit = temp%10;
			temp/=10;
			sum += LastDigit;
		}
		
		System.out.println("The sum of "+n+" is "+sum);
	}

}
