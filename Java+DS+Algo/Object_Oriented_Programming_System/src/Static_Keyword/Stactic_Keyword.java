package Static_Keyword;

//This cannot be public class Human because in every java file there is only one public class
	class Human{
		
		String name;
		static String breed = "Homo Sepians";
	}
public class Stactic_Keyword {

	public static void main(String[] args) {
		
		Human raman = new Human();
		raman.name= "Raman";
		
		System.out.println("Name of human is "+raman.name);
		System.out.println("Breed is "+raman.breed);
		
	}
	
}
