package SegregateNegativeAndPositive;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sortArr[] = new int[n];
        int zeroRef[] = new int[n];
        for(int i = 0; i < sortArr.length; i++){
            sortArr[i] = sc.nextInt();
            zeroRef[i] = sortArr[i];
        }

        //This is sorting solution
        Arrays.sort(sortArr);
        System.out.println("Segregation through sorting is: ");
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i]+" ");
        }
        System.out.println();


        //This is 0 reference solution
        int j = 0;
        for(int i = 0; i < zeroRef.length; i++){
            if(zeroRef[i] < 0){
                if(i != j){
                    int temp = zeroRef[i];
                    zeroRef[i] = zeroRef[j];
                    zeroRef[j] = temp;
                }
                j++;
            }
        }

        System.out.println("Segregation through O reference method is: ");
        for(int i = 0; i < zeroRef.length; i++){
            System.out.print(zeroRef[i]+" ");
        }
        System.out.println();
    }
}
