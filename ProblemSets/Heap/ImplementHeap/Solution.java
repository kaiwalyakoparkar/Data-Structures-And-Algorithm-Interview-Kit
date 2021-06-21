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
	// public static Node createTree(int ele, int arr[]){
	public static Node createTree(Scanner sc){
		Node root = null;
		System.out.println("Enter Data: ");
		int data = sc.nextInt();

		if(data == -1){
			return null;
		}

		root = new Node(data);
		// root.left = createTree(ele, arr);
		// root.right = createTree(ele, arr);
		System.out.println("Enter left for : "+data);
		root.left = createTree(sc);
		System.out.println("Enter right for : "+data);
		root.right = createTree(sc);

		return root;
	}

	public static void heapify(Node node){

	}

	public static int height(Node node){
		if(node == null){
			return -1;
		}
		int lh = height(node.left);
		int rh = height(node.right);
		int fh = Math.max(lh, rh)+1;
		
		if(lh > rh){
			System.out.println("lh is largest");
		}else{
			System.out.println("rh is largest");
		}
		return fh;
	}

	//Debugging purpose only
	public static void levelOrder(Node root){
        Queue<Node> q = new ArrayDeque<>();
        //add the first root to the queue
        q.add(root);

        while(q.size() > 0){
            int count = q.size();
            for(int i = 0; i < count; i++){
                //take the trace of the root and remove it
                root = q.remove();
                //Print the trace of the root
                System.out.print(root.data+" ");

                //If left child exists then add it to the queue
                if(root.left != null){
                    q.add(root.left);
                }

                //If right child exists then add it to the queue
                if(root.right != null){
                    q.add(root.right);
                }
            }
        }
    }

	public static void main(String args[]){
		//Initialization
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Node root = createTree(sc);
        System.out.println("Level Order Traversal is : ");
        levelOrder(root);

        System.out.println("Height of the tree is: "+height(root));

	}
}