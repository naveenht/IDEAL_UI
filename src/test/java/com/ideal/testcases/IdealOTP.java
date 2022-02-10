package com.ideal.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ideal.driver.DriverManager;
import com.ideal.pages.Gmail;
import com.ideal.pages.IdealDashboardPage;
import com.ideal.pages.IdealLogin;

public final class IdealOTP extends BaseTest {
	
	public IdealOTP() {
		
	}
	
	public static String verificationCode= "";
	
	@Test
	public void gloginTest() throws Exception {
		
		IdealLogin iLogin = new IdealLogin();
		iLogin.enterIdealLogin();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		iLogin.idealLogin();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		iLogin.idealVerificationCodeField();
		WebDriver driver = DriverManager.getDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.open()");	    
	    String mainWindowHandle = DriverManager.getDriver().getWindowHandle();    
	    for (String childWindowHandle : DriverManager.getDriver().getWindowHandles()) {
	    	  //If window handle is not main window handle then close it 
	    	  if(!childWindowHandle.equals(mainWindowHandle)){
	    		  DriverManager.getDriver().switchTo().window(childWindowHandle);
	    	  // Close child windows
	    	 // driver.close(); 
	    	  }
	    	} 
	    DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DriverManager.getDriver().navigate().to("https://www.google.com/");
		Gmail gPage = new Gmail();
		gPage.clickSignIn();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		gPage.enterUsername("csrtest@codedog.solutions");
		gPage.clickUsernameNext();
		gPage.enterPassword("CodeDog123");
		gPage.clickPasswordNext();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//gPage.deleteMail();
		//gPage.wait(5000);
		//Thread.sleep(15000);
		System.out.println("Get 1stMail Content:");
		Thread.sleep(5000);
		String emailContent = DriverManager.getDriver().findElement(By.xpath("//tbody/tr[@class='zA zE']")).getText();
		System.out.println(emailContent);
		
		 String[] emailBodyContent = emailContent.split("\\r?\\n");
		// System.out.println("////////////////////");
		 String codeString = emailBodyContent[3];
		 System.out.println(codeString);
		 String[] str1 = codeString.split("\\s+");
		 System.out.println("Verification Code: "+str1[(str1.length)-4]);
		 verificationCode =str1[(str1.length)-4].trim();
			/*
			 * for (String line : str1) { System.out.println(line);
			 * System.out.println("////////////////////"); }
			 */
		 //System.out.println(emailBodyContent[4]);
//		  for (String line : lines) {
//		            System.out.println(line);
//		            System.out.println("////////////////////");
//		        }
		//DriverManager.getDriver().findElement(By.xpath("//tbody/tr[@class='zA zE']")).click();
		DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DriverManager.getDriver().findElement(By.xpath("//div[@aria-label='Select']")).click();
		Thread.sleep(2000);
		DriverManager.getDriver().findElement(By.xpath("//div[@aria-label='Delete']")).click();
		DriverManager.getDriver().switchTo().window(mainWindowHandle);
		Thread.sleep(6000);
		iLogin.idealVerifyLoginCode(verificationCode);
		DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//iLogin.idealDashboardLogo();
		Thread.sleep(6000);
	}
	
	
	
	
	public void deleteMail() {
		
	}
	
}
