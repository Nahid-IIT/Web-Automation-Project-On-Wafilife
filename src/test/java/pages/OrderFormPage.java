package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class OrderFormPage extends CommonMethods {

	ExtentTest test;
	public OrderFormPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindBy(xpath = " //input[@id='billing_first_name']")WebElement name ;
	@FindBy(xpath = "//input[@id='billing_phone'] ")WebElement phone ;
	@FindBy(xpath = "//input[@id='billing_alternative_phone']")WebElement  emargencyPhone;
	@FindBy(xpath = "//input[@id='billing_email'] ")WebElement email ;
	@FindBy(xpath = "//li[@id='select2-billing_state-result-y59k-BD-13'] ")WebElement jela ;
	@FindBy(xpath = "//option[@value='605'] ")WebElement upjela ;
	@FindBy(xpath = "//textarea[@id='billing_address_1']")WebElement address ;
	@FindBy(xpath = "//textarea[@id='order_comments']")WebElement othersInfo ;
	@FindBy(xpath = "//input[@id='shipping_method_0_flat_rate8']")WebElement  shippingCharge;
	@FindBy(xpath = "//input[@id='payment_method_nagad']")WebElement  paymentMethod;
	
	
	public void orderForm() throws IOException {
		
		//Name
			try {
				if(name.isDisplayed()) {
					name.clear();
					name.sendKeys("Nahidul");
					sleep();
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
		//phone
			try {
				if(phone.isDisplayed()) {
					phone.clear();
					phone.sendKeys(" 01909876543");
					sleep();
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			//emargencyPhone
			try {
				if(emargencyPhone.isDisplayed()) {
				
					emargencyPhone.sendKeys("01740958432");
					sleep();
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			//email
			try {
				if(email.isDisplayed()) {
					email.clear();
					email.sendKeys("nahid@gmail.com ");
					sleep();
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			//jela
			try {
				if(jela.isDisplayed()) {
					jela.click();
					sleep();
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			//upjela
			try {
				if(upjela.isDisplayed()) {
					upjela.click();
					sleep();
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			//address
			try {
				if(address.isDisplayed()) {
					address.clear();
					address.sendKeys("Bhasani Hall,Jahangirnagar University,Savar" );
					sleep();
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			//othersInfo
			try {
				if(othersInfo.isDisplayed()) {
					othersInfo.sendKeys("10 minitue from Varsitie's main gate");
					sleep();
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			//shippingCharge
			try {
				if(shippingCharge.isDisplayed()) {
					shippingCharge.click();
					sleep();
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			//Name
			try {
				if(paymentMethod.isDisplayed()) {
					paymentMethod.click();
					sleep();
					test.pass("<p style=\"color:#85BC63; font-size:13px\"><b>Comlete Order Form is displayed successfully.</b></p>");
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "orderCompletePass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "orderCompletePass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
				
			}catch(Exception e) {
				test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Payment is not  locateable.Please check the error message.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "worderCompleteLocator");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "orderCompleteLocator.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
	}
}	
	

		
