package Consructors;

class Vehicle1{
	
	int wheels;
	int HeadLights;
	String Color;
	
	Vehicle1(int wheels){
		
		this.wheels = wheels;
		HeadLights=2;
	}
	//Constructor Overloaded
	Vehicle1(int wheels,String Color){
		
		this.wheels = wheels;
		this.Color = Color;
	}
	
}
public class ConstructorOverloding {

	public static void main(String[] args) {
		
		Vehicle1 car = new Vehicle1(4);
		System.out.println("This vehicle has "+car.wheels+" wheels");
		System.out.println("And has "+car.HeadLights+" head lights");
		
		Vehicle1 Rikshaw = new Vehicle1(3,"Yellow");
		System.out.println("The Rikhaw has "+Rikshaw.wheels+" wheels and it's color is "+Rikshaw.Color);
		
	}
}
