package FindAValueInBST;
import java.util.*;

public class Solution{
    //This is the class for creting a node for tree
    public static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
        }
    }

    //This module helps creating a tree
    public static Node createTree(Scanner sc){
        Node root = null;
        System.out.println("Enter the root data : ");
        int val = sc.nextInt();
        if(val == -1){
            return null;
        }
        root = new Node(val);

        //Creating left subtree
        System.out.println("Enter the left for "+val);
        root.left = createTree(sc);
        //Creating right subtree
        System.out.println("Enter the right for "+val);
        root.right = createTree(sc);
        //Returning the root
        return root;
    }

    //Method for searching the key in the BST
    public static void searchTheKey(Node root, int key){
        if(root.data == key){

            System.out.println("Element found!");

        }else if(root.data > key){

            searchTheKey(root.left, key);

        }else if(root.data < key){

            searchTheKey(root.right, key);
        }
    }

    //Main function / Method
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node root = createTree(sc);

        //Taking the input for the element to be searched
        System.out.println("Enter the element to be searched : ");
        int key = sc.nextInt();

        //Finding the element
        searchTheKey(root, key);
    }
}
