package QuickRecall;
import java.util.Scanner;

public class ReviseLL{
    public static class Node{
        int data;
        Node next;
    }
    public static class Linkedlist{
        Node head;
        Node tail;
        int size = 0;

        void add(int val){
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
        void display(){
            for(Node temp = head; temp != null; temp = temp.next){
                System.out.print(temp.data+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Linkedlist li =  new Linkedlist();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list: ");
        int n = sc.nextInt();

        System.out.println("Enter the linked list: ");
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            li.add(val);
        }

        System.out.println("Linked list you enter was: ");
        li.display();
    }
}
