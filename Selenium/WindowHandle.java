package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.irctc.co.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(2000) ;
		
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windowHandle = driver.getWindowHandles();
	
		List<String> listWindow = new ArrayList<String>(windowHandle);
	
		driver.switchTo().window(listWindow.get(1));
		
		System.out.println("Current page title : "+driver.getTitle());
		
		driver.switchTo().window(listWindow.get(0));
		
		driver.close();


	}

}
