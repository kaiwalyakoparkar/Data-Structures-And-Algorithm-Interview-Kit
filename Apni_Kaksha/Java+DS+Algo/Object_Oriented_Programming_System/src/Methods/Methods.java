package Methods;

public class Methods {

	public static void main(String[] args) {
		
		int FirstNumber=34;
		int SecondNumber=23;
		
		int result= maximum(FirstNumber,SecondNumber);
		System.out.println("The maximum number is "+result);
	}
	
	//This the method for finding the maximum number
	static int maximum(int num1, int num2) {
		
		if(num1<num2) {
			return num2;
		}else {
			return num1;
		}
		
	}
	
}
