package SubArrayWithZeroSum;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < arr.length;i++){
            arr[i] = sc.nextInt();
        }

        //Solution
        Set<Integer> hst = new HashSet<>();
        int sum = 0;
        boolean isZero = false;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == 0 || arr[i] == 0 || hst.contains(sum)) {
                isZero = true;
            }

            hst.add(sum);
        }
        if(isZero == true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
