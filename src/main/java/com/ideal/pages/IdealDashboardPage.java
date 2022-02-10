package com.ideal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.ideal.driver.DriverManager;

public class IdealDashboardPage extends BasePage{
	//private By individualApp1 = By.xpath("(//a/button)[1]");
	private By individualRequest = By.id("i-request");
	private By companyRequest = By.id("c-request");
	private By empName = By.id("empname");
	private By searchBox = By.id("Search");
	private By searchButton = By.id("close");
	private By userSettings = By.id("cogwheel");
	private By help = By.id("question");
	private By logout = By.id("exit");
	private By idealImage = By.id("home");
	private By idealChartHeading =By.id("30Days");
	private By idealChartRequest = By.xpath("(//*[@class='highcharts-title'])[1]");
	private By idealChartRequestCompleted = By.xpath("(//*[@class='highcharts-title'])[2]");
	private By idealChartUnresolvedRequest = By.xpath("(//*[@class='highcharts-title'])[3]");
	private By searchReqNo =By.id("reqno");
	private By searchReqName =By.className("Requestname");
	private By searchReqDate =By.className("dateTime");
	private By searchReqMail =By.className("email");
	private By searchPhoneNo =By.className("phonenumber");
	private By searchReason =By.className("reason");
	private By searchExp =By.className("exp");
	private By searchStatus =By.className("status");
	
	// DashBoard Grid Locators
	private By GridHeaderRequest =By.id("req");
	private By GridHeaderApplicant =By.id("applicant");
	private By GridHeaderDateHour =By.id("datehr");
	private By GridHeaderEmail =By.id("email");
	private By GridHeaderPhone =By.id("contact");
	private By GridHeaderReason =By.id("validity");
	private By GridHeaderExp =By.id("stat");
	private By GridHeaderStatus =By.id("req");
	
	
		
	public void verifyHeaderNavbarAttributes() throws InterruptedException {
		Thread.sleep(5000);
		//DriverManager.getDriver().findElement(individualApp1).isDisplayed();
		System.out.println("Verifying the header nav");
		boolean search = DriverManager.getDriver().findElement(searchBox).isDisplayed();
		if(search) {
			System.out.println("Search box is displayed ");
			Reporter.log("Search box is displayed ");
		}else {
			System.out.println("Search box is not displayed ");
			Reporter.log("Search box is not displayed ");
		}
		
		Thread.sleep(5000);
		//DriverManager.getDriver().findElement(searchBox).sendKeys("Naveen");
		boolean individualAppButton = DriverManager.getDriver().findElement(individualRequest).isDisplayed();
		if (individualAppButton) {
			System.out.println("Individual Application button is displayed in the header Navigation");
			Reporter.log("Individual Application button is displayed in the header Navigation ");
		}else {
			System.out.println("Individual Application button is not displayed in the header Navigation");
			Reporter.log("Individual Application button is not displayed in the header Navigation ");
		}
		if (DriverManager.getDriver().findElement(companyRequest).isDisplayed()) {
			System.out.println("Company Request button is displayed in the header Navigation");
			Reporter.log("Company Request button is displayed in the header Navigation ");
		}else {
			System.out.println("Company Request button is not displayed in the header Navigation");
			Reporter.log("Company Request button is not displayed in the header Navigation");
		}
		
		if (DriverManager.getDriver().findElement(searchBox).isDisplayed()) {
			System.out.println("Search Box  is displayed in the header Navigation");
			Reporter.log("Search Box  is displayed in the header Navigation");
		}else {
			System.out.println("Search box  is not displayed in the header Navigation");
			Reporter.log("Search box  is not displayed in the header Navigation");
		}
		
		if (DriverManager.getDriver().findElement(searchButton).isDisplayed()) {
			System.out.println("Search button is displayed in the header Navigation");
			Reporter.log("Search button is displayed in the header Navigation");
		}else {
			
			System.out.println("Search  button is not displayed in the header Navigation");
			Reporter.log("Search  button is not displayed in the header Navigation");
		}
		
		if (DriverManager.getDriver().findElement(userSettings).isDisplayed()) {
			System.out.println("User setting button is displayed in the header Navigation");
			Reporter.log("User setting button is displayed in the header Navigation");
		}else {
			System.out.println("User setting button is not displayed in the header Navigation");
			Reporter.log("User setting button is not displayed in the header Navigation");
		}
		
		if (DriverManager.getDriver().findElement(help).isDisplayed()) {
			System.out.println("Help button is displayed in the header Navigation");
			Reporter.log("Help button is displayed in the header Navigation");
		}else {
			System.out.println("Help button is not displayed in the header Navigation");
			Reporter.log("Help button is not displayed in the header Navigation");
		}
		
		if (DriverManager.getDriver().findElement(logout).isDisplayed()) {
			System.out.println("Logout button is displayed in the header Navigation");
			Reporter.log("Logout button is displayed in the header Navigation");
		}else {
			System.out.println("Logout button is not displayed in the header Navigation");
			Reporter.log("Logout button is not displayed in the header Navigation");
		}
		
		if (DriverManager.getDriver().findElement(logout).isDisplayed()) {
			System.out.println("Ideal Logo image in Dashboard is displayed in the header Navigation");
			Reporter.log("Ideal Logo image in Dashboard is displayed in the header Navigation");
			
		}else {
			System.out.println("Ideal Logo image in Dashboard  is not displayed in the header Navigation");
			Reporter.log("Ideal Logo image in Dashboard  is not displayed in the header Navigation");
		}
		
	}
	
	
	
