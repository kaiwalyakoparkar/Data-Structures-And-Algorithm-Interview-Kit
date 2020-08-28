package Code_Monk;
import java.util.Scanner;

public class Monk_and_Rotation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();//No of elements in an array
		int k = sc.nextInt();//No of iterations to be done
		int[] arr = new int[n];
		int len = arr.length;
		
		for(int i=0 ; i<arr[n] ; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		for(int j = 0 ; j <=k; j++) {
			
			int temp = arr[arr.length];
			
			for(int l=len;l>=0;l--) {
				
				if(l!=0) {
				
					arr[l]=arr[l-1];
				}
				
			}
			arr[0]=temp;
		}
		
		for(int loop = 0 ;loop <arr[len]; loop++) {
			
			System.out.print(arr[loop]+" ");
			
		}
		
	}
	
}
