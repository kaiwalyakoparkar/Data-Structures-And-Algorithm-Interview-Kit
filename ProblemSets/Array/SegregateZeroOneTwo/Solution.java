package SegregateZeroOneTwo;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sortingArr[] = new int[n];
        int threePointer[] = new int[n];
        int count[] = new int[n];
        for(int i = 0; i < sortingArr.length; i++){
            sortingArr[i] = sc.nextInt();
            threePointer[i] = count[i] = sortingArr[i];
        }

        //This is solution through sorting
        Arrays.sort(sortingArr);
        System.out.println("Segregation through sorting: ");
        for(int i = 0; i < sortingArr.length; i++){
            System.out.print(sortingArr[i]+" ");
        }

        //This is solution through counting
        int zero = 0;
        int one = 0;
        int two = 0;

        for(int i = 0; i < count.length; i++){
            if(count[i] == 0){
                zero++;
            }else if(count[i] == 1){
                one++;
            }else if(count[i] == 2){
                two++;
            }
        }

        for(int i = 0 ; i < count.length ; i++){
            if(zero != 0){
                count[i] = 0;
                zero--;
            }else if(one != 0){
                count[i] = 1;
                one--;
            }else if(two != 0){
                count[i] = 2;
                two--;
            }
        }

        System.out.println();
        System.out.println("Segregation through counting technique: ");

        for(int i = 0; i < sortingArr.length; i++){
            System.out.print(count[i]+" ");
        }

        //This is solution through 3 pointer
        int lo = 0;
        int hi = threePointer.length - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (threePointer[mid]) {
            case 0: {
                temp = threePointer[lo];
                threePointer[lo] = threePointer[mid];
                threePointer[mid] = temp;
                lo++;
                mid++;
                break;
            }
            case 1:
                mid++;
                break;
            case 2: {
                temp = threePointer[mid];
                threePointer[mid] = threePointer[hi];
                threePointer[hi] = temp;
                hi--;
                break;
            }
            }
        }
        System.out.println();
        System.out.println("Segregation through 3 pointer technique is: ");
        for(int i = 0; i < threePointer.length; i++){
             System.out.print(threePointer[i]+" ");
        }
    }
}
