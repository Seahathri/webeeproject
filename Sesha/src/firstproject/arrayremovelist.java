
package firstproject;
import java.util.ArrayList;

public class arrayremovelist {
	
	public static void main (String[]args) {
		
		ArrayList <String> color = new ArrayList<String>();
		System.out.println("Remove the list");

		color.add("Black");
		color.add("White");
		color.add("Green");
		color.add("Yellow");
		color.add("Red");
		color.remove(2);
		color.remove(0);
System.out.println(color);
		
		
		
		
	}

}