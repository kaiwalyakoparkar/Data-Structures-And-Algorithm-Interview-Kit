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
		
		/*HashSet : Although we arrange all the elements
		 *sequentially they do not get stored sequentially
		 *we have to use other type of set to store and 
		 *print them in order given by us*/
		
		//Declaration of the sets using Hash set
		Set<String> fruits = new HashSet<>();
		Set<Integer> x = new HashSet<>();
		Set<Integer> y = new HashSet<>();
		//Declaration of the sets using Linked Hash Set
		Set<String> seasonalFruits = new LinkedHashSet<>();
		//Declaration of the sets using tree set
		Set<Integer> stocks = new TreeSet<>();
		
		//add() - Adds a single element to the collection
		fruits.add("Mango");
		fruits.add("Guava");
		fruits.add("Watermalon");
		fruits.add("Mango");
		System.out.println(fruits);
		System.out.println("The size of set is: "+fruits.size());
		
		seasonalFruits.add("Mango");
		seasonalFruits.add("Grapes");
		seasonalFruits.add("Oranges");
		seasonalFruits.add("Papaya");
		seasonalFruits.add("Chikku");
		System.out.println(seasonalFruits);
		
		stocks.add(10);
		stocks.add(6);
		stocks.add(4);
		stocks.add(13);
		stocks.add(11);
		System.out.println(stocks);
		
		//addAll() method - it is used for the union of two sets
		x.add(5);
		x.add(65);
		x.add(54);
		x.add(1);
		System.out.println(x);
		y.add(6);
		y.add(45);
		y.add(59);
		y.add(1);
		System.out.println(y);
		x.addAll(y);
		System.out.println(x);
		
		//size() method - gives the size of the collection
		System.out.println("The size of set is: "+seasonalFruits.size());
		
		//retainsAll() method - checks if there are any intersecting elements
		System.out.println("Is there any intersecting element? -"+seasonalFruits.retainAll(fruits));
		
		//remove() method - removes the element from the collection
		fruits.remove("Guava");
		System.out.println(fruits);
		
		//containsAll() method - checks if 2nd collection contains elements from the 1st collection
		System.out.println("Does it contains passed fruit: "+fruits.contains("Mango"));
		System.out.println(seasonalFruits.containsAll(seasonalFruits));
		
		//removeAll() method - removes all the elements from the collection
		seasonalFruits.removeAll(seasonalFruits);
		System.out.println(seasonalFruits);
		
		//isEmpty() method - checks if the collection is empty
		System.out.println(fruits.isEmpty());
		System.out.println(seasonalFruits.isEmpty());
	}
}
