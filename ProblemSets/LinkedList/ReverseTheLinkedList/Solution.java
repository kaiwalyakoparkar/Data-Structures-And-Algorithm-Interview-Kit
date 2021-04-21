package ReverseTheLinkedList;
import java.util.*;

public class Solution{
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size = 0;

        void add(int value){
            Node n = new Node();
            n.data = value;
            n.next = null;
            if(size == 0){
                head = tail = n;
            }else{
                tail.next = n;
                tail = n;
            }
            size++;
        }

        void display(){
            for(Node temp = head; temp != null; temp = temp.next){
                System.out.print(temp.data+" ");
            }
        }

        void reverseIterative(){
            Node newHead = null;
            while(head != null){
                Node newNext = head.next;
                head.next = newHead;
                newHead = head;
                head = newNext;
            }
            head = newHead;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList li  = new LinkedList();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int value = sc.nextInt();
            li.add(value);
        }

        System.out.println("Linked List initiallyl");
        li.display();

        li.reverseIterative();

        System.out.println();
        System.out.println("Linked List After reversing");
        System.out.println();

        li.display();
    }
}
