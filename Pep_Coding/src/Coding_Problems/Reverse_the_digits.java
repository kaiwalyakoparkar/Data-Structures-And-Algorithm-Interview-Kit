package Coding_Problems;
import java.util.*;
public class Reverse_the_digits {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String number = scn.nextLine();
		scn.close();
		int l = number.length();
		for(int i=(l-1); i>=0; i--) {
			System.out.println(number.charAt(i));
		}
	}
}
