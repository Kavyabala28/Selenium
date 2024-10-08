package Selenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) {

		// Create object for ExtentHtmlReporter and pass the report location in
		// constructor
		ExtentHtmlReporter report = new ExtentHtmlReporter("./reports/result.html");

		report.setAppendExisting(true);

		// Create object for ExtentReports
		ExtentReports extent = new ExtentReports();

		// Attach report path into the report
		extent.attachReporter(report);

		ExtentTest test = extent.createTest("Login TC", "Login Application");
		test.assignAuthor("Barath");
		test.assignCategory("Regression Testing");
		test.pass("Username entered successfully");
		test.pass("Password entered successfully");
		test.pass("Login successfully");

		// Close the report
		extent.flush();

	}

}
