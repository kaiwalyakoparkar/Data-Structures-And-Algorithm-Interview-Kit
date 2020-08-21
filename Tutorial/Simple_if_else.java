import java.util.Scanner;
public class Simple_if_else {
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your age : ");
        int age = sc.nextInt();

        if(age>=18){//checks the condition and executed
            System.out.println("Congrats you can vote !");//If True
        }
        else{
            System.out.println("Sorry You Cannot Vote yet!");//If False
        }
        sc.close();
        
    }

}