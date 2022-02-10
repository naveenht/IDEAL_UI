package com.ideal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.ideal.driver.DriverManager;

public class IdealIndividualApplicationPage extends BasePage{
	private By individualRequest = By.id("i-request");
	private By fistName = By.id("name");
	private By secondName = By.id("secondName");
	private By lastName = By.id("fathersLastName");
	private By ssnNumber = By.id("socialSecurityNumber");
	private By dobDate = By.xpath("//select[@formcontrolname='day']");
	private By dobMonth = By.xpath("//select[@formcontrolname='month']");
	private By dobYear = By.xpath("//select[@formcontrolname='year']");
	private By townOfBirth = By.xpath("//select[@formcontrolname='birthPlace']");
	private By licenseNumber = By.id("licenseNumber");
	private By merchantRegNumber = By.id("merchantRegistrationNumber");
	private By eMail = By.name("email");
	//private By mobileNumber = By.id("cellPhoneNumber");
	private By searchReason = By.xpath("//select[@formcontrolname='searchReason']");
	private By process = By.id("prc");
	private By confirm = By.id("conf");
	private By modelBtn = By.id("modal-action-button");
	private By resendAuth = By.xpath("(//img[@id='resend'])[1]");
	private By downloadPdf =By.xpath("(//img[@id='download'])[1]");
	private By homePageImg = By.xpath("//img[@routerlink=\"/employeeboard\"]");
	
	
	//private By checkBoxAuthorise = By.id("checkAuthorize");
	private By checkBoxAuthorise = By.xpath("//span[@class ='checkmark']");
	private By acceptAuthorise = By.id("accept");
	
	public void clickIndividualRequest() throws InterruptedException {
		System.out.println("Clicking on the Individual request button");
		DriverManager.getDriver().findElement(individualRequest).click();
		Thread.sleep(5000);
	}
	
	public void enterIndividualRequest() throws InterruptedException {
		System.out.println("Entering the individual request");
		DriverManager.getDriver().findElement(fistName).sendKeys("oscar");
		DriverManager.getDriver().findElement(secondName).sendKeys("A");
		DriverManager.getDriver().findElement(lastName).sendKeys("rivera");
		DriverManager.getDriver().findElement(ssnNumber).sendKeys("598408444");
		
		 Select date = new Select(DriverManager.getDriver().findElement(dobDate));
		 date.selectByIndex(21); 
		 Select month = new Select(DriverManager.getDriver().findElement(dobMonth));
		 month.selectByIndex(9); 
		 Select year = new Select(DriverManager.getDriver().findElement(dobYear));
		 year.selectByVisibleText("1993"); 
		
		Select tob = new Select(DriverManager.getDriver().findElement(townOfBirth));
		tob.selectByVisibleText("San Juan");
		
		System.out.println("selected dropdown");
		DriverManager.getDriver().findElement(licenseNumber).sendKeys("4970687");;
		DriverManager.getDriver().findElement(merchantRegNumber).sendKeys("12642760014");;
		DriverManager.getDriver().findElement(eMail).sendKeys("csrtest@codedog.solutions");
		//DriverManager.getDriver().findElement(mobileNumber).sendKeys("9987654345");;
		
		Select sr = new Select(DriverManager.getDriver().findElement(searchReason));
		sr.selectByIndex(4);
		Thread.sleep(5000);
		
	}
	
	
	
	public void submitIndividualRequest() throws InterruptedException {
		System.out.println("Submitting the individual request");
		DriverManager.getDriver().findElement(process).click();
		Thread.sleep(5000);
		DriverManager.getDriver().findElement(confirm).click();
		Thread.sleep(5000);
		DriverManager.getDriver().findElement(modelBtn).click();
		System.out.println("individual request submitted");
	}
	
	public void verifySubmittedRequest() throws InterruptedException {
		System.out.println("Verifying the individual requested submitted in the Ideal search dashboard");
		Thread.sleep(5000);
		System.out.println(DriverManager.getDriver().findElement(resendAuth).isDisplayed());
		//DriverManager.getDriver().findElement(resendAuth).click();
		Thread.sleep(5000);
		
	//	DriverManager.getDriver().findElement(homePageImg).click();
	//	WebDriver driver = DriverManager.getDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	  //  js.executeScript("window.open()");	    
	    String mainWindowHandle = DriverManager.getDriver().getWindowHandle();    
	    for (String childWindowHandle : DriverManager.getDriver().getWindowHandles()) {
	    	  //If window handle is not main window handle then close it 
	    	  if(!childWindowHandle.equals(mainWindowHandle)){
	    		  DriverManager.getDriver().switchTo().window(childWindowHandle);
	    	  // Close child windows
	    	 // driver.close(); 
	    	  }
	    	}
	    Gmail gPage = new Gmail();
	    String emailContent = DriverManager.getDriver().findElement(By.xpath("//tbody/tr[@class='zA zE']")).getText();
		System.out.println(emailContent);
		Thread.sleep(5000);
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr[@class='zA zE']")).click();
		Thread.sleep(5000);
		DriverManager.getDriver().findElement(By.xpath("//tbody/tr/td/div/span/a")).click();
		//Thread.sleep(5000);
		Thread.sleep(2000);
		//DriverManager.getDriver().findElement(By.xpath("//div[@aria-label='Delete']")).click();
		
		//DriverManager.getDriver().close();
		for (String childWindowHandle1 : DriverManager.getDriver().getWindowHandles()) {
	    	  if(!childWindowHandle1.equals(mainWindowHandle)){
	    		  DriverManager.getDriver().switchTo().window(childWindowHandle1);
	    	  
	    	  }
	    	}
		 
		DriverManager.getDriver().findElement(checkBoxAuthorise).click();
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(acceptAuthorise).click();
		Thread.sleep(2000);
		DriverManager.getDriver().close();
		DriverManager.getDriver().switchTo().window(mainWindowHandle);
		Thread.sleep(2000);
		//DriverManager.getDriver().findElement(homePageImg).click();
		Thread.sleep(2000);
		if(DriverManager.getDriver().findElement(downloadPdf).isDisplayed()) {
			System.out.println("The Indivisual request is authorised and available for download");
			
		}else {
			System.out.println("The Indivisual request is Not authorised");
		}
 
	    
	
	}
}
