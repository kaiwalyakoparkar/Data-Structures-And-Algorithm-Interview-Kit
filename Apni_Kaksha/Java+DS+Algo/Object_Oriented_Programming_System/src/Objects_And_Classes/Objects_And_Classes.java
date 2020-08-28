package Objects_And_Classes;

public class Objects_And_Classes {
	
	//Always write static before declaring the class otherwise there will be No enclosing instance of type error
	static class Cat{
		int leg,eyes;
		String color;
		
		public void walk() {
			
			System.out.println("This cat can walk");
			
		}
		public void eat() {
			
			System.out.println("This cat eats");
			
		}
		public void discription(){
			
			System.out.println("The cat has " +leg+ " legs" +eyes+ " and eyes. Its color is " +color);
			
		}
	}

	//There can be only one public class in the entire program that is main
	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		//Passing the value
		cat1.leg=3;
		cat1.eyes=2;
		cat1.color="White";
		cat2.leg=4;
		cat2.eyes=1;
		cat2.color="Black";
		
		//Calling the methods to get the answer.
		cat1.walk();
		cat1.eat();
		cat1.discription();
		cat2.walk();
		cat2.eat();
		cat2.discription();
		
	}
	
}
