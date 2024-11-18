package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class incognito {
	public static void main(String[] args) {
		incognito in = new incognito();
		in.openIncognito();
	}




public void openIncognito() {
	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--incognito");
	
	WebDriver driver = new ChromeDriver(option);
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
}