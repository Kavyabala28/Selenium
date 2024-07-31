package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownUsingSelect {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Locate and Enter username
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("demosalesmanager");

		// Locate and Enter Password
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");

		// Click login
		WebElement loginBtn = driver.findElement(By.className("decorativeSubmit"));
		loginBtn.click();

		// click crmsfa link
		WebElement crmsfaBtn = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaBtn.click();

		// click 'create lead' tab
		WebElement createLeadTab = driver.findElement(By.linkText("Create Lead"));
		createLeadTab.click();
		
		// Enter companyName
		WebElement cname = driver.findElement(By.id("createLeadForm_companyName"));
		cname.sendKeys("Amazon");
		
		// Enter Firstname
		WebElement fname = driver.findElement(By.id("createLeadForm_firstName"));
		fname.sendKeys("John");
		
		// Enter Lastname
		WebElement lname = driver.findElement(By.id("createLeadForm_lastName"));
		lname.click();
		
		/*---------- Dropdown using select method -----------*/
		
		WebElement sourceWE = driver.findElement(By.name("dataSourceId"));
		sourceWE.click();
		
		// Dropdown using 'selectByValue' method
		Select selectSource = new Select(sourceWE);
		selectSource.selectByValue("LEAD_CONFERENCE");
		
		WebElement marketingCompaignWE = driver.findElement(By.name("marketingCampaignId"));
		marketingCompaignWE.click();
		
		// Dropdown using 'selectByIndex' method
		Select selectMC = new Select(marketingCompaignWE);
		selectMC.selectByIndex(1);
		
		WebElement industryWE = driver.findElement(By.name("industryEnumId"));
		industryWE.click();
		
		Select selectInd = new Select(industryWE);
		selectInd.selectByVisibleText("Health Care");
		
		// CLick create lead button
		WebElement createLeadBtn = driver.findElement(By.name("submitButton"));
		createLeadBtn.click();
		
		driver.close();

	}

}
