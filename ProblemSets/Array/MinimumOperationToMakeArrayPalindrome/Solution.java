package MinimumOperationToMakeArrayPalindrome;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }

        //Search and swap solution
        int i = 0, j = n-1,flag = 0;
        while(i < j){
            if(arr[i]!=arr[j]){
                for(int k = j-1; k <= (n/2)+1; k--){
                    if(arr[k]==arr[i]){
                        int temp = arr[j];
                        arr[j] = arr[k];
                        arr[k] = temp;
                        flag++;
                        break;
                    }
                }
            }
            i++;
            j--;

        }
        System.out.println("No of operation to be done are : "+flag);

        //Using Hash Map
        Map<Integer,Integer> mp = new HashMap<>();
        int counter = 0;
        for(int a = n/2; a < arr2.length; a++){
            mp.put(arr2[a],a);
        }

        int a = 0, b = n-1;
        while(a <= b){
            if(arr2[a] != arr2[b]){
                if(mp.containsKey(arr2[a])){
                    int k = mp.get(arr2[a]);
                    int temp = arr2[b];
                    arr2[b] = arr2[k];
                    arr2[k] = temp;
                    counter++;
                }
            }
            a++;
            b--;
        }
        System.out.println("No of operation through maps are : "+counter);
    }
}
