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


        //Reversing the linked list Iteratively
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

        //Reversing the liked list recursively
        //Helper function for recursion
        void reverseHelper(Node node){
            if(node == null){
                return;
            }
            reverseHelper(node.next);
            if(node == tail){
                //lol do nothing
            }else{
                node.next.next = node;
            }
        }
        //Main code for recursion
        void reverseRecursive(){
            reverseHelper(head);
            Node newNode = head;
            head = tail;
            tail = newNode;
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

        System.out.println("Linked List initially");
        li.display(); // Displaying initial list

        //li.reverseIterative();

        //System.out.println();
       // System.out.println("Linked List After reversing iteratively");
        //System.out.println();

        //li.display();//Displaying the iterative answer

        li.reverseRecursive();

        System.out.println();
        System.out.println("Linked List After reversing recursively");
        System.out.println();

        li.display();//Displaying the recursive answer
    }
}
