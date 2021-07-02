package binomialCoefficientOrnCr;
import java.util.*;

public class Solution{

	//This is a binomial method
	public static int nCr(int n, int r){

		if(n <= r){
			return 0;
		}

		int dp[] = new int[r+1];

		dp[0] = 1;

		//Debugging purpose only
		// for(int a = 0; a < dp.length; a++){
		// 	System.out.print(dp[a]+" ");
		// }
		// System.out.println();

		for(int i = 0; i < n; i++){

			//Main logic
			for(int j = dp.length-1; j > 0; j--){
				dp[j] = dp[j]+dp[j-1];
			}

			//Debugging purpose only
			// for(int a = 0; a < dp.length; a++){
			// 	System.out.print(dp[a]+" ");
			// }
			// System.out.println();
		}

		return dp[dp.length-1];
	}

	//This is the main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();//This takes n value
		int r = sc.nextInt();//This takes r value

		int ans = nCr(n, r);

		System.out.println("The answer is: "+ans);
	}
}