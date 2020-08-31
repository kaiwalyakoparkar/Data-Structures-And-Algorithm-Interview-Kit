package Coding_Problems;
import java.util.*;

public class Grading_system 
{

	public static void  main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		if(marks>90) 
		{
			System.out.println("excellent");
		}
		else if(marks>80 && marks<=90) 
		{
			System.out.println("good");
		}
		else if(marks>70 && marks<=80)
		{
			System.out.println("fair");
		}
		else if(marks>60 && marks<=70)
		{
			System.out.println("meets expectation");
		}
		else if(marks<=60)
		{
			System.out.println("below par");
		}
		else
		{
			System.out.println("Invalid Input");
		}
		sc.close();
		
	}
}
