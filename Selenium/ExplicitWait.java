package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/waits.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//span[text()='Click']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));

		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();

		Boolean condition = wait.until(
				ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		System.out.println("Element still exists ? " + condition);

	}

}
