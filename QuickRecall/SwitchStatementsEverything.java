package QuickRecall;
import java.util.Scanner;
public class SwitchStatementsEverything {
    public static void main(String args[]){
        //This program is for revising switch
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Letter in the Alphabet");
        String alpha = sc.nextLine();

        //This program illustrates vowels and consonants
        switch(alpha){
            case "A":
            case"a":
            case"E":
            case"e":
            case"I":
            case"i":
            case"O":
            case"o":
            case"U":
            case"u":
                System.out.println("This is Vowel");
                break;
            default:
                System.out.println("This is Consonant");
                break;
        }

    }
}
