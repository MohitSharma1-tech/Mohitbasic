package test;

// equal to class name
//don't have any return type even void
//default constructor----zero argument

public class Constructor23 {
	int empid;
	String name;
	
	public Constructor23(int id , String ename) {
		empid = id;
		name = ename;
	}
	
	
	public static void main(String[] args) {
		Constructor23 b = new Constructor23(1,"rahul");
		b.sigma();
		Constructor23 bb = new Constructor23(2,"mohit");
		bb.sigma();
		
	//	Constructor b = new Constructor();
		//	Constructor bb = new Constructor();
		//	Constructor bbb = new Constructor(10);
	
	}
		
	//public Constructor() {
	public void sigma () {
		
		System.out.println("empid");
		System.out.println("name");

	}
	// public Constructor(int i) {
		
	//	System.out.println("Selenium");
	//	}

}