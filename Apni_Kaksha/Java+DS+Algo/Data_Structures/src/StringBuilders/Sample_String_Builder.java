package StringBuilders;

public class Sample_String_Builder {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder("Hello");
		
		sb.append("Kaiwalya");
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.charAt(2));
		
		sb.setCharAt(2,'t');
		System.out.println(sb);
		
		sb.insert(5, 'c');
		System.out.println(sb);
		
		sb.deleteCharAt(3);
		System.out.println(sb);
	}
	
}
