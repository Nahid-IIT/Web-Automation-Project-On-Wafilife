package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.LoginPage;
import pages.OrderFormPage;
import pages.WriterPage;
import utilities.ExtentFactory;

public class WriterPageTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void openUrl() throws InterruptedException {
		//String url1 = "https://www.wafilife.com/";
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
		Thread.sleep(2000);
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>DashBoard</b></p>").assignAuthor("QA TEAM").assignDevice("Windows");
	}
	
	@Test
	public void writerPageTest() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Dashboar Options </b></p>");
		WriterPage writerPage = new WriterPage(childTest);
		OrderFormPage orderForm = new OrderFormPage(childTest);
		writerPage.writerTest();
		orderForm.orderForm();
		
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
