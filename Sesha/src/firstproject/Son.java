package firstproject;

public class Son extends Father {
	
public void educaion() {
	System.out.println("Arts");
}
public static void main(String[]args) { 
	
	Son obj = new Son();
	obj.Business();
	obj.Vehicle();
	obj.salary();
	obj.educaion();
	obj.building();
	obj.land();
}
}
