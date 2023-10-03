package firstproject;

public class Son2 extends Father {

	public void studies () {
		System.out.println ("Engeniring");
	}
	public void parttimework() {
		System.out.println("partime work");
	}

 
 public static void main (String[]args){
	 
	 Son2 obj = new Son2();
	 
	 obj.parttimework();
	 obj.salary();
	 obj.Vehicle();
	 obj.studies();
 }
}
