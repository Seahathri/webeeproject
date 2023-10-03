

package firstproject;
import java.util.LinkedList;

public class arraylinkedlist {
	
	public static void main (String[]args) {
		System.out.println("Set the Linked list");

		LinkedList <String> color = new LinkedList<String>();
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
