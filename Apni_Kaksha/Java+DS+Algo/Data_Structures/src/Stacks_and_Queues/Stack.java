package Stacks_and_Queues;
import java.util.*;
public class Stack {
	
	public static void main(String[] args) {
		
		java.util.Stack<Integer> st = new java.util.Stack<>();
		Scanner sc = new Scanner(System.in);
		st.push(10);
		System.out.println(st);
		for(int i=0; i<5; i++) {
			int n=sc.nextInt();
			st.push(n);
		}
		sc.close();
		System.out.println(st);
		System.out.println("Top is "+st.peek());
		System.out.println(st.pop());
		System.out.println("Top is "+st.peek());
	}

}
