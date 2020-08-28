package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		
	/*Teacher is inherited from the Person 
	 *the protected class can only be accessed by inherited classes*/
	 Teacher t = new Teacher();
	 t.eats();
	 t.sleep();
	 t.teach();
	 
	 /*Footballer is inherited from the Person 
     *the protected class can only be accessed by inherited classes*/
	 Footballer f = new Footballer();
	 f.sleep();
	 f.eats();
	 f.play();
	}
}
