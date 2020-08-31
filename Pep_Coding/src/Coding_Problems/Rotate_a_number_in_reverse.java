package Coding_Problems;
import java.util.*;
//import java.math.*;

public class Rotate_a_number_in_reverse {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        scn.close();
        int nod = 0;
        int temp = n;
        while(temp != 0){
            temp /= 10;
            nod++;
        }

        k = k % nod;
        if(k < 0)
            k += nod;

        int div = 1;
        int mult = 1;
        for(int i = 1; i <= nod; i++){
            if(i <= k)
                div *= 10;
            else 
                mult *= 10;
        }

        int quo = n / div;
        int rem = n % div;

        int r = rem * mult + quo;
        System.out.println(r);
    }
}
