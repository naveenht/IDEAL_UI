package com.ideal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ideal.driver.DriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public final class Gmail extends BasePage {
	private By signIn = By.xpath("//a[contains(text(),'Sign in')]");
	private By userName = By.id("identifierId");
	private By userNameNext = By.id("identifierNext");
	private By password = By.name("password");
	private By passwordNext = By.id("passwordNext");
	private By gmailLink = By.xpath("//a[contains(text(),'Gmail')]");
	private By mailCheckbox = By.xpath("//span[@role='checkbox']");
	private By mailDelete = By.xpath("//div[@aria-label='Delete']");
	
	private By inboxLink = By.xpath("//a[contains(text(),'Gmail')]");
	private By firstMailLink = By.xpath("//a[contains(text(),'Gmail')]");
	private By code = By.xpath("//a[contains(text(),'Gmail')]");
	
	//@FindBy(xpath="//span[contains(text(),'Mail')]")
	//WebElement mailBox;
	private By mailBox = By.xpath("//span[contains(text(),'Mail')]");

	public void enterUsername(String username) {
		DriverManager.getDriver().findElement(userName).sendKeys(username);
	}

	public void enterPassword(String passWord) {
		DriverManager.getDriver().findElement(password).sendKeys(passWord);
	}

	public void clickUsernameNext() {
		//DriverManager.getDriver().findElement(userNameNext).click();
		new WebDriverWait(DriverManager.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(userNameNext)).click();
	}

	public void clickPasswordNext() {
		//DriverManager.getDriver().findElement(passwordNext).click();
		new WebDriverWait(DriverManager.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(passwordNext)).click();
		new WebDriverWait(DriverManager.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(gmailLink)).click();
		new WebDriverWait(DriverManager.getDriver(), 20).until(ExpectedConditions.visibilityOfElementLocated(mailBox));
		//explicitlyWait(mailBox);
	}
	
	public void deleteMail() {
		new WebDriverWait(DriverManager.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(mailCheckbox)).click();
		new WebDriverWait(DriverManager.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(mailDelete)).click();
	}
	
	public void clickSignIn() {
		//DriverManager.getDriver().findElement(signIn).click();	
		new WebDriverWait(DriverManager.getDriver(), 20).until(ExpectedConditions.elementToBeClickable(signIn)).click();
	}
	


	
}
