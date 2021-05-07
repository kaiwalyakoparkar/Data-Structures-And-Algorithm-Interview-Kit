package DiameterOfBinaryTree;
import java.util.*;

public class Solution{
    //This is the class for creating nodes
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    //This is for creating a tree structure
    public static Node createTree(Scanner sc){
        Node root = null;//Declaring the node to be null initially

        System.out.println("Enter the data : ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        root = new Node(data);//Adding the data to the nod

        //This will go on creating left nodes.
        System.out.println("Enter the left for "+data);
        root.left = createTree(sc);

        //This will go on creating right nodes
        System.out.println("Enter the right for "+data);
        root.right = createTree(sc);

        //Return root node
        return root;
    }

    //This function finds the height of the tree
    public static int height(Node node){
        if(node == null){
            return 0;
        }
        int lh = height(node.left);
        int rh = height(node.right);
        int th = Math.max(lh, rh)+1;
        return th;
    }


    //This function finds the diameter of the tree
    public static int diameter(Node node){
        if(node == null){
            return 0;
        }
        int ld = diameter(node.left);
        int rd = diameter(node.left);
        int td = height(node.left) + height(node.right) + 2;
        return td;
    }

    //This is main function
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node root = createTree(sc);

        //Checking the height of the tree
        System.out.println("Height of the tree is : "+height(root));
    }
}
