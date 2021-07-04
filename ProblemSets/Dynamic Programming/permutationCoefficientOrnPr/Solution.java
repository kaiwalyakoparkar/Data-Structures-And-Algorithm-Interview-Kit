package permutationCoefficientOrnPr;
import java.util.*;

public class Solution{

	//This solution is of O(N) time and O(1) space complexity
	public static void ONComplexitynPr(int n, int k){
		int fact[] = new int[n+1];
		fact[0] = 1;

		for(int i = 1; i < fact.length; i++){
			fact[i] = i * fact[i-1];
		}

		System.out.println("Solution is: "+fact[n]/fact[n-k]);
	}

	//This solution is of O(N) time and O(1) space complexity
	public static void O1ComplexitynPr(int n, int k){
		int ans = 1;

		for(int i = 0; i < k; i++){
			ans *= (n-i);
		}

		System.out.println("Solution is: "+ans);
	}

	//This is the main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		ONComplexitynPr(n,k);
		O1ComplexitynPr(n,k);
	}
}