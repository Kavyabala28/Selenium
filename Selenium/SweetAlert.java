package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlert {

	public static void main(String[] args) throws InterruptedException {

		/* Sweet Alert - Either we can accept or dismiss the alert */
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/alert.xhtml");

		driver.manage().window().maximize();

		WebElement alertButton = driver.findElement(
				By.xpath("(//button[contains(@class,'ui-button ui-widget ui-state-default ui-corner')])[2]"));
		alertButton.click();
		
		Alert alert = driver.switchTo().alert();

		// dismiss the alert
		alert.dismiss();
		
		// Printing text after user clicked the alert
		WebElement text = driver.findElement(By.xpath("//span[@id='result']"));
		String responseTxt = text.getText();
        System.out.println(responseTxt);
        
        // close browser
		driver.close();

	}

}
