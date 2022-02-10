package com.ideal.driver;

import java.io.IOException;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ideal.constants.IdealConstants;
import com.ideal.utils.ReadPropertyFiles;

public final class Driver {
	
	private Driver() {
		
	}
	
		
	public static void initDriver() throws Exception {
		if(Objects.isNull(DriverManager.getDriver())) {
		System.setProperty("webdriver.chrome.driver", IdealConstants.getChromeDriverPath());
		DriverManager.setWebDriver(new ChromeDriver());
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().get(ReadPropertyFiles.getValue("url"));
		}
	}
	
	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
