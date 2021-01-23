package QuickRecall;
import java.util.Scanner;
public class IfElseEverything {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //This is the demo program of grading system
        System.out.println("Enter your percentage to get your grade: ");
        int per = sc.nextInt();

        //This is if-else
        if(per>100){
            System.out.println("The percentage should be below 100% ");
        }else if(per<100 && per>80){
            System.out.println("Your grade is A");
        }else if(per<80 && per>60){
            System.out.println("Your grade is B");
        }else if(per<60 && per>20){
            System.out.println("Your grade is C !! You need to work harder");
        }else{
            System.out.println("You are fail !! No worries you can still try");
        }
    }
}
