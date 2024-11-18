package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validation {
	
	public static void main(String[] args) {
		validation v = new validation();
		v.processValidation();
		
	}

	
	public void processValidation () {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement field1 = driver.findElement(By.cssSelector("input#user-name"));
		field1.sendKeys("standard_user");
		WebElement field2 = driver.findElement(By.cssSelector("input#password"));
		field2.sendKeys("secret_sauce");
		WebElement button = driver.findElement(By.cssSelector("input#login-button"));
		button.click();
		//assertTrue(driver.findElement(By.cssSelector("div#product_label")).isDisplayed());
		
	//	assertTrue(driver.findElement(By.cssSelector("div#product_label")).isSelected());
		//assertTrue(driver.findElement(By.cssSelector("div#product_label")).isEnabled());
		WebElement heading = driver.findElement(By.cssSelector("div#product_label"));
		String value = heading.getText();
		assertEquals(value, "Products");
		
		
	}
}
