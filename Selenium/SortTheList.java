package Selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortTheList {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		// Sorted List
		//Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='animals']")));
		
		// Un sorted List
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@id='colors']")));	
		ArrayList originalList = new ArrayList();
		ArrayList tempList = new ArrayList();
		
		List<WebElement> options = dropDown.getOptions();
		
		for(WebElement option : options) {
			originalList.add(option.getText());
			tempList.add(option.getText());
		}
		
		System.out.println("Before Sorting........");
		System.out.println("Original List :  " +originalList);
		System.out.println("Temporary List :  " +tempList);
		
		Collections.sort(tempList);
		
		System.out.println("After Sorting........");
		System.out.println("Original List :  " +originalList);
		System.out.println("Temporary List :  " +tempList);
		
		if(originalList.equals(tempList)) {
			System.out.println("List box is sorted");
		}else {
			System.out.println("List box is not sorted");
		}
		
		driver.quit();
	}

}
