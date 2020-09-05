package Linked_List;
import java.util.*;

public class My_Linked_List {

		public static class Node {
		    int data;
		    Node next;
		  }

		  public static class LinkedList {
		    Node head;
		    Node tail;
		    int size;

		    void add(int val) {
		      Node n = new Node();
		      n.data = val;
		      n.next = null;

		      if (size == 0) {
		        head = tail = n;
		      } else {
		        tail.next = n;
		        tail = n;
		      }

		      size++; 
		    }
		  
		    public void display(){
		        for(Node temp = head; temp != null; temp = temp.next){
		           System.out.print(temp.data + " ");
		        }
		          System.out.println();
		    }
	}
	
	public static void main(String[] args) {
		
		LinkedList p = new LinkedList();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the data in the linked list:");
		
		
		for(int i=0; i<10;i++) {
			int data=sc.nextInt();
			p.add(data);	
		}
		
		p.display();
		sc.close();
		
	}
	
	
	
}
