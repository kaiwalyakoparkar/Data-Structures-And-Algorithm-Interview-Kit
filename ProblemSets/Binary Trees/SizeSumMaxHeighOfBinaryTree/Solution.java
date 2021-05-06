package SizeSumMaxHeightOfBinaryTree;
import java.util.*;

public class Solution{

    //Class for defining node
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    //Creating Tree structure
    public static Node createTree(Scanner sc){
        Node root = null;

        System.out.println("Enter the data : ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);

        System.out.println("Enter the left for "+data);
        root.left = createTree(sc);

        System.out.println("Enter the right for "+data);
        root.right = createTree(sc);

        return root;
    }

    //Finding the size of the tree
    public static int size(Node node){
        if(node == null){
            return 0;
        }
        int ls = size(node.left);
        int rs = size(node.right);
        int ts = ls + rs + 1;
        return ts;
    }

    //Finding the sum of the tree
    public static int sum(Node node){
        if(node == null){
            return 0;
        }
        int lsm = sum(node.left);
        int rsm = sum(node.right);
        int tsm = lsm + rsm + node.data;
        return tsm;
    }

    //Finding the max of the tree
    public static int max(Node node){
        if(node == null){
            return -1000000000;
        }

        int lmx = max(node.left);
        int rmx = max(node.right);
        int tmx = Math.max(node.data, Math.max(lmx, rmx));
        return tmx;
    }

    //Finding the heigh of the tree
    public static int height(Node node){
        if(node == null){
            return -1;
        }
        int lh = height(node.left);
        int rh = height(node.right);
        int th = Math.max(lh, rh) + 1;
        return th;
    }

    //Main class
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node root = createTree(sc);

        int sz = size(root); // No of nodes in the tree
        System.out.println("Size of the tree is : "+sz);

        int sm = sum(root); // Sum of all the node data's
        System.out.println("Sum of the tree is : "+sm);

        int mx = max(root); // Maximum node data of all nodes
        System.out.println("Maximum in the tree is : "+mx);

        int ht = height(root); // Deepest child of the tree (edge wise)
        System.out.println("Height in the tree is : "+ht);
    }
}
