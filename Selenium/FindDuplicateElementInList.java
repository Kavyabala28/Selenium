package Selenium;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindDuplicateElementInList {

	public static void main(String[] args) {

      ChromeDriver driver = new ChromeDriver();
      
      driver.get("https://testautomationpractice.blogspot.com/");
      
      driver.manage().window().maximize();
      
      WebElement listColors = driver.findElement(By.xpath("//select[@id='colors']"));
      
      Select selectColor = new Select(listColors);
     
      Set<String> setColor = new HashSet<String>();
      
      boolean flag = false;
      
      for(WebElement color : selectColor.getOptions()) {
    	  
    	  String eachColorText = color.getText();
    	  
    	  if(!setColor.add(eachColorText)) {
    		  System.out.println("Duplicate color found.. " +eachColorText);
    		  flag = true;
    	  }
      }
      
      if(!flag) {
    	  System.out.println("No Duplicate color found");
      }

      driver.close();
      
	}

}
