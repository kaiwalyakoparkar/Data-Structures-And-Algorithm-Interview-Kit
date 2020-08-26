package Strings;

public class Functions_by_Developers {

	public static void main(String[] args) {
		
		String name = "Kaiwalya Koparkar";
		String name2 = "Kaiwalya Koparkar";
		String copy = " is Learning Java!";
		String lower = "this was in lower case";
		String upper = "THIS WAS IN UPPER CASE";
		String TryTrim="          Kaiwalya        ";
		
		System.out.println(name.charAt(9));//Returns the character on that index
		System.out.println(name.length());//Returns the length of string. Counts spaces too
		System.out.println(name.substring(9));//Creates a substring from the given index 9
		System.out.println(name.substring(0,8));//Creates a substring from 0 to 8
		System.out.println(name.contains("Kai"));//Returns if the character of string is present in the main string
		System.out.println(name.equals(name2));//Returns if the strings are same
		System.out.println(name.isEmpty());//Checks whether the string is empty
		System.out.println(name.concat(copy));//Connects two strings.
		System.out.println(copy.replace('J', 'L'));//Replaces all J with L
		System.out.println(name.indexOf('w'));//Finds the index of this character from string
		System.out.println(upper.toLowerCase());//Converts all the characters into Lower case
		System.out.println(lower.toUpperCase());//Converts all the characters into Upper case
		System.out.println(TryTrim.trim());
		
		//Splits the string from the given character.
		String cars = "Ferari, Lamborghini, Bogati, Rolce Royce";
		String allcars[] = cars.split(",");
		for(String SingleCar: allcars) {
			System.out.println(SingleCar);
		}
	}
	
}
