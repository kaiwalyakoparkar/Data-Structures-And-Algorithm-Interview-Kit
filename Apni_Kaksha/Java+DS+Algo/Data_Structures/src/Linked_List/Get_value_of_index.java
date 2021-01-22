package Linked_List;
import java.util.*;

public class Get_value_of_index {

	public static class Node{
		int data;
		Node next;
	}

	public static class LinkedList{

		Node head;
		Node tail;
		int size;

		public void add(int val) {
			Node n = new Node();
			n.data = val;
			n.next=null;
			if(size==0) {
				head=tail=n;
			}else {
				tail.next=n;
				tail=n;
			}
		}

		public void getInd(int index) {
			int length=1;
			if(size+1>=index) {
				System.out.println("Index out of bound!");
			}else {
				for(Node temp=head; temp!=null; temp=temp.next) {
					if(length==index) {
						System.out.println(temp.data);
						break;
					}else {
						length++;
					}
				}
			}


		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements are there in node:");
		int times = sc.nextInt();

		System.out.println("Enter "+times+" element in LinkedList");
		for(int i=0; i<times; i++) {
			int data = sc.nextInt();
			list.add(data);
		}

		System.out.println("Enter the index of the node:");
		int index = sc.nextInt();
		list.getInd(index);
		sc.close();
	}
}
