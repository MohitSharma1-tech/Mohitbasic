package test;

public class globalvariable {
	   int age = 30;
	   
	   public static void main(String[] args) {
		   globalvariable g = new globalvariable();
		   g.test1();
	}
	   
	   public void test() {
		   String s = "automation";
		   System.out.println(s);
		   System.out.println(age);
	   }
	
	
	public void test1() {
		int age = 40;
		System.out.println(age);

	}

}
