package QuickRecall;
import java.util.Scanner;
public class TakingInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence as a string");
        String message = sc.nextLine();
        System.out.println("Enter the Integer");
        int x = sc.nextInt();
        System.out.println("Enter the Float value");
        float f = sc.nextFloat();



        //Printing the taken inputs from the user
        //The string
        System.out.println("The message was: "+message);
        //The integer
        System.out.println("The integer was: "+x);
        //The float
        System.out.println("The float is: "+f);

    }
}
