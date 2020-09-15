/*
 * @author : Kaiwalya Koparkar
 * @data : 15/9/2020
 * @source : Apni Kaksha (Youtube Channel)
 * 
 * In this we are using the inbuilt interface called Sets to do our tasks
 * 
 */
package Sets;
import java.util.*;

public class Declaration_using_inbuilt_library {

	public static void main(String[] args) {
		
		//Declaration of the sets using Hash set
		Set<String> fruits = new HashSet<>();
		Set<String> seasonalFruits = new HashSet<>();
		
		//add() - Adds a single element to the collection
		fruits.add("Mango");
		fruits.add("Guava");
		fruits.add("Watermalon");
		fruits.add("Mango");
		System.out.println(fruits);
		System.out.println("The size of set is: "+fruits.size());
		
		
		seasonalFruits.addAll("Grapes","Mango","Oranges");
		System.out.println(seasonalFruits);
		System.out.println("The size of set is: "+seasonalFruits.size());
		
		System.out.println("Is there any intersecting element? -"+seasonalFruits.retainAll(fruits));
		
		fruits.remove("Guava");
		System.out.println(fruits);
		
		
		System.out.println("Does it contains passed fruit: "+fruits.contains("Mango"));
		System.out.println(seasonalFruits.containsAll(seasonalFruits));
		
		seasonalFruits.removeAll(seasonalFruits);
		System.out.println(seasonalFruits);
		System.out.println(fruits.isEmpty());
		System.out.println(seasonalFruits.isEmpty());
	}
}
