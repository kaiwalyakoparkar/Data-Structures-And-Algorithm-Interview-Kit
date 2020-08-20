import java.util.Scanner;

public class Taking_user_input {
    
    public static void public static void main(String[] args) {
        
        //using scanner as a datatype as sc as a name
        System.out.println("Enter Your Age : ");
        Scanner sc = new Scanner(System.in);//This tells compiler that it is going to store the input 
        int age = sc.nextInt(); 
        //This initiates the input method
        //Also it signifes that the age is integer
         System.out.println("Your age is :");
        System.out.println(age);//printing the taken input

        System.out.println("Enter your marks : ");
        float marks = sc.nextFloat();
        System.out.println("Your marks are :");
        System.out.println(marks);

        System.out.println("Enter your name");
        String name = sc.nextLine(); 
        System.out.println("Entered Name is : ");
        System.out.println(name);
       
        sc.close();
    }
}