package ArrayList_or_Dynamic_Array;
import java.util.*;

public class Dynamic_Array_of_fruits {

	public static void main(String[] args) {
		
//		ArrayList<String> fruits= new ArrayList();/*OR the next is the most conventional way*/
		/*We use List<> instead of ArrayList because whenever we are going to add the add the
		 *object to it ultimately we are going to tell it's type. And there is one more advantage we can
		 *create objects of LinkedList, stacks, queues from the single List<> othervise we would have to write
		 *LinkedList<String> = new LinkedList();
		 *Stack<String> = new Stack();
		 *Queue<String> = new Queue();*/
		
		List<String> fruits = new ArrayList();
		
		fruits.add("Mango");
		
		System.out.println(fruits);
	}
}
