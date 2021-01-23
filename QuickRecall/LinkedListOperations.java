//All the operations will be performed here

package QuickRecall;
import java.util.Scanner;

public class LinkedListOperations{
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        public Node head;
        public Node tail;
        public int size = 0;

        public void addLast(int val){//Initial creation of the linked list operation
            Node n = new Node();
            n.data = val;
            n.next = null;
            if(size==0){
                head = tail = n;
            }else{
                tail.next = n;
                tail = n;
            }
            size++;
        }
        public void removeFirst(){
            Node n1 = new Node();
            if(size==0){
                System.out.println("List Null");
            }else if(size==1){
                head = tail = null;
                size=0;
            }else{
                head = n1.next;
                size--;
            }
        }
        public void traverse(){//Traverse operation on the linked list
            for(Node temp = head; temp !=null ; temp = temp.next){
                System.out.print(temp.data+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList li = new LinkedList();
        int n = sc.nextInt();
        for(int i=0; i<n ;i++){
            int val = sc.nextInt();
            li.addLast(val);
        }

        li.traverse();
        li.removeFirst();
        li.traverse();
    }
}
