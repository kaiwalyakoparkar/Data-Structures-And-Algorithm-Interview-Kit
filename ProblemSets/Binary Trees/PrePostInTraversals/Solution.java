package PrePostInTraversal;
import java.util.*;

public class Solution{
	//This is the Node class
	public static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}

	//This method creates tree and returns the root
	public static Node createTree(Scanner sc){
		Node root = null;
		int data = sc.nextInt();

		if(data == -1){
			return null;
		}

		root = new Node(data);

		System.out.println("Enter the left for "+data);
		root.left = createTree(sc);

		System.out.println("Enter the right for "+data);
		root.right = createTree(sc);

		return root;
	}

	//Inorder Traversal (Recursive)
	public static void inOrder(Node node){
		if(node == null){
			return;
		}

		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}

	//PreOrder Traversal (Recursive)
	public static void preOrder(Node node){
		if(node == null){
			return;
		}

		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}

	//PostOrder Traversal (Recursive)
	public static void postOrder(Node node){
		if(node == null){
			return;
		}

		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+" ");
	}

	//This is the main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the root data: ");
		Node root = createTree(sc);

		//Traversals
		System.out.println("In-order Traversal is: ");
		inOrder(root);
		System.out.println();


		System.out.println("Pre-order Traversal is: ");
		preOrder(root);
		System.out.println();


		System.out.println("Post-order Traversal is: ");
		postOrder(root);
		System.out.println();
		
	}
}