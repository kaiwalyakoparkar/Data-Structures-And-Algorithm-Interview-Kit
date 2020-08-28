package Encapsulation;
import java.util.Scanner;
//Importing the class from other java file.
import Encapsulation.AccessGranters.Student;

public class Encapsulation_Main {

	public static void main(String[] args) {
		
		//Declaring class
		Student stud = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age of the student");
		int n = sc.nextInt();
		//Accessing the class objects
		stud.setAge(n);
		int returnedAge = stud.GetAge();
		sc.close();
		
		System.out.println("The entered age is "+returnedAge);
	}
}
