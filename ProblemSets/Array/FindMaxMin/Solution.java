//Find Max and Min

package FindMaxMin;
import java.util.*;

public class Solution{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int maxIterative = 0;
        int minIterative = 100000000;

        //This is Iterative method
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxIterative){
                maxIterative = arr[i];
            }
            if(arr[i]<minIterative){
                minIterative = arr[i];
            }
        }

        System.out.println("Max by iterative is: "+maxIterative);
        System.out.println("Min by iterative is: "+minIterative);

        //This is Tournament method
        int maxTour1 = 0;
        int maxTour2 = 0;
        int minTour1 = 100000000;
        int minTour2 = 100000000;

        for(int i=0; i<arr.length/2; i++){
            if(arr[i]>maxTour1){
                maxTour1 = arr[i];
            }
            if(arr[i]<minTour1){
                minTour1 = arr[i];
            }
        }
        for(int i=arr.length/2; i<arr.length; i++){
            if(arr[i]>maxTour2){
                maxTour2 = arr[i];
            }
            if(arr[i]<minTour2){
                minTour2 = arr[i];
            }
        }
        if(maxTour1<maxTour2){
            System.out.println("Max by Tournament method is: "+maxTour2);
        }else{
            System.out.println("Max by Tournament method is: "+maxTour1);
        }
        if(minTour1<minTour2){
            System.out.println("Min by Tournament method is: "+minTour1);
        }else{
            System.out.println("Min by Tournament method is: "+minTour2);
        }

        //This is Sorting method
        Arrays.sort(arr);
        System.out.println("Max by sorting method is: "+arr[arr.length-1]);
        System.out.println("Min by sorting method is: "+arr[0]);

    }
}
