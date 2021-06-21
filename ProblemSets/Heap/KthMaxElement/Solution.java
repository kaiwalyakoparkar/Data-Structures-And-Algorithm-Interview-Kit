package KthMaxElement;
import java.util.*;

public class Solution{
	//This is heapsort
	public static void heapSort(int[] arr){
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for(int i = 0; i < arr.length; i++){
			minHeap.add(arr[i]);
		}

		for(int i = 0; i < arr.length; i++){
			arr[i] = minHeap.poll();
		}
	}

	//This is main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}

		heapSort(arr);

		System.out.println("The kth largest element is: "+arr[arr.length-k]);
	}
}