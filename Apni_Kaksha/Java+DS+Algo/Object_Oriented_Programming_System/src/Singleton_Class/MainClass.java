package Singleton_Class;

public class MainClass {

	public static void main(String[] args) {
		
		AppConfig obj = AppConfig.getInstance();
		
		System.out.println(obj);
	}
}
