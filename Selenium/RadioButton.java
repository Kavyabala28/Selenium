package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		//Locate to 'Chrome' in a Radiobutton
		WebElement chrome = driver.findElement(By.xpath("(//label[text()='Chrome'])[1]"));
		
		//To check whether the radio button is initially selected by default or not
        if(chrome.isSelected()) 
			System.out.println("Yes it is initially selected");
		else 
			System.out.println("No, it is not selected initially");
		
		//if chrome is not clicked, then proceed with click
		chrome.click();
		
		//click on the same radio button again to verify that it becomes ‘unselected’
		WebElement chrome2 = driver.findElement(By.xpath("(//label[text()='Chrome'])[1]"));
		chrome2.click();
		
		//Locate to age group
		WebElement age = driver.findElement(By.xpath("//label[@for='j_idt87:age:1']"));
		
		//Check and select the age group (21-40 Years) if not already selected.
		if(age.isEnabled())
			System.out.println("Yes it is enabled already");
		else 
			age.click();
		
		driver.close();
	}

}
