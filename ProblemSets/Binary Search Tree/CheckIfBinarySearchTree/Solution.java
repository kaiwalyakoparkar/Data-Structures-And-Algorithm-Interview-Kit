package CheckIfBinarySearchTree;
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

	//Method to create a tree
	public static Node createTree(Scanner sc){
		Node root = null;
		int data = sc.nextInt();

		if(data == -1){
			return null;
		}

		root = new Node(data);

		//Creates the left tree.
		System.out.println("Enter left for: "+data);
		root.left = createTree(sc);

		//Creates the right tree.
		System.out.println("Enter the right for: "+data);
		root.right = createTree(sc);

		return root;
	}

	public static class BSTPair{
		boolean isBST;
		int min;
		int max;
	}

	//Method to check if the tree is binary search tree
	public static BSTPair isBST(Node node){
		if(node == null){
			BSTPair bp = new BSTPair();
			bp.min = Integer.MAX_VALUE;
			bp.max = Integer.MAX_VALUE;
			bp.isBST = true;

			return bp;
		}

		BSTPair lp = isBST(node.left);
		BSTPair rp = isBST(node.right);

		BSTPair mp = new BSTPair();
		mp.isBST = lp.isBST && rp.isBST && 
				   (node.data >= lp.max && node.data <= rp.min);

		mp.min = Math.min(node.data, Math.min(lp.min, rp.min));
		mp.max = Math.max(node.data, Math.max(lp.max, rp.max));

		return mp;
	}


	//Main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		//Creating a tree (Not necessary BST)
		System.out.println("Enter root data: ");
		Node root = createTree(sc);

		//Checks if the tree is BST
		BSTPair bp = isBST(root);
		System.out.println(bp.isBST);
	}
}