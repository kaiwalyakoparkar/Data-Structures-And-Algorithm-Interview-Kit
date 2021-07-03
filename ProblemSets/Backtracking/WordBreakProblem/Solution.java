package WordBreakProblem;
import java.util.*;

public class Solution{

	//This is the word break method
	public static void wordBreak(String str, String ans, HashSet<String> dict){

		if(str.length() == 0){
			System.out.println(ans);
			return;
		}

		for(int i = 0; i < str.length(); i++){
			String left = str.substring(0, i+1);

			if(dict.contains(left)){
				String right = str.substring(i+1);
				wordBreak(right, ans = left+" ", dict);
			}
		}
	}

	//This is the main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		HashSet<String> dict = new HashSet<>();
		for(int i = 0; i < n; i++){
			dict.add(sc.next());
		}

		String msg = sc.next();
		wordBreak(msg, "", dict);

	}
}