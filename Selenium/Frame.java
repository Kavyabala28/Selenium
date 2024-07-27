package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/frame.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Switching to frame using index 
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		
		// close browser
		driver.close();

	}

}
