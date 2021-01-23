package QuickRecall;
import java.util.Scanner;
public class DeclaringArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];//Declaring array

        //Taking inputs in array
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        //Displaying the array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
