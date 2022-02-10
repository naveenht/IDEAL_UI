package com.ideal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ideal.driver.DriverManager;

public class IdealCompanyApplicationPage extends BasePage{
	private By companyRequest = By.id("c-request");
	
	private By companyName = By.id("name");
	private By ssn = By.id("SSN");
	private By nameRep = By.id("companyTelephone");
	
	private By merchantRegNumber = By.id("licenseNumber");
	private By stateRegNumber = By.id("registration_no");
	
	private By eMail = By.name("email");
	private By searchReason = By.xpath("//select[@formcontrolname='searchReason']");
		
	
	private By class1 = By.id("category");
	private By kind1 = By.id("kind");
	private By jurisdiction1 = By.id("jurisdiction");
	
	
	private By process = By.id("c-pro");
	private By confirm = By.id("c-conf");
	private By modelBtn = By.id("modal-action-button");
	
	private By resendAuth = By.xpath("(//img[@id='resend'])[1]");
	//private By checkBoxAuthorise = By.id("checkAuthorize");
	private By checkBoxAuthorise = By.xpath("//span[@class ='checkmark']");
	private By acceptAuthorise = By.id("accept");
	
	private By downloadPdf =By.xpath("(//img[@id='download'])[1]");
	private By homePageImg = By.xpath("//img[@routerlink=\"/employeeboard\"]");
	
	
	public void clickCompanyRequest() throws InterruptedException {
		System.out.println("Clicking on the Company request button");
		DriverManager.getDriver().findElement(companyRequest).click();
		Thread.sleep(5000);
	}
	
	public void enterCompanyRequest() throws InterruptedException {
		System.out.println("Entering the individual request");
		DriverManager.getDriver().findElement(companyName).sendKeys("ABC CONTAINER CORPORATION");
		DriverManager.getDriver().findElement(ssn).click();
		Thread.sleep(2000);
		
		
		//DriverManager.getDriver().findElement(By.linkText("Application for Company")).click(); 			
		DriverManager.getDriver().findElement(By.xpath("(//input[@name='choferilSelectionRadio'])[2]")).click();
		DriverManager.getDriver().findElement(By.xpath("//button/span[text()='Continue']")).click();
		
		DriverManager.getDriver().findElement(ssn).sendKeys("660962981");	
		DriverManager.getDriver().findElement(nameRep).sendKeys("prits");
		DriverManager.getDriver().findElement(merchantRegNumber).sendKeys("12735678418");
		DriverManager.getDriver().findElement(stateRegNumber).sendKeys("411607");
		
		
		
		 Select class11 = new Select(DriverManager.getDriver().findElement(class1));
		 class11.selectByVisibleText("Banco");
		 
		 Select kind11 = new Select(DriverManager.getDriver().findElement(kind1));
		 //kind11.selectByVisibleText("Con Fines");
		 kind11.selectByIndex(1);
		 
		 Select jur11 = new Select(DriverManager.getDriver().findElement(jurisdiction1));
		 jur11.selectByIndex(2);
		
		
		 DriverManager.getDriver().findElement(eMail).sendKeys("csrtest@codedog.solutions");
		 //DriverManager.getDriver().findElement(mobileNumber).sendKeys("9987654345");;
		
		Select sr = new Select(DriverManager.getDriver().findElement(searchReason));
		sr.selectByIndex(2);
		Thread.sleep(5000);
		
		
	}
	
	
	
	public void submitCompanyRequest() throws InterruptedException {
		System.out.println("Submitting the company request");
		DriverManager.getDriver().findElement(process).click();
		Thread.sleep(5000);
		DriverManager.getDriver().findElement(confirm).click();
		Thread.sleep(5000);
		DriverManager.getDriver().findElement(modelBtn).click();
		System.out.println("individual request submitted");
		
		
		
	}
	
	public void verifySubmittedRequest() throws InterruptedException {
		System.out.println("Verifying the Company requested submitted in the Ideal search dashboard");
		Thread.sleep(5000);
		System.out.println(DriverManager.getDriver().findElement(resendAuth).isDisplayed());
		//DriverManager.getDriver().findElement(resendAuth).click();
		Thread.sleep(5000);
//		DriverManager.getDriver().findElement(homePageImg).click();
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
				System.out.println("The Company request is authorised and available for download");
				
			}else {
				System.out.println("The Company request is Not authorised");
			}
	 
		    
		
		}
	}
