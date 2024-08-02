package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/table.xhtml");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[3]/td[3]")).getText();
		System.out.println(text);

		// Getting the size
		int size = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr")).size();
		System.out.println(size);

		// Printing column 3 from all rows 
		for (int i = 1; i <= size; i++) {
			String text2 = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr[" + i + "]/td[3]"))
					.getText();
			System.out.println("For Column " + i + " is " + text2);
		}
		
		driver.close();

	}

}
