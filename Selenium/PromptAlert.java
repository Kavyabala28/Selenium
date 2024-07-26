package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	
	// Prompt Alert - Either we can accept or dismiss the alert and send the text into the alert

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/alert.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();

		Alert alert = driver.switchTo().alert();

		// Passing values to alert
		alert.sendKeys("Kavya");

		alert.dismiss();

		WebElement text = driver.findElement(By.xpath("//span[@id='confirm_result']"));

		String text1 = text.getText();

		System.out.println("The text from prompt : " + text1);

		// Checking whether the message is same or not
		String ExpectedMsg = "User cancelled the prompt.";
		String ActualMsg = text1;
		if (ActualMsg.contains(ExpectedMsg))
			System.out.println("Yes same message");
		else
			System.out.println("No getting different message");

		driver.close();

	}

}
