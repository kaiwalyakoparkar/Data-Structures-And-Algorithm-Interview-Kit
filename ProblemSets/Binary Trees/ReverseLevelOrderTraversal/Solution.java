package ReverseLevelOrderTraversal;
import java.util.*;

public class Solution{

    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node createTree(Scanner sc){
        Node root = null;

        System.out.println("Enter the root data : ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);

        System.out.println("Enter the left of "+data);
        root.left = createTree(sc);

        System.out.println("Enter the right of "+data);
        root.right = createTree(sc);

        return root;
    }

    public static void reverseLevelOrder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        Stack<Node> s = new Stack<>();

        q.offer(root);
        while(!q.isEmpty()){
            root = q.poll();
            if(root.right != null){
                q.offer(root.right);
            }
            if(root.left != null){
                q.offer(root.left);
            }
            s.push(root);
        }

        while(!s.isEmpty()){
            Node temp = s.pop();
            System.out.print(temp.data+" ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node root = createTree(sc);

        System.out.println("Reverse level order traversal is : ");
        reverseLevelOrder(root);
    }
}
