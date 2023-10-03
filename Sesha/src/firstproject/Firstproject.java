package firstproject;

public class Firstproject {
	public void studentName() {
	System.out.println("Sesha");	
	}
	public void studeAge () {
		System.out.println(22);
	}
	public void  studentDob(){
	System.out.println("01/10/2001");
	}
	
	public static void main (String[]args) {
		//(Main method)
//		System.out.print("Hellow welcome to Java");
		
		//Sub method
	Firstproject show = new Firstproject();
		show.studentName();
		show.studeAge();
		show.studentDob();
	}

}

