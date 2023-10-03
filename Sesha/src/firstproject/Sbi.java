package firstproject;

public class Sbi extends Banking{
public void Saving () {
	System.out.println("Saving account");
}
public void current() {
	System.out.println("Current account");
	
}
public void jointaccc() {
	System.out.println("Jointaccc account");
	
}

	public static void main (String[]args) {
		
		Sbi obj = new Sbi() ;
		obj.current();
		obj.Salaryacc();
		obj.Saving();
		
	}

    
	
	

	
}
