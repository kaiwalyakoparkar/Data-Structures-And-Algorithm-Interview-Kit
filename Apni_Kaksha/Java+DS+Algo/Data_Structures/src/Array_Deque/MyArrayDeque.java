package Array_Deque;

public class MyArrayDeque<E> {

	Node<E> head, tail;
	int size=0;
	
	/*This function adds the node to the first position also all the corner cases
	 *are handled in this function such as if the deque is empty.*/
	public void addFirst(E data) {
		Node<E> addData = new Node<E>(data);
		if(size==0) {
			head=tail=addData;
		}else {
			addData.next = head;
			head.priv = addData;
			head = addData;
		}
		size++;
	}
	
	/*This function adds the node to the last of the arraydeque also all the corner cases are 
	 *handled like if the deque is empty*/
	public void addLast(E data) {
		Node<E> addData = new Node<E>(data);
		if(size==0) {
			head=tail=addData;
		}else {
			head.next=addData;
			addData.priv=head;
			head=addData;
		}
		size++;
	}
	
	/*This function removes the node from first if has two corner cases like
	 *if the deque is empty or has only 1 element*/
	public void removeFirst(){
		if(size==0) {
			System.out.println("Error: Queue Empty");
		}else if(size==1){
			head=tail=null;
			size--;
		}else {
			head=head.next;
			head.priv=null;
			size--;
		}
	}
	
	/*This function removes the node from last if has two corner cases like
	 *if the deque is empty or has only 1 element*/
	public void removeLast() {
		if(size==0) {
			System.out.println("Error: Queue Empty");
		}else if(size==1){
			head=tail=null;
			size--;
		}else {
			tail=tail.priv;
			tail.next=null;
			size--;
		}
	}
	
	/*This prints the size of the deque*/
	public void getSize() {
		System.out.println();
		System.out.println("Size is "+size);
	}
	
	/*This prints the entire deque with the corner cases*/
	public void print(){
		if(size==0) {
			System.out.println("The Array Deque is empty!");
		}else if(size==1){
			System.out.println(head.data);
		}else {
			
			for(Node<E> temp=head; temp!=null; temp=temp.next) {
				
				System.out.print(temp.data+" ");
				
			}
		}
	}
	
	/*This function creates the node constructor*/
	public static class Node<E>{
		E data;
		Node<E> next;
		Node<E> priv;
		
		public Node(E data) {
			this.data = data;
			this.next = this.priv = null;
		}
		
	}
	
	
}
