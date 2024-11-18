package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frame {
	
	
	public static void main(String[] args) {
		frame f = new frame();
		f.frameUses();
	}

	
	public void frameUses() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.switchTo().frame("frm1");
		
		WebElement drop1 = driver.findElement(By.cssSelector("select#course"));
		Select s = new Select(drop1);
		s.selectByVisibleText("Java");
		//driver.quit();		
		driver.switchTo().defaultContent();
		
	}
}
