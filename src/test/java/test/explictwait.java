package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class explictwait {
	
	public static void main(String[] args) {
		
		
	explictwait e = new explictwait();
	e.explictWAit();
		
	}


     

public void explictWAit() {
	
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	
	
	
	//WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
//	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(15));
//   	w.until(ExpectedConditions.visibilityOf(loginbutton));
	
//	FluentWait f = new FluentWait(driver);
//	f.withTimeout(Duration.ofSeconds(10));
//	f.pollingEvery(Duration.ofSeconds(3));
//	f.until(ExpectedConditions.alertIsPresent());
			
			
			
	
	
	driver.quit();
	
}
}