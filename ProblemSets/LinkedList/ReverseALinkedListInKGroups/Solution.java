package ReverseALinkedListInKGroups;
import java.util.*;

public class Solution{
    public static class Node{
        int data;
        Node next;
        void Node(int data){
            this.data = data;
        }
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
        void display(Node head){
            for(Node temp = head; temp != null; temp = temp.next){
                System.out.print(temp.data+" ");
            }
        }
        Node getHead(){
            return head;
        }
    }
    public static Node reverseKGroup(Node head, int k){
        if(head == null || k == 1){
            return head;
        }

        Node dummy = new Node();
        dummy.data = 0;
        dummy.next = head;

        Node curr = dummy, nex = dummy, pre = dummy;

        int count = 0;
        while(curr.next != null){
            curr = curr.next;
            count++;
        }

        while(count >= k){
            curr = pre.next;
            nex = curr.next;
            for(int i = 1; i < k; i++){
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
            pre = curr;
            count -= k;
        }

        return dummy.next;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList li = new LinkedList();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i = 0; i < n; i++){
            int curr = sc.nextInt();
            li.add(curr);
        }
        Node head = li.getHead();
        Node ans = reverseKGroup(head,k);
        System.out.println(ans.data+" ");
        li.display(ans);
    }
}
