package QuickRecall;
import java.util.Scanner;
public class StringsEverything {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Normal sting usage
//        System.out.println("Enter the string argument: ");
//        String argument = sc.nextLine();
//        System.out.println(argument);

        //String functions
        String mes = "Hello this . is kaiwalya";
        String com = "Hello this is ketan";
        System.out.println(mes);
        System.out.println("Character on third position is: "+mes.charAt(3));
        System.out.println("Length of string is: "+mes.length());
        System.out.println("Substring is: "+mes.substring(5));
        System.out.println("Second substring with 2 argument is: "+mes.substring(7,10));
        System.out.println("Does string contain: "+mes.contains("kaiwalya"));
        System.out.println("Is it equal to 2 string: "+mes.equals(com));
        System.out.println("Checks if string is empty: "+mes.isEmpty());
        System.out.println("Connects 2 strings: "+mes.concat(com));
        System.out.println("Replaces one element with other: "+mes.replace('H','G'));
        System.out.println("After replacement: "+mes);
        System.out.println("Finds index of passed character: "+mes.indexOf('k'));
        System.out.println("Converts string to uppercase: "+mes.toUpperCase());
        System.out.println("After conversion"+mes);
        System.out.println("Converts string to lowercase: "+mes.toLowerCase());
        System.out.println("After conversion"+mes);
        System.out.println("Trims the string from the symbol: "+mes.trim());
        System.out.println("After conversion"+mes);
    }
}
