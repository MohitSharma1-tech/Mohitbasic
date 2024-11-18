package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		popup p = new popup();
		p.removePopup();
	}

	
	
	public void removePopup() throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
		
		
	WebElement btn1 =  driver.findElement(By.cssSelector("button#promptBox"));
	btn1.click();
	Thread.sleep(3000);
    Alert a = driver.switchTo().alert();   
	//a.accept();
   // a.dismiss();
  //  a.sendKeys("Test Automation");
  //  a.accept();
    //"https://username:password@www.hyrtutorials.com/p/alertsdemo.html"
    
	driver.quit();
	
		
	}
}
