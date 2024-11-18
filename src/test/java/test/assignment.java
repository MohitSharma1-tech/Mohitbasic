package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment {
	
	
	public static void main(String[] args) {
		assignment a = new assignment();
		a.frameAction();
	}

	
	public void frameAction() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.switchTo().frame("frm1");
		
		WebElement drop1 = driver.findElement(By.cssSelector("select#course"));
		Select s = new Select(drop1);
		s.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm2");
		WebElement drop2 = driver.findElement(By.cssSelector("select#selectnav1"));
		Select s1 = new Select(drop2);
		s1.selectByVisibleText("- Basic Controls");
		WebElement fname = driver.findElement(By.cssSelector("input#firstName"));
		fname.sendKeys("Mohit");
		WebElement lname = driver.findElement(By.cssSelector("input#lastName"));
		fname.sendKeys("Sharma");
		WebElement rbutton = driver.findElement(By.cssSelector("input#malerb"));
		rbutton.click();
		WebElement engbutton = driver.findElement(By.cssSelector("input#englishchbx"));
		engbutton.click();
		WebElement hindibutton = driver.findElement(By.cssSelector("input#hindichbx"));
		hindibutton.click();
		WebElement emailname = driver.findElement(By.cssSelector("input#email"));
		emailname.sendKeys("Mohit@gmail.com");
		

		//driver.quit();
	

		
	}
	
}
