import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// Declaring the scan triggering variable

        System.out.println("Enter the number for factorial of it:");
        int Number = sc.nextInt();// Taking the input
        sc.close();// Closing the scanner function. This can be done at the end when we need to
                   // take many inputs at different intervals

        int Factorial = 1, loop;

        for (loop = Number; loop >= 1; loop--) {
            Factorial = (Factorial * Number);
            Number--;
        }

        System.out.println("Factorial of the given number is: " + Factorial);
    }
}