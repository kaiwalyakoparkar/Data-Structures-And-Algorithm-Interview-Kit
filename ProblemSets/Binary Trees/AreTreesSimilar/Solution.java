package AreTreesSimilar;
import java.util.*;

public class Solution{

    //Constructing node class
    public static class Node{
        int data;
        Node left; 
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    //Constructing tree method
    public static Node createTree(Scanner sc){
        Node root = null;
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }

        root = new Node(data);

        System.out.println("Enter the left of the "+data);
        root.left = createTree(sc);

        System.out.println("Enter the right of the "+data);
        root.right = createTree(sc);

        return root;
    }

    public static boolean isSame = true;

    //Method to check if the two trees are similar
    public static void isSameTree(Node root1, Node root2){
        if(root1 == null || root2 == null){
            return;
        }

        isSameTree(root1.left, root2.left);
        if(root1.data != root2.data){
            isSame = false;
        }
        isSameTree(root1.right, root2.right);
    }

    //This is the main method
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter root data of first tree");
        Node root1 = createTree(sc);

        System.out.println("Enter root data of second tree");
        Node root2 = createTree(sc);

        isSameTree(root1, root2);
        
        if(isSame == true){
            System.out.println("Both the trees are same");
        } else {
            System.out.println("Both the trees are different");
        }
    }
}