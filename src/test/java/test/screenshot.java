package test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	
	
	public static void main(String[] args) throws IOException {
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File test = ts.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(test, new File(System.getProperty("user.dir")+"/screenshot"+"/test"+".png"));
		
		
	}
}
	



