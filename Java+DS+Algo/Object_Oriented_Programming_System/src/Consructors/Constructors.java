package Consructors;

class Vehicle{
	
	int wheels;
	int HeadLights;
	
	Vehicle(int wheels){
		
		this.wheels = wheels;
		HeadLights=2;
	}
	
}
public class Constructors {

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle(4);
		System.out.println("This vehicle has "+car.wheels+" wheels");
		System.out.println("And has "+car.HeadLights+" head lights");
	}
}
