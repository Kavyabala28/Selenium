package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAJAXCall {
	
	/*
	 * AJAX Call - It is a web development technique that allows a website to update
	 * a part of its content without reloading the entire page.
	 */
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='loadContent']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement loadedElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ajaxContent']/h2")));
		
		System.out.println(loadedElement.getText());
		
		driver.quit();
	}

}
