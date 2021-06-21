package HeapSort;
import java.util.*;

public class Solution{
	//Heap sort
	public static void heapSort(int[] arr){
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		for(int i = 0; i < arr.length; i++){
			minHeap.add(arr[i]);
		}

		for(int i = 0; i < arr.length; i++){
			arr[i] = minHeap.poll();
		}
	}

	//Main method
	public static void main(String args[]){
		//Initializing and taking input in array
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}

		//Sorting the array
		heapSort(arr);

		//Printing the sorted array
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}