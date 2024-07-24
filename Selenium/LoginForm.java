package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginForm {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		// Launching the browser
		driver.get("http://leaftaps.com/opentaps/");

		driver.manage().window().maximize();

		// Locate to username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager"); 
		
		// Locate to password
		WebElement password = driver.findElement(By.xpath("//input[@id='username']/following::input"));
		password.sendKeys("crmsfa");

		// Click login button
		WebElement login = driver.findElement(By.xpath("//form[@id='login']//p[3]"));
		login.click();
		
		// Close browser
		driver.close();
	}

}
