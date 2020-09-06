package Stacks_and_Queues;
import java.util.*;

public class Queue{
	
	public static void main(String[] args) {
		java.util.Queue<Integer> q = new LinkedList<>();
		
		q.add(13);
		q.add(3);
		q.add(23);
		q.add(1);
		q.add(99);
		System.out.println(q);
		
		System.out.println(q.peek());
		q.poll();
		System.out.println(q.peek());
		q.remove();
		System.out.println(q);
		
	}
}