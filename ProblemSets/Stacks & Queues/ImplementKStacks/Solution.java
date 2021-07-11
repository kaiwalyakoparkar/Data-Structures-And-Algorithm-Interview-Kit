package ImplementKStacks;
import java.util.*;

public class Solution{

    //This is a stack class
    public static class Stack{
        private int data[];
        private int top[];
        private int curr[];
        private int maxSize;

        //Constructor method to initialize the class
        Stack(int maxSize, int k){
            this.data = new int[maxSize];
            this.maxSize = maxSize;
            this.top = new int[k];
            top[0] = curr[0] = -1;
            for(int i = 1; i < k; i++){
                top[i] = top[i-1]+k;
                curr[i] = top[i];
            }
        }

        //This check if stack is overflowing
        boolean stackOverflow(int whichStack){
            if(top == maxSize){
                return true;
            }
            return false;
        }

        //This check if stack is underflowing
        boolean stackUnderflow(int whichStack){
            if(curr[whichStack] == top){
                return true;
            }
            return false;
        }

        //This method pushes the element in the stack
        void push(int ele, int whichStack){
            if(stackOverflow(whichStack-1)){
                System.out.println("Stack Overflow");
            } else {
                data[++top] = ele;
            }
        }

        //This method pops the element from the stack
        int pop(int whichStack){
            if(stackUnderflow(whichStack)){
                System.out.println("Stack Underflow");
            }
            return data[top--];
            
        }

        //This method returs the peek element of the stack
        int peek(int whichStack){
            return data[top];
        }

        //This method pops the element 1-by-1 from the stack and prints it
        void display(int whichStack){
            for(int i = top; i >= -1; i--){
                int curr = pop();
                System.out.print(curr+" ");
            }
            this.top = -1;
        }
    }

    //This is the main method
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();//Max size of the stack
        int k = sc.nextInt();

        Stack s = new Stack(size, k);

        System.out.println("Enter the elements you want to put is stack : ");
        for(int i = 0; i < size; i++){
            int temp = sc.nextInt();
            s.push(temp);
        }

        System.out.println("The elements in the stack (In reverse order) are :");
        for(int i = 0; i < size; i++){
            int temp = s.pop();
            System.out.print(temp+" ");
        }
    }
}