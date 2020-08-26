package Strings;

public class String_Declaration {
	
	public static void main(String[] args) {
		
		String name = "Kaiwalya";//By literal
		String name1 = new String("Kaiwalya");
		String name2 = "Kaiwalya";
		/*This is lateral initialization. This 
		 *variable name is saved is String pool area
		 *so that it can be used in catching. means 
		 *name Kaiwalya can be used by other variables
		 *to save memory
		 *Generally this method is recommended*/
		String sname = new String("Koparkar");//By new
		/*This creates a new object sname . This
		 *will create Koparkar in heap area where 
		 *usually all the variables are saved and
		 *one copy of it will be saved in pool area*/
		
		System.out.println(name);
		System.out.println(sname);
		System.out.println(name==name1);//Not same as lateral and new
		System.out.println(name==name2);//Same because in String pool area.
	}

}
