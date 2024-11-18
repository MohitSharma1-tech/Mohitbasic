package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
	
	public static void main(String[] args) {
		dropdown d = new dropdown();
		d.selectDropDown();
	}
		 
	


public void selectDropDown() {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	driver.manage(). window(). maximize(); 
	
	WebElement dropdown =  driver.findElement(By.xpath("//select[@id='course']"));
	Select s = new Select(dropdown);		
     s.selectByVisibleText("Javascript");
}

}