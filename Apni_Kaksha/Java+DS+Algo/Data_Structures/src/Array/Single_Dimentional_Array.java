package Array;

import java.util.Scanner;

public class Single_Dimentional_Array {
	
	public static void main(String[] args) {
		
		int[] marks = new int[5];//We you don't know the elements and size of the array in the array
//	int[] enrollment = {3,5,6,8,9};//When you know the elements, The compiler will define the size of the array itself.
		
//		System.out.println(enrollment[3]);
//		System.out.println(marks[0]);
		
		System.out.println("Enter the marks :");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			
			marks[i]=sc.nextInt();
		}
		sc.close();
		
		System.out.println("The roll no are: ");
		for(int j=0; j<5; j++) {
			System.out.println(marks[j]);
		}
	}

}
