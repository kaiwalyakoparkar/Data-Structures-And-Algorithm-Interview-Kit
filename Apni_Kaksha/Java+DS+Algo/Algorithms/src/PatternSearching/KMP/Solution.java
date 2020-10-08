package PatternSearching.KMP;
import java.util.*;
public class Solution {

    /*This program is only for making the pie table for the KMP algorithm*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();

        CreatePieTable(pattern);
    }
    public static void CreatePieTable(String pat){
        int array[] = new int[pat.length()];//Declaring array

        for(int i=0 ;i<array.length; i++){
            array[i]=0;
        }


        for(int i=0; i<pat.length(); i++){
            char element = pat.charAt(i);
            for(int j=i+1; j<pat.length(); j++) {
                if (element == pat.charAt(j)) {
                    array[j]=i;
//                    System.out.print(array[j]+" ");
                }
            }
        }

        for(int i=0 ;i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

}
