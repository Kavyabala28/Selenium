package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWithoutSwitchTo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();

		/*----- Approach 1 using switchTo method -----
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();*/

		// ----- Approach 2 using Explicit wait -----

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		alert.accept();

		driver.close();

	}

}
