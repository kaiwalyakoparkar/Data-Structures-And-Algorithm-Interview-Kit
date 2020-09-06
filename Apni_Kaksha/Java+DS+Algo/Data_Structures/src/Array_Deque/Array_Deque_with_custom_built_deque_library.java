package Array_Deque;
//import java.util.*;

public class Array_Deque_with_custom_built_deque_library {

	public static void main(String[] args) {
		
		MyArrayDeque<Integer> ad = new MyArrayDeque<>();
		
		ad.addLast(100);
		ad.addFirst(10);
		ad.addFirst(20);
		ad.addFirst(30);
		
		ad.addFirst(1);
		ad.print();
		ad.getSize();
		
	}
}
