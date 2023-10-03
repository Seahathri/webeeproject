package firstproject;
import java.util.Scanner;
public class wednesdayprojectgetintandaddmultiply {
public static void main(String[]args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("Get 2 int from user and sum ");

	int value1 = obj.nextInt();
	System.out.println("Value 1:" + value1);

	int value2 = obj.nextInt();
	System.out.println("Value 1:" + value2);
	
	System.out.println(value1+value2);
	System.out.println(value1-value2);
	System.out.println(value1/value2);
	System.out.println(value1*value2);
	System.out.println(value1%value2);
	
}
}
