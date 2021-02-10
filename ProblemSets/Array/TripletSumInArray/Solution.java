package TripletSumInArray;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean found = false;
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //This is bruteforce solution with O( n ^ 3 ) complexity
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int l = j+1; l < arr.length; l++){
                    if(arr[i] + arr[j] + arr[l] == k){
                        found = true;
                        break;
                    }
                }
            }
        }

        if(found == true){
            System.out.println("Answer through brute-force approach is true");
        }else{
            System.out.println("Answer through brute-force approach is false");
        }

        //This is optimal solution with O( n ^ 2) complexity
        Arrays.sort(arr);
        boolean found1 = false;
        for(int i = 0; i < arr.length-2;){
            int s = k - arr[i];
            int j = i+1;
            int l = arr.length-1;
            while(j < l){
                if(arr[j] + arr[l] == s){
                    found1 = true;
                    break;
                }else if(arr[j]+arr[l] < s){
                    j++;
                }else{
                    k--;
                }
            }
        }

        if(found1 == true){
            System.out.println("Answer through optimal approach is true");
        }else{
            System.out.println("Answer through optimal approach is false");
        }
    }
}
