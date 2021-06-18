package InvertBinaryTree;
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

	//Method to create the tree
	public static Node createTree(Scanner sc){
		Node root = null;

		System.out.println("Enter the data for the node: ");
		int data = sc.nextInt();

		if(data == -1){
			return null;
		}

		root = new Node(data);

		//Taking the input for left side of the node
		System.out.println("Enter left for "+data);
		root.left = createTree(sc);

		//Taking the input for right side of the node
		System.out.println("Enter right for "+data);
		root.right = createTree(sc);

		return root;
	}

	//-----------Inverting/Mirroring the tree problem -------------

	public static Node invertTree(Node node){
		if(node == null){
			return node;
		}

		Node tempLeft = invertTree(node.left);//Take the leftmost unswapped node
		Node tempRight = invertTree(node.right);//Take the rightmost unswapped node

		//Swap the node's right with the leftmost unswapped.
		node.right = tempLeft;
		//Swap the node's left with the rightmost unswapped.
		node.left = tempRight;

		return node;
	}

	//----------------------- Solution ends -----------------------

	//For debugging purpose/ Print the tree in preorder traversal
	public static void display(Node node){
		if(node == null){
			return;
		}

		System.out.print(node.data+" ");
		display(node.left);
		display(node.right);
	}

	//This is the main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//Create a tree
		Node root = createTree(sc);
		System.out.println();

		//Display the tree before inverting
		System.out.println("Tree before inverting: ");
		display(root);
		System.out.println();

		//Invert the tree
		Node invert = invertTree(root);
		System.out.println();

		//Display the tree after inverting
		System.out.println("Tree after inverting: ");
		display(invert);
	}
}