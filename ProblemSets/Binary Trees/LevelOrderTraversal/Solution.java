package LevelOrderTraversal;
import java.util.*;

public class Solution{
    //Node class (For Tree)
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    //Funtion for creating trees
    /*
     *Func : Creating a tree for specified root/node
     *@param 1 : sc : Passed on scanner so that we can take input in the method as well
     *@ret: Node root: This returns the root node so that further operations can be performed on it
     */
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

    /*
     *Func : Traversing the tree level wise
     *DS: Dequeue
     *@param1 : root: Passes on root as the starting point for traversal
     *@ret : void : noting shall be returned
     */
    public static void levelOrder(Node root){
        Queue<Node> q = new ArrayDeque<>();
        //add the first root to the queue
        q.add(root);

        while(q.size() > 0){
            int count = q.size();
            for(int i = 0; i < count; i++){
                //take the trace of the root and remove it
                root = q.remove();
                //Print the trace of the root
                System.out.print(root.data+" ");

                //If left child exists then add it to the queue
                if(root.left != null){
                    q.add(root.left);
                }

                //If right child exists then add it to the queue
                if(root.right != null){
                    q.add(root.right);
                }
            }
        }
    }

    //Main method
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node root = createTree(sc);

        System.out.println("Level Order Traversal is : ");
        levelOrder(root);
    }
}
