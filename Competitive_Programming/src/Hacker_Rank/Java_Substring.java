package Hacker_Rank;
import java.util.*;

public class Java_Substring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String Statement = sc.nextLine();
		int start = sc.nextInt();
		int end = sc.nextInt();
//		end = end-1;
		sc.close();
		
		System.out.println(Statement.substring(start,end));
		
	}
}
