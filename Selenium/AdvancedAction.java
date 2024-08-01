package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvancedAction {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		// driver.get("https://www.google.com/");
		driver.get("https://jqueryui.com/selectable/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// driver.findElement(By.className("gLFyf")).sendKeys("Roses", Keys.ENTER);

		Actions actions = new Actions(driver);

		driver.switchTo().frame(0);

		WebElement list1 = driver.findElement(By.xpath("//li[contains(@class,'ui-widget-content')]"));
		WebElement list3 = driver.findElement(By.xpath("(//li[contains(@class,'ui-widget-content')])[3]"));
		WebElement list5 = driver.findElement(By.xpath("(//li[contains(@class,'ui-widget-content')])[5]"));

		actions.clickAndHold(list1).pause(1000).clickAndHold(list3).pause(1000).clickAndHold(list5).release().perform();

		actions.keyDown(Keys.CONTROL).click(list1).pause(1000).click(list3).keyUp(Keys.CONTROL).perform();

	}

}
