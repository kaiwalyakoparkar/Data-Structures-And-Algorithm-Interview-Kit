package MinimumJumpsToReachEnd;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //This is a Dynamic Programming solution
        int jump[] = new int[n];
        for(int i = 1; i < jump.length; i++){
            jump[i] = 1000000;
        }
        int path[] = new int[n];
        jump[0] = 0;

        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] >= j - i){
                    if(jump[i]+1 <= jump[j]){
                        jump[j] = jump[i]+1;
                        path[j] = i;
                    }
                }else{
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("The jump array is: ");
        for(int i = 0; i < jump.length; i++){
            System.out.print(jump[i]+" ");
        }

        System.out.println();
        System.out.println("The path array is: ");

        for(int i = 0; i < path.length; i++){
            System.out.print(path[i]+" ");
        }

        boolean unreached = false;
        for(int i = 0; i < jump.length; i++){
            if(jump[i] == 1000000){
                unreached = true;
            }
        }

        if(unreached == false){
            System.out.println();
            System.out.println("The jump route is: ");
            int jumpCount = 0;
            int k = path.length-1;
            while(k != 0){
                System.out.print(k+" ");
                k = path[k];
                jumpCount++;
            }
            System.out.println();
            System.out.println("Minimum Jumps made are: "+jumpCount);
        }else{
            System.out.println("Minimum Jumps made are: -1");
        }


    }
}
