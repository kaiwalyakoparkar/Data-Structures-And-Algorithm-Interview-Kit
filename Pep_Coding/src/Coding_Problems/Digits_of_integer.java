package Coding_Problems;
import java.util.*;

public class Digits_of_integer {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String number = scn.nextLine();
		scn.close();
		int i = number.length();
		for(int j=0; j<i; j++) {
			System.out.println(number.charAt(j));
		}
	}
}
