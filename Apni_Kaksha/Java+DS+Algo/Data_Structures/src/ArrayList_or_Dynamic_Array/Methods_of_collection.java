package ArrayList_or_Dynamic_Array;
import java.util.*;

public class Methods_of_collection {

	public static void main(String[] args) {
		
		List<String> fruits = new LinkedList();//fruits is type of LinkedList
		List<String> vegetable = new ArrayList();//vegetable is type of ArrayList
		
		/*add() function: Adds the elements to the List*/
		fruits.add("Mango");
		fruits.add("Guava");
		fruits.add("Water Melon");
		System.out.println(fruits);
		//vegetables now
		vegetable.add("Cabbage");
		vegetable.add("Potato");
		vegetable.add("Tomato");
		System.out.println(vegetable);
		
		
		/*addAll() function: Appends the two list to each other*/
		/*fruits is of type LinkedList and vegetable is of type ArrayList still they can be appended to
		 *each other*/
		fruits.addAll(vegetable);
		System.out.println(fruits);
 		
		
		/*get() function: gets the element from the specific index number*/
		System.out.println(fruits.get(0));
		//We have appended vegetables with fruits so we can do fruits.get(5)---> Tomato as output
		System.out.println(vegetable.get(1));
		
		
		/*set() function: used to update the value of the specific location*/
		vegetable.set(0, "Ladies Finger");
		System.out.println(vegetable);
		
		
		/*remove() function: removes the element from the specific location*/
		/*here when we use the array and remove any element we have to use for loop and shift all
		 *the following elements in at that place but here ArrayList does this work for us.*/
		vegetable.remove(0);//Removes the ladies finger from the 0th position and add potato on its index
		
		
	}
}
