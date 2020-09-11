package Tree;
import java.util.*;

public class Binary_Search_Tree {
	
	static Scanner sc = null;
	/*Node class same as Linked List*/
	public class Node{
		int data;
		Node right;
		Node left;
		
		Node(int data){
			this.data=data;
		}
	}
	/*Node class finishes here*/
	static Node createTree(){
		
		Node root = null;//keep root node null initially
		System.out.println("Enter the data: ");
		
		//receive the data
		int data = sc.nextInt();
		
		//check if the data is null;
		if(data == -1) {
			return null;
		}
		
		//Add the data to root node
		root = new Node(data);
		
		//take value of left node
		System.out.println("Enter left for "+data);
		
		/*Recursion for left node starts here
		 *when it will receive the -1 means the null
		 *value that time it will come back and
		 *take the value of right*/
		root.left = createTree();
		
		System.out.println("Enter right for "+data);
		/*Recursion for right node starts here
		 *when it will receive the -1 means the null
		 *value that time it will come back to
		 *root node*/
		root.right = createTree();
		return root;
	}
	
	/*This is for InOrder Traversal*/
	static void inOrder(Node root) {
		if(root == null) return;
		
		/*This too uses recursion to show
		 *the tree*/
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	
	/*This is for PreOrder Traversal*/
	static void preOrder(Node root) {
		if(root == null) return;
		
		/*This too uses recursion to show
		 *the tree*/
		System.out.println(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	
	/*This is for PostOrder Traversal*/
	static void postOrder(Node root) {
		if(root == null) return;
		
		/*This too uses recursion to show 
		 *the tree*/
		postOrder(root.left);
		postOrder(root.right);
		System.out.println(root.data+" ");
	}
	
	
	/*This is the main function*/
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		Node root = createTree();
	}
	
	
	
}
