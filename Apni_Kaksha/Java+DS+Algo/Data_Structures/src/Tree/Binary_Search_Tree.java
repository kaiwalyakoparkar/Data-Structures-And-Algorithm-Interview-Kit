package Tree;
import java.util.*;

public class Binary_Search_Tree {
	
	public class Tree{
		
		public class Node{
			Node left;
			Node right;
			int data;
			
			public Node(int data) {
				this.data = data;
			}
			
			void addNode(int data) {
				int size=0;
				if(size==0) {
					Node root = new Node(data);
					root.left = root.right = null;
				}else{
					Node a = new Node(data);
					if(a.data < data) {
						left = a;
						a.left=a.right=null;
						root=a;
					}
				}
				size++;
			}
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		sc.close();
		
		
	}
}
