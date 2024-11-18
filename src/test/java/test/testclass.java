package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Flipkart.Com.Flipkart.demo;

public class testclass {

	public static void main(String[] args) {
		testclass t = new testclass();
		t.launchUrl();
	}

	
	public void launchUrl () {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage() .window() .maximize();
      WebElement username =  driver.findElement(By.xpath("//input[@id='user-name']"));
      username.sendKeys("standard_user");
      WebElement passsword =  driver.findElement(By.xpath("//input[@id='password']"));
      passsword.sendKeys("secret_sauce");
      WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
	 loginbutton.click();
		}
}  
