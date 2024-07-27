package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame{

	public static void main(String[] args) {

		/* Frames - A DOM inside the another DOM */

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/frame.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Switching to frame 1
		driver.switchTo().frame(2);

		// Switching to another frame which is inside the frame1
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("(//button[@id='Click'])[1]")).click();

		// getting the text from frame 2
		String text1 = driver.findElement(By.xpath("(//button[@id='Click'])[1]")).getText();

		System.out.println(text1);

		// switching back from frame1 and frame2
		driver.switchTo().defaultContent();

		String text = driver.findElement(By.xpath("(//div[@class='card'])[2]/h5")).getText();
		System.out.println("The text is : " + text);

		driver.close();

	}

}
