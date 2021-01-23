package QuickRecall;
import java.util.Scanner;

public class Tree{
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
        System.out.println("Enter the data: ");
        int data = sc.nextInt();

        if(data==-1){
            return null;
        }

        root = new Node(data);

        System.out.println("Enter the left of "+data);
        root.left = createTree(sc);

        System.out.println("Enter the right of "+data);
        root.right = createTree(sc);

        return root;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node root = createTree(sc);
    }
}
