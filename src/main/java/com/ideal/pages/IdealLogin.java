package com.ideal.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.ideal.driver.DriverManager;
import com.ideal.utils.ReadPropertyFiles;

public class IdealLogin {
	
	private By EnteridealLoginBtn = By.id("enter_button");
	private By idealUserName = By.id("signInName");
	private By idealPassword = By.id("password");
	private By idealUserContinueBtn = By.id("next");
	private By idealVerificationField = By.id("VerificationCode");
	private By idealVerifyBtn = By.xpath("//button[@class='verifyCode']");
	private By empName = By.xpath("//*[@class='NameOfEmployee']");
	private By idealLogo = By.id("home");
	private By idealLogout = By.xpath("//img[@src='assets/IDEAL_Icons/Ideal_Icon gray logout.png']");
	private By enterIdealBtn = By.xpath("//button[@id='enter_button']");
	
	
	public void enterIdealLogin() {
		DriverManager.getDriver().findElement(EnteridealLoginBtn).click();
	}
	
	public void idealLogin() throws Exception {
		DriverManager.getDriver().findElement(idealUserName).sendKeys(ReadPropertyFiles.getValue("username"));
		DriverManager.getDriver().findElement(idealPassword).sendKeys(ReadPropertyFiles.getValue("password"));
		DriverManager.getDriver().findElement(idealUserContinueBtn).click();
	}
	
	public void idealVerifyLoginCode(String verificationCode) throws Exception {
		DriverManager.getDriver().findElement(idealVerificationField).sendKeys(verificationCode);
		DriverManager.getDriver().findElement(idealVerifyBtn).click();
		Thread.sleep(5000);
		
	}
	
	public void idealVerificationCodeField() {
		DriverManager.getDriver().findElement(idealVerificationField).isDisplayed();
	}
	
	public void idealDashboardLogo() {
		//DriverManager.getDriver().findElement(idealLogo).isDisplayed();
		DriverManager.getDriver().findElement(idealLogo).isDisplayed();
		DriverManager.getDriver().findElement(idealLogout).isDisplayed();
		
	}
	
		
}
