package QuickRecall;
import java.util.Scanner;

public class DoWhileLoop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        do{
            System.out.println(" "+n);
            n++;
        }while(n<=100);
    }
}
