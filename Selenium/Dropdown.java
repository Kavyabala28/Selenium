package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		String url = "https://leafground.com/select.xhtml";

		driver.get(url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Locating to 'Favourite Automation Tool' Box
		WebElement UiAutomationTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		UiAutomationTool.click();

		// Selecting 'Selenium'
		WebElement SeleniumWE = driver.findElement(By.xpath("//option[text()='Selenium']"));
		SeleniumWE.click();

		// Locate to 'Preferred Country'
		WebElement preferredCntry = driver
				.findElement(By.xpath("//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all']"));
		preferredCntry.click();

		// Selecting 'India'
		WebElement indiaWE = driver.findElement(By.xpath("(//li[contains(@class,'ui-selectonemenu')])[4]"));
		indiaWE.click();

		// Locating to 'Confirm Cities'
		WebElement confirmCities = driver.findElement(By.xpath("(//div[contains(@class,'ui-selectonemenu ')])[2]"));
		confirmCities.click();

		// Selecting 'Chennai'
		WebElement chennaiWE = driver.findElement(By.xpath("//li[text()='Chennai']"));
		chennaiWE.click();

		driver.close();

	}

}
