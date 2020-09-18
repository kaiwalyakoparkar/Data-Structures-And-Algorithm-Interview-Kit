/*
 * 
 *@author : Kaiwalya Koparkar
 *@date: 18/ 09/ 2020
 *@resource : Apni Kaksha (YouTube Channel)
 * 
 */
package Comparators_and_Comparables;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23, "Varun"));
		students.add(new Student(50, "Ketan"));
		students.add(new Student(100, "Kaiwalya"));
		students.add(new Student(15, "Anuj"));
		students.add(new Student(0, "Aman"));
		students.add(new Student(91, "K D Pathak"));
		students.add(new Student(70, "Varun"));
		
		Collections.sort(students);
		
		students.forEach(System.out::println);
	}
	
	class SortByNameThenMarks implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			if(o1.name.equals(o2.name)) {
				return o1.marks - o2.marks;
			}else {
				return o1.name.compareTo(o2.name);
			}
			
		}
		
	}
}
