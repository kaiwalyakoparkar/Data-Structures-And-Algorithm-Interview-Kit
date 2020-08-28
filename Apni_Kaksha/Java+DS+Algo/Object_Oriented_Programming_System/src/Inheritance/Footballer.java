package Inheritance;

public class Footballer extends Person{

	protected String name;
	public void play() {
		name= "Messi";
		System.out.println(name+" is playing football");
	}
	@Override
	public void eats() {
		name = "Humans";
		System.out.println(name+" are eating !");
	}
	
	@Override
	public void sleep() {
		name = "Humans";
		System.out.println(name+" are sleeping !");
	}
}
