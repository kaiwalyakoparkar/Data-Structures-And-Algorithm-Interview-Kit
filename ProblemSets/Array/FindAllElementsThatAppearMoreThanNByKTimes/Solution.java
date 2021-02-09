package FindAllElementsThatAppearMoreThanNByKTimes;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //HashMap approach
        int x = n/k;

        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i < arr.length; i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i], 1);
            }else{
                int count = mp.get(arr[i]);
                mp.put(arr[i], count+1);
            }
        }
        for(Map.Entry en : mp.entrySet()){
            Integer temp = (Integer)en.getValue();
            if(temp > x){
                System.out.print(en.getKey()+" ");
            }
        }
    }
}
