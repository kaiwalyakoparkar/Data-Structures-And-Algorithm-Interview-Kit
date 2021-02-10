package IfArrayIsSubsetOfAnotherArray;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();//Taking input for size of first array
        int n2 = sc.nextInt();//Taking input for size of second array
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0; i<arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        //This is Brute-Force Solution
        int flag[] = new int[n2];
        boolean isOne = true;

        for(int i=0; i < arr2.length; i++){
            for(int j=0; j<arr1.length; j++){
                if(arr2[i] == arr1[j]){
                    flag[i] = 1;
                }
            }
        }
        for(int i=0; i<flag.length; i++){
            if(flag[i] != 1){
                isOne = false;
            }
        }

        if(isOne == true){
            System.out.println("The answer through brute-force is True");
        }else{
            System.out.println("The answer through brute-force is False");
        }

        //This is Hashing Solution
        Set<Integer> hmp = new HashSet<>();
        int flag1[] = new int[n2];
        boolean isOne1 = true;
        for(int i=0; i<arr1.length; i++){
            hmp.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            if(hmp.contains(arr2[i])){
                flag1[i] = 1;
            }
        }
        for(int i=0; i<flag1.length; i++){
            if(flag1[i] != 1){
                isOne1 = false;
            }
        }

        if(isOne == true){
            System.out.println("The answer through Hashing is True");
        }else{
            System.out.println("The answer through Hashing is False");
        }

    }
}
