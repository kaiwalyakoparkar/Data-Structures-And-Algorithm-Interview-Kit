package ImplementHeap;
import java.util.*;

public class Solution{

	//Node class
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}

	//Class to create a tree
	public static class creatTree(int ele, int[] arr){
		Node root = null;
		System.out.println("Enter the root data : ");
		int data = arr[ele++];

		if(data == -1){
			return null;
		}

		root = new Node(data);

		System.out.println("Enter left for "+data);
		root.left = creatTree(ele, arr);

		System.out.println("Enter right for "+data);
		root.right = creatTree(ele, arr);

		return root;
	}

	public static void main(String args[]){
		//Initialization
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		//Adding elements to array
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}

	}
}