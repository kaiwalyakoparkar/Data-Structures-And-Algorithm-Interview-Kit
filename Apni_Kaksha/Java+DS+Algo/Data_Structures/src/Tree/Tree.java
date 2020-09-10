package Tree;


public class Tree {

	public class Node{
		Node left, right;
		int data;
		
		public Node(int data) {
			this.data=data;
		}
		

		public int insert(int value){
			
			if(value <= data) {
				if(left==null) {
					left = new Node(value);
				}else {
					left.data = left.insert(value);
				}
			}else {
				if(right==null) {
					right = new Node(value);
				}else {
					right.data = right.insert(value);
				}
			}
			return data;
			
		}
		
		public boolean contains(int value) {
//			boolean result=false;
			if(value==data) {
				return true;
			}else if(value<data){
				if(left==null) {
					return false;
				}else {
					return left.contains(value);
				}
			}else {
				if(right==null) {
					return false;
				}else {
					return right.contains(value);
				}
			}
//			return result;
		}
		
		public void printInOrder() {
			if(left!=null) {
				left.printInOrder();
			}
			System.out.println(data);
			if(right!=null) {
				right.printInOrder();
			}
		}
	}

	

	
}
