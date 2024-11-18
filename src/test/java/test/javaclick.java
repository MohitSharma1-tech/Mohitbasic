package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaclick {
	
	public static void main(String[] args) {
		javaclick ja = new javaclick();
		ja.javaClick();
	}

	public void javaClick() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage() .window() .maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      WebElement username =  driver.findElement(By.xpath("//input[@id='user-name']"));
      username.sendKeys("standard_user");
      WebElement passsword =  driver.findElement(By.xpath("//input[@id='password']"));
      passsword.sendKeys("secret_sauce");
      WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();",loginbutton);
		
	}
	
	
	
}
