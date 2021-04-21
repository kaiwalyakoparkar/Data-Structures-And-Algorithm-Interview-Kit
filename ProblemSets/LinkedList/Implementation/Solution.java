package Implementation;
import java.util.Scanner;

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
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList li = new LinkedList();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int value = sc.nextInt();
            li.add(value);
        }
        li.display();
    }
}
