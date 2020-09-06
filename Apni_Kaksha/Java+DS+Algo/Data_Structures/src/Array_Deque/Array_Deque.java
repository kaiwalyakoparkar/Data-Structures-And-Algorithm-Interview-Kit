package Array_Deque;
import java.util.*;

public class Array_Deque {

	public static void main(String[] main) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.add(16);
		ad.add(5);
		ad.add(3);
		ad.add(13);
		ad.add(23);
		System.out.println(ad);
		ad.addFirst(9);
		System.out.println(ad);
		ad.addLast(88);
		System.out.println(ad);
		
		
		for(int i=0; i<9; i++) {
			if(ad.pollFirst()==null) {
				System.out.println("Rikama aahe re");
			}else {
				ad.pollFirst();
			}
		}
		System.out.println(ad);
	}
}
