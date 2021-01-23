//This is my personalized linked list

package QuickRecall;
import java.util.Scanner;

public class MyLinkedList{
    public static class Node{//skeleton of nodes
        int data;
        Node next;
    }
    public static class PersonalLinkedList{//Linked List class
        Node head;//creates head node
        Node tail;//creates tail node
        int size = 0;//defines size of the linked list

        public void add(int val){//Add the elements in the linear manner
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

        public void display(){//Displays the entire linked list
            for(Node temp = head; temp !=null; temp = temp.next){
                System.out.print(temp.data+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        PersonalLinkedList li = new PersonalLinkedList();
        System.out.println("Enter the number of Elements: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            li.add(val);
        }

        System.out.println("The Linked List you enter was: ");
        li.display();
    }
}
