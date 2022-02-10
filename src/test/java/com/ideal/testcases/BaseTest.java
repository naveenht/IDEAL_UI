package com.ideal.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.ideal.driver.Driver;

public class BaseTest {

	protected BaseTest() {
		
	}
	


	@BeforeClass
	protected void setUp() throws Exception {
		Driver.initDriver();
		IdealOTP otpLogin = new IdealOTP();
		otpLogin.gloginTest();
		
	}

	@AfterClass()
	protected void tearDown() {
		Driver.quitDriver();
	}
}
