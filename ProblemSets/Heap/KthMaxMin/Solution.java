package KthMaxMin;
import java.util.*;

public class Solution{

	//This is for Kth Min
	public static int minHeap(int arr[], int find){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for(int i = 0;i < arr.length; i++){
			pq.add(arr[i]);
		}

		for(int i = 0; i < arr.length; i++){
			int curr = pq.poll();
			arr[i] = curr;
		}

		return arr[find - 1];
	}

	//This is for Kth Max
	public static int maxHeap(int arr[], int find){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

		for(int i = 0; i < arr.length; i++){
			pq.add(arr[i]);
		}

		for(int i = 0; i < arr.length; i++){
			int curr = pq.poll();
			arr[i] = curr;
		}
		return arr[find - 1];
	}

	//This is the Main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();	

		int minAns = minHeap(arr, k);
		System.out.println("Kth min element is: "+minAns);

		int maxAns = maxHeap(arr, k);
		System.out.println("Kth max element is: "+maxAns);
	}
}