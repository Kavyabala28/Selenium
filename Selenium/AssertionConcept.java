package Selenium;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertionConcept {
	
	@Test
	public void runGoogle() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Java Tutorial", Keys.ENTER);
		
		String expectedTitle = "Java Tutorial - Google Search";
		String actualTitle =  driver.getTitle();
		
		assertEquals(actualTitle, expectedTitle, "Title is same");
		
	}

}
