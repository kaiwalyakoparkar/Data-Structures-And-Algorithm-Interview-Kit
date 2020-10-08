package Coding_Problems;
import java.util.*;
public class GCDAndLCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int og1 = sc.nextInt();
        int og2 = sc.nextInt();
        int n1 = og1;
        int n2 = og2;

        while(n1%n2!=0){
            int rem = n1%n2;
            n1=n2;
            n2=rem;
        }

        int gcd = n2;
        int lcm = (og1*og2)/gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
