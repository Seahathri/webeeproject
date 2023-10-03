package firstproject;

public class findleapyear {

	public static void main(String[]args) {
		
		int year=2001;
		if ((year %4==0)&& (year %100!=0)|| (year%400==0)) {
			
			System.out.println("Yes this is leapyear");
		}else {
			System.out.println("Sorry, I think this is not a leapyear");
		}
	}
}
