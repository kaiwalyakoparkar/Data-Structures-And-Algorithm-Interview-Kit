package LevelOrderTraversal;
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
        int val = sc.nextInt();

        if(val == -1){
            return null;
        }

        root = new Node(val);

        System.out.println("Enter left for root "+val);
        root.left = createTree(sc);
        System.out.println("Enter the right for root "+val);
        root.right = createTree(sc);

        return root;
    }
    public static void levelOrder(Node root){
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while(q.size() > 0){
            int count = q.size();
            for(int i = 0; i < count; i++){
                root = q.remove();
                System.out.println(root.data+" ");

                if(root.left != null){
                    q.add(root.left);
                }

                if(root.right != null){
                    q.add(root.right);
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node root = createTree(sc);

        System.out.println("Level Order Traversal is : ");
        levelOrder(root);
    }
}
