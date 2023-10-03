package firstproject;

public class Hdfcinterface implements Bankinterface {

public void saving() {
	System.out.println("HDFC Saving account");
}

public void current() {
	System.out.println("HDFC current account");
}

public void joint() {
	System.out.println("HDFC joint account");
}
public static void main(String[]args) {
	
Hdfcinterface obj = new Hdfcinterface ();
obj.joint();
obj.saving();
obj.current();
	
	
}

}
