package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import junit.framework.Assert;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class LoginPage extends CommonMethods {
	
	ExtentTest test;
	
	public LoginPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test= test;
	}
	
	
	@FindBy(xpath = "//input[@id='username']")WebElement email;
	@FindBy(xpath = "//input[@id='password']")WebElement password;
	@FindBy(xpath = "//input[@name ='login']")WebElement loginButton;
	@FindBy(xpath = "//head//title")WebElement title;

	
	

	public void loginTest() throws InterruptedException, IOException {
		sleep();
		//Email
		try{
			if(email.isDisplayed()) {
				email.sendKeys("nahid.rabby2001@gmail.com");
				sleep(2000);
			}
			
		}catch(Exception e) {
			System.out.print(e);
		}
		
		//Password
		try{
			if(password.isDisplayed()) {
				password.sendKeys("N@hid123");
				sleep(2000);
			}
			
		}catch(Exception e) {
			System.out.print(e);
		}
		
		//Login Button 
		try{
			if(loginButton.isDisplayed()) {
				loginButton.click();
				sleep(2000);
				test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Home Page  is displayed successfully.</b></p>");
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "loginPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "loginPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		}catch(Exception e) {
			test.fail("<p style=\"color:#FF5353; font-size:13px\"><b> loginButton is not locateable.Please check the error message.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "loginButtonLocator");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "loginButtonLocator.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(title.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}

}
