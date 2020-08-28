package Practice_Strings;
import java.util.Scanner;

public class Reversing_the_words_in_the_string {

	public static void main(String[] args) {
		
		//imported the scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any sentece and I will reverse it:");
		//Took input as a string
		//sc.nextLine(); This is for avoiding the error on competitive platforms
		String sentence = sc.nextLine();
		sc.close();
		
		//Splited the string
		String allwords[] = sentence.split(" ");
		
		//Printed in reverse order
		for(int i=(allwords.length-1); i>=0; i--) {
			System.out.print(allwords[i]+" ");
		}
		
	}
}
