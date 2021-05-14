package ImplementStackFromScratch;
import java.util.*;

public class Solution{
    public static class Stack{
        private int[] arr;
        private int size;
        private int top;

        Stack(int size){
            this.arr = new int[size];
            this.size = size;
            this.top = -1;
        }

        //Function for adding elements to the stack
        public void push(int ele){
            if(isFull()){
                System.out.println("Stack is already full");
            }
            arr[++top] = ele;
        }
        //Function for removing elements to the stack
        public int pop(){
            if(isEmpty()){
                System.out.println("The stack is already empty");
            }
            return arr[top--];
        }
        //Function for checking if the stack is empty
        public boolean isEmpty(){
            return top == -1;
        }
        //Function for checking if the stack is full
        public boolean isFull(){
            return top == size-1;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Stack s = new Stack(size);

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
