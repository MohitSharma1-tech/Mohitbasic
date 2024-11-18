package test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtowindow {
	
	public static void main(String[] args) {
	switchtowindow s = new switchtowindow();	
	s.switchWindow();
	
	}
    public void switchWindow() {
    	
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    	 String parentId = driver.getWindowHandle();
    	System.out.println(parentId);
    
    	WebElement button1 = driver.findElement(By.cssSelector("button#newWindowBtn"));
    	button1.click();
    	Set<String> allWindows = driver.getWindowHandles();
    	for(String s:allWindows) {
    		if(!s.equals(parentId)) {
    			driver.switchTo().window(s);
    			break;
    	}
    	
    }
    	driver.manage().window().maximize();
	  WebElement fname = driver.findElement(By.cssSelector("input#firstName"));
	  fname.sendKeys("Mohit");
	  WebElement lname = driver.findElement(By.cssSelector("input#lastName"));
	  lname.sendKeys("Sharma");
	  driver.close();
	  driver.switchTo().window(parentId);
	  WebElement test = driver.findElement(By.cssSelector("input#name"));
	  test.sendKeys("automation");
	  
	  
	  //switch to tab
	  
	  
	  
	  WebElement button2 = driver.findElement(By.cssSelector("button#newTabBtn"));
  	  button2.click();
  	  Set<String> allhandles = driver.getWindowHandles();
  	  Iterator it = allhandles.iterator();
  	  String parentid=(String) it.next();
  	  String childid=(String) it.next();
  	driver.switchTo().window(childid);
  	WebElement click1 = driver.findElement(By.cssSelector("button#alertBox"));
  	click1.click(); 
     Alert a =	driver.switchTo().alert();
     a.accept();
     WebElement click2 = driver.findElement(By.cssSelector("button#confirmBox"));
   	click2.click(); 
      Alert b =	driver.switchTo().alert();
      b.accept();
      WebElement click3 = driver.findElement(By.cssSelector("button#promptBox"));
     	click3.click(); 
        Alert c =	driver.switchTo().alert();
        c.sendKeys("Test Automation");
        c.accept();
        driver.close();    
      	driver.switchTo().window(parentId);
      	 WebElement test1 = driver.findElement(By.cssSelector("input#name"));
   	  test1.sendKeys("Selenium automation");

  	 
  	  
	 
	
    }	
}
