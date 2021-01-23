package QuickRecall;
import java.util.Scanner;
public class ArrayEverything {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //This program is to demonstrate the different types of declaring the array
        int arr1[] = {1,2,3,4,5};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        int arr2[] = new int[5];
        System.out.println("Enter the values of the second array: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
