package QuickRecall;
import java.util.Scanner;

public class ReviseLL{
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size = 0;

        void add(int data){
            Node n = new Node();
            n.data = data;
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
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList li = new LinkedList();

        System.out.println("Enter the number of elements in the linked list: ");
        int n = sc.nextInt();

        for(int i = 0; i < n ; i++){
            int data = sc.nextInt();
            li.add(data);
        }

        System.out.println("The linked list you enter is: ");
        li.display();
    }
}
