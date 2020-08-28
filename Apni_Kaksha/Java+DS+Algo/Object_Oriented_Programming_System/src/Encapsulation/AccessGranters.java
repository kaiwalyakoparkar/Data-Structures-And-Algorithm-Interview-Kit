package Encapsulation;

public class AccessGranters {

	static class Student{
		
		private int age;
//		private int rollno;

		//I'll be accessing this From Encapsulation_Main class
		public int GetAge() {
			System.out.println("From GetAge");
			return age;
		}
		
		
		//I'll restrict the user to add age greater than 20
		public void setAge(int age) {
			
			if(age>20) {
			
				System.out.println("You are too older to get into our college!");
				
			}else {
				
			this.age=age;
			
			}
		}
		
	}
	
}
