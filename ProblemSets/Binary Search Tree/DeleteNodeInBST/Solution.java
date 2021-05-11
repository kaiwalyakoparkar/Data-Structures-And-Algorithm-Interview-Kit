package DeleteNodeInBST;
import java.util.*;

public class Solution{
    //Class for making nodes
    public static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    //Method for creating tree
    public static Node createTree(Scanner sc){
        Node root = null;
        System.out.println("Enter the root data : ");
        int val = sc.nextInt();
        if(val == -1){
            return null;
        }
        root = new Node(val);

        System.out.println("Enter the left for "+val);
        root.left = createTree(sc);

        System.out.println("Enter the right for "+val);
        root.right = createTree(sc);

        return root;
    }

    //Method to find the max in the left sub-tree
    public static int max(Node node){
        if(node.right != null){
            return max(node.right);
        }else{
            return node.data;
        }
    }
    //Method to delete any node from the tree
    public static Node deleteNode(Node node, int key){

        if(node == null){
            return null;
        }

        if(node.data < key){

            node.left = deleteNode(node.left, key);

        }else if(node.data > key){

            node.right = deleteNode(node.right, key);

        }else{

            if(node.left != null && node.right != null){

                int lmax = max(node.left);
                node.data = lmax;
                node.left = deleteNode(node.left, lmax);

            }else if(node.left != null){

                return node.left;

            }else if(node.right != null){

                return node.right;

            }else{

                return null;
            }

        }

        return node;
    }

    //Main method
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node root = createTree(sc);

        System.out.println("Enter the element to be deleted from the node : ");
        int key = sc.nextInt();
        root = deleteNode(root, key);
    }
}
