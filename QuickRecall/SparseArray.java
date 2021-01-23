//Sparse Array

package QuickRecall;
import java.util.Scanner;

public class SparseArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int strCount = sc.nextInt();//Size of array
        String str[] = new String[strCount];//Declaring array of strings
        for(int i=0; i<str.length; i++){//Taking input
            str[i] = sc.nextLine();
        }
        int queCount = sc.nextInt();//Size of the query array
        String que[] = new String[queCount];//Declaring array of strings
        for(int i=0; i<que.length; i++){//Taking input
            que[i] = sc.nextLine();
        }



        int result[] = new int[queCount];//Finding result
         for(int i=0; i<result.length; i++){
            result[i] = res(str, que, i);
        }

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
    public static int res(String str[], String que[], int i){
        int count = 0;
        for(int j=0; j<str.length; j++){
            if(que[i].equals(str[j])==true){
                count++;
            }
        }
        return count;
    }
}
