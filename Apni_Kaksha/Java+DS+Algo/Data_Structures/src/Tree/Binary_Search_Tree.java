package Tree;
import java.util.*;

public class Binary_Search_Tree {
	
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
	
	
	/**/
	
	public static void main(String[] args) {
		
	}
	
	
	
}
