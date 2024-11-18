package test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtomultiple {
	
	public static void main(String[] args) {
		switchtomultiple s1 = new switchtomultiple();
		s1.multipleWindow();
	}


public void multipleWindow() {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
   String parentId = driver.getWindowHandle();
   System.out.println(parentId);
  WebElement button = driver.findElement(By.cssSelector("button#newTabsBtn"));
  JavascriptExecutor js = (JavascriptExecutor)driver;
  js.executeScript("arguments[0].click();",button);
 // button.click();
  
   Set<String> allWindows = driver.getWindowHandles(); 
   for(String s:allWindows) {
	   if(!s.equals(parentId)) {
		   driver.switchTo().window(s);
		  String actualTitllte = driver.getTitle();
		  if(actualTitllte.contains("AlertsDemo"));{
		  break;
	   }
   }
}
  WebElement field1 = driver.findElement(By.cssSelector("button#alertBox"));
   //field1.sendKeys("mohit");
   field1.click();
  Alert a  = driver.switchTo().alert();
  a.accept();
}

    
}
	
