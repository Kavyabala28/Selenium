package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Click on the "Basic Checkbox.”
		driver.findElement(By.xpath("//span[text()='Basic']")).click();

		// Click on the "Notification Checkbox."
		WebElement notificationWe = driver.findElement(By.xpath("//span[text()='Ajax']"));
		notificationWe.click();

		// Locate to "Checked" notification
		WebElement checkedMessage = driver.findElement(By.xpath("//div[contains(@class,'ui-growl ui-widget')]"));
		
		// To check whether expected message is same as actual message after clicking
		// 'Notification' checkbox
		String expectedMessage = "Checked";
		String actualMessage = checkedMessage.getText();

		if (actualMessage.contains(expectedMessage)) {
			System.out.println("Yes, it contains the same expected message");
		} else {
			System.out.println("No, getting different message");
		}

		// Click on your favorite language - Java and Javascript
		WebElement languageJava = driver.findElement(By.xpath("//label[text()='Java']"));
		languageJava.click();

		WebElement languageJavaScript = driver.findElement(By.xpath("//label[text()='Javascript']"));
		languageJavaScript.click();

		// Verify which tri-state option has been chosen.
		WebElement triStateCheckbox = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget ui-corner-all ui-state-default')])[8]"));
		
		// To check 'State - 1'
		triStateCheckbox.click();
		
		Thread.sleep(1000);
		
		  if(triStateCheckbox.isSelected()) {
			  WebElement triStateOption = driver.findElement(By.xpath("//div[contains(@class,'ui-growl ui-widget')][2]"));
			  String triStatemessage = triStateOption.getText();
			  System.out.println(triStatemessage);
		  }else if(triStateCheckbox.isSelected()) {
			  WebElement triStateOption = driver.findElement(By.xpath("//div[contains(@class,'ui-growl ui-widget')][2]"));
			  String triStatemessage = triStateOption.getText();
			  System.out.println(triStatemessage);
		  }else {
			  WebElement triStateOption = driver.findElement(By.xpath("//div[contains(@class,'ui-growl ui-widget')][2]"));
			  String triStatemessage = triStateOption.getText();
			  System.out.println(triStatemessage);
		  }
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		// Click on the "Toggle Switch.
		WebElement toggle = driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch ui-widget')]"));
		toggle.click();

		// Locate to "Toggle" notification
		WebElement toggleMessage = driver.findElement(By.xpath("(//div[contains(@class,'ui-growl ui-widget')])[1]"));

		String toggleExpectedMessage = "Checked";
		String toggleActualMessage = toggleMessage.getText();

		if (toggleActualMessage.contains(toggleExpectedMessage))
			System.out.println("Expected Message is displayed");
		else
			System.out.println("Expected Message is not displayed");

		// To verify the "Checkbox is disabled"
		WebElement checkbox = driver
				.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox ui-widget')])[3]"));
		System.out.println("Is Checkbox disabled?  " + checkbox.isDisplayed());

		// Select the dropdown "Select Multiple Options" which is having checkbox type values
		WebElement dropdown = driver.findElement(
				By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right')]"));
		dropdown.click();

		// Click "Paris" 
		WebElement dropDownParis = driver.findElement(By.xpath("(//label[text()='Paris'])[2]"));
		dropDownParis.click();

		// Click "Berlin"
		WebElement dropDownBerlin = driver.findElement(By.xpath("(//label[text()='Berlin'])[2]"));
		dropDownBerlin.click();

		//Click "London"
		WebElement dropDownLondon = driver.findElement(By.xpath("(//label[text()='London'])[2]"));
		dropDownLondon.click();

		// Again clicking dropdown to hide dropdown list
		dropdown.click();

		// Checking for a title
		String title = driver.getTitle();
		String expectedTitle = "CheckBox Components";
		if (title.contains(expectedTitle))
			System.out.println("Title is same");
		else
			System.out.println("Different Title");

		// Closing browser
		driver.close();
	}

}
