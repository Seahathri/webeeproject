package firstproject;
import java.util.LinkedList;

public class arrrayremovelinkedlist {
	
	public static void main (String[]args) {
		
		LinkedList <String> color = new LinkedList<String>();
		System.out.println("Remove the list");

		color.add("Black");
		color.add("White");
		color.add("Green");
		color.add("Yellow");
		color.add("Red");
		color.removeFirst();
		color.removeLast();
System.out.println(color);
		
		
		
		
	}

}