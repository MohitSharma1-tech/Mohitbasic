package test;

// equal to class name
//don't have any return type even void
//default constructor----zero argument

public class Constructor {
	int empid;
	String name;
	
	public Constructor(int id , String ename) {
		empid = id;
		name = ename;
	}
	
	
	public static void main(String[] args) {
		Constructor b = new Constructor(1,"rahul");
		b.sigma();
		Constructor bb = new Constructor(2,"mohit");
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