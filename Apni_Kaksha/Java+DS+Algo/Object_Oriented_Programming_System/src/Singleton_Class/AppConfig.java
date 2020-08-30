package Singleton_Class;

public class AppConfig {

	private AppConfig() {
		System.out.println("In AppConfig!");
	}
	
	public static AppConfig obj = new AppConfig();//Created new object
	
	public static AppConfig getInstance() {
		return obj;//Returned the object. And the catching is achieved
	}
}
