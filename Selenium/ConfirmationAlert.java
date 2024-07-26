package Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	/* Confirmation Alert - we can only accept the alert */
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/alert.xhtml");
        
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        WebElement clickBtn = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
        clickBtn.click();
        
        // Switching to alert
        Alert alert = driver.switchTo().alert();
        
        System.out.println(alert.getText());
        
        alert.accept();
        
        driver.close();

	}

}
