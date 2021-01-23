package QuickRecall;
import java.util.Scanner;
public class Operators {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition is:"+(a+b));//does addition
        System.out.println("Subtractions is: "+(a-b));//does subtraction
        System.out.println("Multiplication is: "+(a*b));//does multiplication
        System.out.println("Division is: "+(a/b));//does division
        System.out.println("Modulus is: "+(a%b));//does modulus
    }
}
