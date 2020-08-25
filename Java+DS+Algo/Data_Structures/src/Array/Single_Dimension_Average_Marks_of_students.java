package Array;
import java.util.Scanner;

public class Single_Dimension_Average_Marks_of_students {
	
	public static void main(String[] args) {
		
		int [] marks = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Marks of the student :");
		
		int addition=0;
		for(int i=0 ; i<5 ; i++) {
			marks[i]=sc.nextInt();
			addition += marks[i];//Means addition = addition + marks[i]
		}
		sc.close();
		//Taking average
		int average = (addition/5);
		System.out.println("Total marks are: "+addition);
		System.out.println("Average marks of the student is: "+average);
		
	}
}
