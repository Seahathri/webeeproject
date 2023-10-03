
package firstproject;
import java.util.ArrayList;

public class arraysetlist {
	
	public static void main (String[]args) {
		System.out.println("Set the Array list");

		ArrayList <String> color = new ArrayList<String>();
		color.add("Black");
		color.add("White");
		color.add("Green");
		color.add("Yellow");
		color.add("Red");
		color.set(3, "Pink");
		color.set(1, "Greay");
System.out.println(color);
		
		
		
		
	}

}
