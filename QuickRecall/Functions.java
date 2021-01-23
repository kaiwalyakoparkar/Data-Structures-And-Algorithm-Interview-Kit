package QuickRecall;
import java.util.Scanner;
public class Functions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        DisplayArray(array);
    }

    public static void DisplayArray(int array[]){
        System.out.println("Entered the DisplayArray function");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
