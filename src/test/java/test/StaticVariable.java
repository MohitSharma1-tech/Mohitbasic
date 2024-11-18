package test;

public class StaticVariable {
	
	  String name;
	  int salary;
	  static String companyName = "TCS" ;
	  
	  public static void main(String[] args) {
		  StaticVariable rahul = new StaticVariable("Rahul",80000);
		  rahul.testing();
		  StaticVariable mohit = new StaticVariable("Mohit",80000);
		  mohit.testing();
		  
	}
	  
	  public StaticVariable(String n,int s) {
		  
		  
		  name = n;
		  salary =s;
	  }
	  
	  public void testing() {
		  
		  System.out.println(companyName);
		  System.out.println(name);
		  System.out.println(salary);
	  }

}
