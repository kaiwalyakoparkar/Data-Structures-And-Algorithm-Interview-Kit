package FindMiddleElementOfStack;
import java.util.*;

public class Solution{
	//Stack class
	public static class Stack{
		private int size;
		private int[] arr;
		private int top;

		Stack(int size){
			this.size = size;
			this.arr = new int[size];
			this.top = -1;
		}

		//Checks if the stack is empty
		boolean isEmpty(){
			if(top == -1){
				return true;
			}
			return false;
		}

		//Checks if the stack is full
		boolean isFull(){
			if(top == size){
				return true;
			}
			return false;
		}

		//Pushes the data into the stack
		void push(int data){
			if(isFull()){
				System.out.println("Stack is full");
			}else{
				arr[++top] = data;
			}
		}

		//Pops the element from the stack
		int pop(){
			if(isEmpty()){
				System.out.println("Stack is already empty");
				return -1;
			}
			return arr[top--];
		}

		//Finds out the middle element of the stack
		int findMiddle(){
			if(isEmpty()){
				System.out.println("Stack is already empty");
				return -1;
			}

			if(top == 0){
				return arr[top];
			}

			int currSize = top+1;
			return arr[currSize/2];
		}

		//Display Stack (Debugging purpose only!!!)
		void display(){
			for(int i = top; i >= 0; i--){
				System.out.print(arr[i]+" ");
			}
		}
	}

	//Main method
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Stack st = new Stack(size);

		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);

		// int val = st.pop();
		System.out.println("Stack is: ");
		st.display();

		//Finds the middle element
		System.out.println();
		int mid = st.findMiddle();
		System.out.println("The middle element is: "+mid);
	}	
}