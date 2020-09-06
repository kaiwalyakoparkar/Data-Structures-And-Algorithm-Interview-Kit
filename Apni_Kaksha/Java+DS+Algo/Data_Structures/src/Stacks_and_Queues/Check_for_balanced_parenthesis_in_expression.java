package Stacks_and_Queues;
import java.util.Scanner;

public class Check_for_balanced_parenthesis_in_expression {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		java.util.Stack<Character> stack = new java.util.Stack<>();
		
		String ch = sc.nextLine();
		boolean Balanced = true;
		sc.close();
		for(int i=0; i<ch.length(); i++) {
			char element = ch.charAt(i);

			if(element=='('|| element=='['||element=='{') {
				
				stack.push(element);
				continue;
				
			}else if(element==')'||element==']'|| element=='}') {
				
				if(element==stack.peek()) {
					stack.pop();
				}else {
					 break;
				}
				
			}else {
				System.out.println("Invalid Input ");
			}
		}
		
		if(stack.isEmpty()==true) {
			System.out.println("The parenthesis in the expressions are balanced");
		}else {
			System.out.println("The parenthesis in the expressions are not balanced");
		}
		
	}
}
