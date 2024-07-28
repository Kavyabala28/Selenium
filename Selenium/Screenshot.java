package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		// To avoid notifications in application

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		String url = "https://www.flipkart.com/";

		driver.get(url);

		driver.manage().window().maximize();

		// Taking screenshot of flipkart page
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./Screenshot/FlipkartPage.png");
		FileUtils.copyFile(src, des);

	}

}
