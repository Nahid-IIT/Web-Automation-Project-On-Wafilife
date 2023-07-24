package pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import junit.framework.Assert;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class WriterPage extends CommonMethods {
	
	
	ExtentTest test;
	public WriterPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(),this);
		this.test = test;
	}
	
	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]/span[1]") WebElement writerOption;
	@FindBy(xpath = "//h3[contains(text(),'M. Shamim Kaiser')]") WebElement writerName;
	@FindBy(xpath = "//body/div[2]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[1]/div[1]/div[1]/a[1]") WebElement bookDetails;
	
	@FindBy (xpath = "//body/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/button[2]")WebElement orderButton;
	
	@FindBys({ 
	 
	  @FindBy ( xpath  = "//span[contains(text(),'অর্ডার সম্পন্ন করুন')]" ),
	  @FindBy(	xpath = "//a[@title='checkout']" ),
	  @FindBy(	xpath = "//div/a[@title='checkout']" )
	 
	}) WebElement orderCompleteButton;

	
	public void writerTest() throws IOException {
		
		//Writer Option
			try {
				
				if(writerOption.isDisplayed()) {
					writerOption.click();
					sleep(2000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Writer Option  is displayed successfully.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "writerOptionPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "writerOptionPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
				}	
			}catch(Exception e) {
				
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b> Writer Option is not locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "writerOptionLocator");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "writerOptionLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//				Assert.assertTrue(title.isDisplayed());
//				PageDriver.getCurrentDriver().quit();
			}
		
		//Writer Name
			try {
				
				if(writerName.isDisplayed()) {
					//For Scroll
//					JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();	 
//					js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//			        Thread.sleep(3000);
					writerName.click();
					sleep(3000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Selected Writer is displayed successfully.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "writerNamePass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "writerNamePass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
					
				}		
			}catch(Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b> Writer Name is not locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "writerNameLocator");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "writerNameLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		
		//Book Details
			try {
					
				if(bookDetails.isDisplayed()) {
					bookDetails.click();
					sleep(2000);
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Book Details  is displayed successfully.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "bookDetailsPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "bookDetailsPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					
						
					}		
			}catch(Exception e) {
							
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>bookDetails is not locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "bookDetailsLocator");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "bookDetailsLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
			//Order Button
			try {
					
				if(orderButton.isDisplayed()) {
					orderButton.click();
					sleep(4000);
					//orderCompleteButton.click();
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Order Button  is displayed successfully.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "orderButtonPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "orderButtonPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					orderCompleteButton.click();
					//Alert alert  = PageDriver.getCurrentDriver().switchTo().alert();
					sleep(2000);

						
					}		
			}catch(Exception e) {
							
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b> orderButton is not locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "orderButtonLocator");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "orderButtonLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
			
//			//Order Complete Button
//			try {
//				
//					orderButton.click();	
//					Alert alert  = PageDriver.getCurrentDriver().switchTo().alert();
//					alert.accept();
//					sleep(2000);
//					
//							
//			}catch(Exception e) {
//							
//					System.out.println(e);
//			}
			
		
	}
	
}
	
