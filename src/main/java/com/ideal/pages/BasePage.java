package com.ideal.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ideal.constants.IdealConstants;
import com.ideal.driver.DriverManager;



public class BasePage {
	
	protected static void explicitlyWait(WebElement element) {
		WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(),IdealConstants.EXPLICITWAIT);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	

}
