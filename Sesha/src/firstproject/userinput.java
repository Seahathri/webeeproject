package firstproject;
import java.util.Scanner;
public class userinput {

	public static void main(String[]args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter user detials");
		
		String name = obj.nextLine();
		System.out.println("User Name:"+ name);
		
		int Age = obj.nextInt();
		System.out.println("User Age:"+Age);
		 
		Boolean Alive = obj.nextBoolean();
		System.out.println("User is our staff"+Alive);
		
		long Accno = obj.nextLong();
		System.out.println("User Acc no:"+Accno);
		
	}
}
