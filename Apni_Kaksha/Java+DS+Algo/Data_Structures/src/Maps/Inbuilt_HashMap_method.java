/*
 * @author : Kaiwalya Koparkar
 * @date : 16/ 09/ 2020
 * @resource : Apni Kaksha(Youtube Channel)
 * In this I have Implemented the Inbuilt Hash Maps to perform
 * the tasks
 * 
 */

package Maps;
import java.util.*;
import java.util.Map.Entry;

public class Inbuilt_HashMap_method {

	public static void main(String[] args) {
		
		Map<String,Integer> number = new HashMap<>();
		number.put("One", 1);
		number.put("Two", 2);
		number.put("Four", 4);
		number.put("Five", 5);
		number.put("Six", 6);
		number.put("Seven", 7);
		number.put("Eight", 8);
		
		System.out.println(number);
		
		//value to the key is updated
		System.out.println();
		number.put("One", 10);
		System.out.println(number);
		
		//putIfAbsent() Method - It only replaces value when it is not already present
		System.out.println();
		System.out.println(number.putIfAbsent("One",1));
		
		//get(K) Method - It returns the value associated with the key
		//if not found return null
		System.out.println();
		System.out.println(number.get("Three"));
		System.out.println(number.get("Hundred"));
		
		//getOrDefault(K, Default Value) Method - It returns the value associated with the key
		//if not found returns default value
		System.out.println();
		System.out.println(number.getOrDefault("Two",2));
		System.out.println(number.getOrDefault("Hundred",100));
		
		//containsKey() Method - It checks if the map contains the key or not
		System.out.println();
		System.out.println(number.containsKey("One"));
		
		//containsValue() Method - It checks if the map contains the value or not
		System.out.println();
		System.out.println(number.containsValue(100));
		
		//replace(K, V) Method - It replaces value of K with V
		System.out.println();
		System.out.println(number);
		number.replace("Five",500);
		System.out.println("After replacing: "+number);
		
		//replace (K, V old, V new) Method - Replaces the value of key K with the new alue only if the key k is associated with the value oldvalue
		System.out.println();
		System.out.println(number);
		number.replace("One", 10, 1);
		System.out.println(number);
		number.replace("Five",6,600);
		System.out.println(number);
		
		//remove(K) - Removes the entry from the map presented by k
		System.out.println();
		System.out.println(number);
		number.remove("Eight");
		System.out.println(number);
		
		//remove(K, V) - Removes the entry if K is associated with v
		System.out.println();
		System.out.println(number);
		System.out.println(number.remove("Seven",3));
		
		//keySet() - Displays all the keys present
		System.out.println();
		System.out.println(number);
		System.out.println(number.keySet());
		
		//values() - Displays all the values present
		System.out.println();
		System.out.println(number);
		System.out.println(number.values());
		
		//entrySet() - Displays all the entry sets
		System.out.println();
		System.out.println(number);
		System.out.println(number.entrySet());
		
		//Iterate through all the elements in the entry set;
		//Operation : Say suppose I have to multiply each value by 10 then
		System.out.println();
		System.out.println();
		System.out.println("Set Before: "+number);
		for(Entry<String,Integer> en : number.entrySet() ) {
			en.setValue(en.getValue()*10);
		}
		System.out.println("Set After: "+number);
		
		
	}
}
