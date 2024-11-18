package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shortcut {
	
	public static void main(String[] args) throws IOException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
          
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/test/env.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		WebElement username = driver.findElement(By.cssSelector("input#user-name"));
		username.sendKeys(prop.getProperty("username"));
		WebElement password = driver.findElement(By.cssSelector("input#password"));
		password.sendKeys(prop.getProperty("password"));
		
		
	}

}
