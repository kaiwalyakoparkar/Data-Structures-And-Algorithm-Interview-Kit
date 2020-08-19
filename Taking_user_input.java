import java.util.Scanner;

public class Taking_user_input {
    
    public static void public static void main(String[] args) {
        
        //using scanner as a datatype as sc as a name
        System.out.println("Enter Your Age : ");
        Scanner sc = new Scanner(System.in);//This tells compiler that it is going to store the input 
        int age = sc.nextInt();//This initiates the input method
        System.out.println("Your age is :");
        System.out.println(age);//printing the taken input
    }
}