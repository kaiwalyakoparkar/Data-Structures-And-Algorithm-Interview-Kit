package ImplementTwoStackInAnArray;
import java.util.*;

public class Solution{
	//Implementing Stack
	public static class Stack{
		// private int top; //Ideal top pointer
		private int top1;
		private int top2;
		private int size;
		private int arr[];

		//Constructor
		Stack(int size){
			this.size =  size;
			this.arr = new int[size];
			// this.top = -1; Ideal top pointer initialization
			this.top1 = -1;
			this.top2 = size; 
		}

		//Ideal Push Function
		// public void push(int val){
		// 	if(isFull()){
		// 		System.out.println("Stack is Full");
		// 	}else{
		// 		arr[++top] = val;
		// 	}
		// }

		//Ideal Pop Function
		// public int pop(){
		// 	if(isEmpty()){
		// 		System.out.println("Stack is Empty");

		// 	}
		// 	return arr[top--];
		// }

		//Ideal Is Empty Function

		// public boolean isEmpty(){
		// 	if(top == -1){
		// 		return true;
		// 	}

		// 	return false;
		// }

		//Ideal Is Full Function
		// public boolean isFull(){
		// 	if(top == size-1){
		// 		return true;
		// 	}

		// 	return false;
		// }

		//Ideal Print the stack
		// public void printStack(){
		// 	for(int i = top; i >= 0; i--){
		// 		System.out.print(arr[i]+" ");
		// 	}
		// }

		/*Specfic to this problem*/

		//Checks if the location is already filled
		public boolean isTaken(){
			if(top1 == top2){
				return true;
			}
			return false;
		}

		public boolean isEmpty(){
			if(top1 == -1 || top2 == size){
				return true;
			}
			return false;
		}
		//Push 1 Function
		public void push1(int val){
			if(isTaken()){
				System.out.println("No place available for the element");
			}else{
				arr[++top1] = val;
			}
		}

		//Push 2 Function
		public void push2(int val){
			if(isTaken()){
				System.out.println("No place available for the element");
			}else{
				arr[--top2] = val;
			}
		}

		//Pop 1 Function
		public int pop1(){
			if(isEmpty()){
				return -1;
			}
			return arr[top1--];
		}

		//Pop 2 Function
		public int pop2(){
			if(isEmpty()){
				return -1;
			}
			return arr[top2++];
		}

		/*End for this problem*/
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		//Taking size of the stack
		int n = sc.nextInt();
		Stack st = new Stack(n);

		st.push1(2);
		st.push1(3);
		st.push2(4);
		System.out.print(st.pop1()+" ");
		System.out.print(st.pop2()+" ");
		System.out.print(st.pop2()+" ");
	}
}