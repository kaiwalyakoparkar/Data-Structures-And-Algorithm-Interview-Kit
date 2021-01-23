//Left shift question HackerRank

package QuickRecall;
import java.util.Scanner;

public class LeftShift{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//This takes the no of elements in the array
        int r = sc.nextInt();//This takes the no of rotations
        int arr[] = new int[n];//Declared the array
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<=r; i++){
            int temp = arr[0];//Takes the first element
            shift(arr);
            arr[arr.length-1]=temp;//Puts it at the last
        }
        print(arr);
    }
    public static int[] shift(int arr[]){//Shifts the array
        for(int i = 0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        return arr;
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
