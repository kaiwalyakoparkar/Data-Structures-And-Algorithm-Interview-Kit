/*
 * 
 * @author : Kaiwalya Koparkar
 * @date : 16/09/2020
 * @resource : Apni Kaksha (Youtube Channel)
 * 
 */
package Maps;
import java.util.*;
public class InBuilt_Tree_Map {

	public static void main(String[] args) {
		Map<String,Integer> roll = new TreeMap<>();
		//When used TreeMap everything is store in sorted manner
		roll.put("ten",10);
		roll.put("six", 6);
		roll.put("five", 5);
		System.out.println(roll);
		
	}
}
