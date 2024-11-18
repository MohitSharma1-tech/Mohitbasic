package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hover {


 public static void main(String [] args) {
	 
	 hover h = new hover();
	 h.hoverMOuse();
 }


 

public void hoverMOuse () {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	driver.manage().window(). maximize();
	
  WebElement link1 = driver.findElement(By.xpath("//a[@href='https://www.hyrtutorials.com/search/label/Tutorials  ']"));
	
	 Actions a = new Actions(driver);
	 a.moveToElement(link1).build().perform();
	
	
}

}