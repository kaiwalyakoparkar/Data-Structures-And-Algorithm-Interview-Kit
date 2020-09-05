package Fun;
import java.util.*;

public class Hacking_Nasa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("You are Unauthorized user!");
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		System.out.println("Enter dummy password!");
		String passwd = sc.nextLine();
		System.out.println("Hello "+name+" !");
		System.out.println("Linking to Database...");
		System.out.println("Connection Successful...");
		System.out.println("Fetching data...");
		System.out.println("Downloading Packages please wait...");
		System.out.println("Download Complete...");
		System.out.println("Nasa Hacked...");
		System.out.println(name+" have access to Nasa with passwd "+passwd);
		sc.close();
	}
}
