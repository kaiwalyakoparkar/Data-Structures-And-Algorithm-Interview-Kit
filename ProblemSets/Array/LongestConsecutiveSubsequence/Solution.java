package LongestConsecutiveSubsequence;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            temp[i] = arr[i];
        }

        //Brute-force solution
        Arrays.sort(temp);
        int subseq = 1;
        int tempseq = 1;
        for(int i=0;i<temp.length-1; i++){
            if(temp[i]+1 == temp[i+1]){
                tempseq++;
            }else if(subseq < tempseq){
                subseq = tempseq;
                tempseq = 1;
            }else{
                tempseq = 1;
            }
        }

        if(tempseq != subseq && subseq == 1){
            System.out.println("Solution Trough naive approach is: "+tempseq);
        }else{
             System.out.println("Solution Trough naive approach is: "+subseq);
        }

        //Optimal Approach
        Set<Integer> hashSet = new HashSet<>();
        int longSubSeq = 1;
        for(int i=0; i<arr.length; i++){
            hashSet.add(arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            int currentNum = i;
            int currentSeq = 1;

            if(!hashSet.contains(arr[i]-1)){
                 while(hashSet.contains(arr[i]+1)){
                    currentNum += 1;
                    currentSeq += 1;
                }

                longSubSeq = Math.max(currentSeq,longSubSeq);
            }
        }

        System.out.println("The Solution through hashset is: "+longSubSeq);
    }
}
