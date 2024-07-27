package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlert {

	public static void main(String[] args) {
		
		// Sweet Alert - it can be handle like a normal webpage. 

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/alert.xhtml");

		driver.manage().window().maximize();
		
		// clicking button
		WebElement alertBtn = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-help']"));
		alertBtn.click();
		
		// printing the text
		String text = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[2]")).getText();
        System.out.println("Text from alert : "+text);
        
        // Cancelling the alert
        WebElement cancelBtn = driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[2]"));
        cancelBtn.click();
        
        driver.close();
	}

}
