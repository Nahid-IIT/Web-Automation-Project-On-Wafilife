package tests;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.LoginPage;
import utilities.ExtentFactory;

public class LoginTest extends BaseDriver {

	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void openUrl() throws InterruptedException {
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
		Thread.sleep(2000);
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>Login</b></p>").assignAuthor("QA TEAM").assignDevice("Windows");
	}
	
	@Test
	public void loginTest() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Login Test </b></p>");
		LoginPage loginPage = new LoginPage(childTest);
		loginPage.loginTest();
	
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}
	
}
