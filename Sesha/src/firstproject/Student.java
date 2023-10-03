package firstproject;

public class Student {
	
	public void studentname(int ID){
		System.out.println(ID);
	};
	
	public void studentname(String name){
		System.out.println(name);
	};

	public void studentname(float Salary){
		System.out.println(Salary);
	};

	public static void main(String[]args){
		
		Student obj = new Student();
		
		obj.studentname(5226);
		obj.studentname("Sesha");
		obj.studentname(100000);
		
	
	}
}
