package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/drag.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement dragAndDropBox = driver.findElement(By.id("form:conpnl"));

		/* ------------------------ Using Action ----------------------- */

		Actions action = new Actions(driver);

		// Drag And Drop the box using 'dragAndDropBy' method
		action.dragAndDropBy(dragAndDropBox, 200, 0).dragAndDropBy(dragAndDropBox, 200, 0).perform();

		// Drag the box and drop in using 'dragAndDrop' method
		WebElement source = driver.findElement(By.id("form:drag"));
		WebElement destination = driver.findElement(By.id("form:drop"));
		action.dragAndDrop(source, destination).perform();

		// Scrolling to last using 'scrollToElement' method
		WebElement scroll = driver.findElement(By.xpath("//div[@class='card']/h4[text()='Range Slider']"));
		action.scrollToElement(scroll).perform();

		// Right click using 'contextClick' method
		WebElement rightClick = driver.findElement(By.xpath("//div[@class='card']/h5[text()='Progress Bar']"));
		action.contextClick(rightClick).perform();
		rightClick.click();

		Thread.sleep(2000);

		// Resize the image using 'clickAndHold' & 'moveByOffset' methods
		WebElement img = driver.findElement(By.className("ui-wrapper"));
		action.clickAndHold(img).moveByOffset(100, 50).perform();

		// moving the cursor using 'moveToElement' method
		WebElement move = driver.findElement(By.xpath("//div[@class='card']/h4[text()='Range Slider']"));
		action.moveToElement(move).perform();

		driver.close();

	}

}
