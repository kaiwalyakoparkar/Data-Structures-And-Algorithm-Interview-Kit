package QuickRecall;
import java.util.Scanner;
public class ForLoop {
    public static void main(String args[]){
        //This program demonstrates the for loop as a recall
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stars");
        int n = sc.nextInt();

        //This will print the pyramid of the stars
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
