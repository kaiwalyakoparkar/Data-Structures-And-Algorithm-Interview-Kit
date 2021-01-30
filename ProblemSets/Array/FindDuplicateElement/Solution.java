package FindDuplicateElement;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //This is Naive approach with Complexity O(N^2)
        int repeat = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    repeat = arr[i];
                    break;
                }
            }
        }
        System.out.println("Repeated element through naive approach is: "+repeat);

        //This is Sort and Two pointer approach with complexity  (O(N*logN)+ O(N))
        int repeat2 = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                repeat2 = arr[i];
                break;
            }
        }
        System.out.println("Repeated element through sort + two pointer approach is: "+repeat2);

        //This is Sort and extra space approach
        int repeat3 = 0;
        int extra[] = new int[n];
        for(int i = 0; i < extra.length; i++){
            extra[i] = 0;
        }
        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length; i++ ){
            if(extra[arr[i]] != 0){
                repeat3 = arr[i];
                break;
            }else{
                extra[arr[i]] = 1;
            }
        }
        System.out.println("Repeated element through sort + extra space is: "+repeat3);


        //This is Linked list with tortoise and rabbit method
        int repeat4 = 0;
        LinkedList<Integer> li = new LinkedList<>();
        for(int i = 0; i < arr.length; i++){
            i = arr[i];
            li.add(arr[i]);
        }
        Integer nums[] = li.toArray(new Integer[li.size()]);
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);

        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        repeat4 = slow;
        System.out.println("Repeated elements through linked list approach is: "+repeat4);
     }
}
