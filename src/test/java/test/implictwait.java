package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implictwait {
	
	
	
public static void main(String[] args) {
	implictwait i = new implictwait();
	i.waitImplict();
	
	
}

public void waitImplict() {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/search/label/TechNews");
	driver.manage().window().maximize();
  //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 //   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	driver.quit();
}



}