	//Verify Indivisdual request button
	public void verifyindividualRequest() throws InterruptedException {
		Thread.sleep(5000);
		
		boolean individualAppButton = DriverManager.getDriver().findElement(individualRequest).isDisplayed();
		if(individualAppButton) {
			System.out.println("individual Request Button is displayed ");
			Reporter.log("individual Request Button is displayed ");
		}else {
			System.out.println("individual Request Button is not displayed ");
			Reporter.log("individual Request Button is not displayed ");
		}
	}
	
	
	//Verify company request button
		public void verifycompRequest() throws InterruptedException {
			Thread.sleep(5000);
			
			boolean companyRequestButton = DriverManager.getDriver().findElement(companyRequest).isDisplayed();
			if(companyRequestButton) {
				System.out.println("companyRequest Button is displayed ");
				Reporter.log("companyRequest Button is displayed ");
			}else {
				System.out.println("companyRequest Button is not displayed ");
				Reporter.log("companyRequest Button is not displayed ");
			}
		}
	
	
	// Verify Grid Headers
	public void verifygridHeaderTitleRequest() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Verifying the Grid headers");
		boolean req = DriverManager.getDriver().findElement(GridHeaderRequest).isDisplayed();
		if(req) {
			System.out.println("HeaderRequest is displayed ");
			Reporter.log("HeaderRequest is displayed ");
		}else {
			System.out.println("HeaderRequest is not displayed ");
			Reporter.log("HeaderRequest is not displayed ");
		}
	}
	
	public void verifygridHeaderTitleApplicant() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Verifying the Grid headers");
		boolean req = DriverManager.getDriver().findElement(GridHeaderApplicant).isDisplayed();
		if(req) {
			System.out.println("HeaderApplicant is displayed ");
			Reporter.log("HeaderApplicant is displayed ");
		}else {
			System.out.println("HeaderApplicant is not displayed ");
			Reporter.log("HeaderApplicant is not displayed ");
		}
	}
	
	public void verifygridHeaderTitleDateHour() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Verifying the Grid headers");
		boolean req = DriverManager.getDriver().findElement(GridHeaderDateHour).isDisplayed();
		if(req) {
			System.out.println("HeaderDateHou is displayed ");
			Reporter.log("HeaderDateHou is displayed ");
		}else {
			System.out.println("HeaderDateHou is not displayed ");
			Reporter.log("HeaderDateHou is not displayed ");
		}
	}
	
	
	public void verifygridHeaderTitleEmail() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Verifying the Grid headers");
		boolean req = DriverManager.getDriver().findElement(GridHeaderEmail).isDisplayed();
		if(req) {
			System.out.println("HeaderEmail is displayed ");
			Reporter.log("HeaderEmail is displayed ");
		}else {
			System.out.println("HeaderEmail is not displayed ");
			Reporter.log("HeaderEmail is not displayed ");
		}
	}
	
	public void verifygridHeaderTitlePhone() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Verifying the Grid headers");
		boolean req = DriverManager.getDriver().findElement(GridHeaderPhone).isDisplayed();
		if(req) {
			System.out.println("HeaderPhone is displayed ");
			Reporter.log("HeaderPhone is displayed ");
		}else {
			System.out.println("HeaderPhone is not displayed ");
			Reporter.log("HeaderPhone is not displayed ");
		}
	}
	
	public void verifygridHeaderTitleReason() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Verifying the Grid headers");
		boolean req = DriverManager.getDriver().findElement(GridHeaderReason).isDisplayed();
		if(req) {
			System.out.println("HeaderReason is displayed ");
			Reporter.log("HeaderReason is displayed ");
		}else {
			System.out.println("HeaderReason is not displayed ");
			Reporter.log("HeaderReason is not displayed ");
		}
	}
	
	
	public void verifyIdealgridHeaderTitleExp() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Verifying the Grid headers");
		boolean req = DriverManager.getDriver().findElement(GridHeaderExp).isDisplayed();
		if(req) {
			System.out.println("HeaderExp is displayed ");
			Reporter.log("HeaderExp is displayed ");
		}else {
			System.out.println("HeaderExp is not displayed ");
			Reporter.log("HeaderExp is not displayed ");
		}
	}
	
	public void verifyIdealgridHeaderTitleStatus() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Verifying the Grid headers");
		boolean req = DriverManager.getDriver().findElement(GridHeaderStatus).isDisplayed();
		if(req) {
			System.out.println("HeaderStatus is displayed ");
			Reporter.log("HeaderStatus is displayed ");
		}else {
			System.out.println("HeaderStatus is not displayed ");
			Reporter.log("HeaderStatus is not displayed ");
		}
	}
	
	public void verifyIdealDashboardSearch() throws InterruptedException {
		System.out.println("Verifying the Search");
		boolean searchField = DriverManager.getDriver().findElement(GridHeaderStatus).isDisplayed();
		if(searchField) {
			System.out.println("Search Field  is displayed ");
			Reporter.log("Search Field is displayed ");
			
			DriverManager.getDriver().findElement(searchBox).sendKeys("naveen");
			DriverManager.getDriver().findElement(searchButton).click();
			Thread.sleep(5000);
			DriverManager.getDriver().findElement(searchReqNo).isDisplayed();
			System.out.println(DriverManager.getDriver().findElement(searchReqNo).getText());
			DriverManager.getDriver().findElement(searchReqName).isDisplayed();
			String name = DriverManager.getDriver().findElement(searchReqName).getText();
			if(name.toLowerCase().contains("naveen")) {
				System.out.println("Name is matching with search keyword and displayed as : "+name);
				Reporter.log("Name is matching with search keyword and displayed as : "+name);
			} else {
				System.out.println("Name is not matching with search keyword and displayed as : "+name);
				Reporter.log("Name is not matching with search keyword ad displayed as : "+name);
			}
			DriverManager.getDriver().findElement(searchReqDate).isDisplayed();
			
			DriverManager.getDriver().findElement(searchReqMail).isDisplayed();
			
			DriverManager.getDriver().findElement(searchPhoneNo).isDisplayed();
			
			DriverManager.getDriver().findElement(searchReason).isDisplayed();
			
			DriverManager.getDriver().findElement(searchExp).isDisplayed();
			
			DriverManager.getDriver().findElement(searchStatus).isDisplayed();
			
		}else {
			System.out.println("Search Field is not displayed ");
			Reporter.log("Search Field is not displayed ");
		}

	}
	
	public void clickOnIndividualRequest() {
		//explicitlyWait(IndividualRequest);
		DriverManager.getDriver().findElement(individualRequest).click();
	}
	
	
	public void clickOnCompanyRequest() {
		//explicitlyWait(IndividualRequest);
		DriverManager.getDriver().findElement(companyRequest).click();
	}
	
	
}
