//Reversing the array

package QuickRecall;

import java.util.Scanner;

public class ReverseTheArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Take the size of the array
        int arr[] = new int[n];//Declared the array
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]+" ");
        }
    }
}
