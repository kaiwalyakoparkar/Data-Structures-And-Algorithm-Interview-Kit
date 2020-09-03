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
		
		
		/*removeAll() function: removes multiple function from the list.*/
		/*Here I will be creating a different list, take its subset and remove the subset elements*/
		List<String> name = new ArrayList();
		name.add("Kaiwalya");
		name.add("Ketan");
		name.add("Vaibhavi");
		List<String> subname = new ArrayList();
		subname.add("Kaiwalya");
		subname.add("Ketan");
		name.removeAll(subname);
		System.out.println(name);
		
		
		/*clear() function: removes all the elements from the list*/
		/*I will be again creating new list and will be operating on it */
		List<String> brands = new ArrayList();
		brands.add("Puma");
		brands.add("Adidas");
		brands.add("Nike");
		System.out.println("Before clearing: "+brands);
		brands.clear();
		System.out.println("After clearing: "+brands);
		
		
		/*size() function: Tells the length/size of the list*/
		List<String> softwares = new ArrayList();
		softwares.add("Vs code");
		softwares.add("Sublime Text");
		softwares.add("Eclipse");
		softwares.add("Android studio");
		softwares.add("Dev C++");
		System.out.println("The number of softwares are :"+softwares.size());
		
		
		/*contains() function: checks if the element is present in the list or not*/
		System.out.println(softwares.contains("Vs code"));
		
		
		/*isEmpty() function: checks if the list is empty*/
		List<String> EmptyList = new ArrayList();
		System.out.println(softwares.isEmpty());
		System.out.println(EmptyList.isEmpty());
		
		/*toArray() function: Converts the string into array*/
		String temp[] = new String[softwares.size()];
		
		softwares.toArray(temp);
		for(String e: temp){
			//means for each e element in temp
			System.out.println(e);
		}
	}
}
