package test;

public class B {
	
	int empid;
	String name;
	
	public B(int id , String ename) {
		
		empid = id;
		name = ename;
		
		
	}
	public B (int i,int j, int k) {
		
		System.out.println("Automation");
	}
	
	
	public static void main(String[] args) {
		B b = new B(1,"rahul");
		b.testing();
		 B bb = new B (1,2,3);
		
		
	}

	
	public void testing() {
		
		System.out.println(empid);		
		System.out.println(name);

		
		
	}
	
}
