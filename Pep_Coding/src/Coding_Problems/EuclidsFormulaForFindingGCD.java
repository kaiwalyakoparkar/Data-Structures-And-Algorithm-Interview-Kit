package Coding_Problems;
import java.util.*;
public class EuclidsFormulaForFindingGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        euclidAnswer(n1,n2);

    }
    public static void euclidAnswer(int n1,int n2){

        if(n2==0){
            System.out.print(n1);
            return ;
        }
        if(n1<n2){
            euclidAnswer(n1, n2%n1);
        }
        else if(n1>n2){
            euclidAnswer(n2, n1%n2);
        }
    }
}
