package QuickRecall;
import java.util.Scanner;

public class ReviseTree{
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
    public static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    public static void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }
    public static void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node root = createTree(sc);
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Inorder Traversal is: ");
        inOrder(root);
        System.out.println();
        System.out.println("Preorder Traversal is: ");
        preOrder(root);
        System.out.println();
        System.out.println("Postorder Traversal is: ");
        postOrder(root);
        System.out.println();

    }
}
