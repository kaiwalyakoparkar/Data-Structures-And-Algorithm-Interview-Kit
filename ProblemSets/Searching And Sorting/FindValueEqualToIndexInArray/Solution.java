package FindValueEqualToIndexInArray;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        //Taking the input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //Passing the arr & n to function to find the index
        ArrayList<Integer> fin = findTheIndex(arr,n);

        //Printing the final answer
        for(int i = 0; i < fin.size(); i++){
            System.out.print(fin.get(i)+" ");
        }
    }
    public static ArrayList<Integer> findTheIndex(int[] arr, int n){
        //Declaring the arraylist to be returned
        ArrayList<Integer> li = new ArrayList<>();

        //Finding the index
        for(int i = 0; i < arr.length; i++){
            if(i+1 == arr[i]){
                li.add(arr[i]);
            }
        }

        //returning the list
        return li;
    }
}
