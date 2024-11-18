package Com.Flipkart.Com.Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) {
		
		
		System.out.println("mohit sharma");  
		demo test = new demo();
		test.loginWithOtp();
		test.loginWithSocialIcon();
		test.loginWithusername();
		
	}
	 
	public void loginWithusername() {
		
	System.out.println("username");
		
	}
	
	public void loginWithOtp() {
		
		System.out.println("otp");	
		
	}
	
	public void loginWithSocialIcon() {
		System.out.println("facebook");
		
	}

	
	public void launchUrl() {
		
		WebDriver driver = new ChromeDriver();
		
	}
}
