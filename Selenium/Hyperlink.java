package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {

	public static void main(String[] args) {

         ChromeDriver driver = new ChromeDriver();
         driver.get("https://www.leafground.com/link.xhtml");
         
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         
         // clicking How many links in this page? 
         WebElement linkText = driver.findElement(By.linkText("How many links in this page?"));
         linkText.click();
         
         // Printing the title
         String titleOfPage = driver.getTitle();
         System.out.println("The Title of the current page :" +titleOfPage);
         
         // Clicking edit button
         WebElement editBtn = driver.findElement(By.xpath("//button[contains(@class,'ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only e')]"));
         editBtn.click();
         
         // Increase the Quantity
         WebElement quantity = driver.findElement(By.xpath("//a[contains(@class,'ui-spinner-button ui-spinner-up')]"));
         quantity.click();
         
         driver.close();
	}
	

}
