package Static_Keyword;

public class Blocks {
	//Creating Blocks This will be executed before main
	static {
		System.out.println("In block 1");
	}
	static {
		System.out.println("In block 2");
	}
	public static void main(String[] args) {
		System.out.println("Inside main function");
	}
	static {
		System.out.println("In block 3");
	}
}
