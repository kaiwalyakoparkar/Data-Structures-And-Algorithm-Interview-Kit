package Inheritance;

public class Teacher extends Person{

	private String name;
	
	public void teach() {
		name="Roshan";
		System.out.println(name+" is teaching!");
		
	}
	@Override
	public void eats() {
		super.eats();//Accesses the method of the parent class
		name = "Humans";
		System.out.println(name+" are eating !");
	}
	
	@Override
	public void sleep() {
		super.eats();//Access the method of the parent class
		name = "Humans";
		System.out.println(name+" are sleeping !");
	}
}
