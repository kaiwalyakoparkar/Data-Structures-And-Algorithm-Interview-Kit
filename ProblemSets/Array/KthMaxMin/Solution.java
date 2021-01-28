package KthMaxMin;
import java.util.*;

public class Solution{
    public static int minHeap(int[] arr, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int min = 0;
        for(int i = 0; i < arr.length; i++){
            heap.add(arr[i]);
        }
        for(int i = 1; i < k; i++){
            heap.poll();
        }
        min = heap.peek();
        return min;
    }
    public static int maxHeap(int[] arr, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            heap.add(arr[i]);
        }
        for(int i = 1; i < k; i++){
            heap.poll();
        }
        max = heap.peek();
        return max;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sortingArr[] = new int[n];
        int heapArr[] = new int[n];
        for(int i = 0 ; i < sortingArr.length; i++){
            sortingArr[i] = sc.nextInt();
            heapArr[i] = sortingArr[i];
        }
        int k = sc.nextInt();

        //This is solution using sorting technique
        Arrays.sort(sortingArr);
        System.out.println("The kth smallest element through sorting is: "+sortingArr[k - 1]);
        System.out.println("The kth largest element throught sorting  is: "+sortingArr[sortingArr.length - k]);

        //This is solution using Max heap and Min heap
        System.out.println("The kth smallest element through heaps is: "+minHeap(heapArr,k));
        System.out.println("The kth largest element through heaps is: "+maxHeap(heapArr,k));
    }
}
