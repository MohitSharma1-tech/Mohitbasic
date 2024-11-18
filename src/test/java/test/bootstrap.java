  package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrap {
	
	 public static void main(String[] args) {
		bootstrap b  = new bootstrap();
		b.bootStrapDropdown();
	}

	 
	 public void bootStrapDropdown() {
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement button1 = driver.findElement(By.cssSelector("button#menu1"));
		button1.click();
		List<WebElement> value =  driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		for(WebElement e:value) {
		String v = e.getText();
		if(v.equals("JavaScript")) {
			e.click();
			break;
		
		}
		
			
	 }
	//driver.quit(); 
}
}
