package GradingStudents;
import java.util.*;

public class Solution {
	
	public static void rounded(int[] arr) {
		
		for(int i=0;i<arr.length; i++) {
			
			if(arr[i]<40) {
				if((arr[i]+1)%5==0 && arr[i]+2 == 40) {
					arr[i] = arr[i]+1;
					System.out.println(arr[i]);
					continue;
				}else if((arr[i]+2)%5==0 && arr[i]+2 == 40) {
					arr[i] = arr[i]+2;
					System.out.println(arr[i]);
					continue;
				}else {
					System.out.println(arr[i]);
					continue;
				}
				
			}else if(arr[i]%5==0) {
				System.out.println(arr[i]);
				continue;
			}else if((arr[i]+1)%5==0) {
				arr[i] = arr[i]+1;
				System.out.println(arr[i]);
				continue;
			}else if((arr[i]+2)%5==0) {
				arr[i] = arr[i]+2;
				System.out.println(arr[i]);
				continue;
			}else {
				System.out.println(arr[i]);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		rounded(arr);
		sc.close();
	}
}
