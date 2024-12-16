package Selenium;

import java.time.Duration;
import java.util.List;

import javax.swing.text.AbstractDocument.Content;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMandatoryField {
	
   /* Examples of pseudo-elements:
   
	::first-line
	::selection
	::before
	::after
	::has */

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/en-gb?route=account/register");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		List<WebElement> fields = driver.findElements(By.xpath("//form[@id='form-register']//label"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (WebElement field : fields) {

			String script = "return window.getComputedStyle(arguments[0],'::Before').getPropertyValue('content')";

			String content = js.executeScript(script, field).toString();

			if (fields.contains("*")) {
				System.out.println(field.getText() + " is a Mandatory Field");
			} else {
				System.out.println(field.getText() + "is Not a Mandatory Field");
			}
		}
		
		driver.close();

	}

}
