package com.ideal.testcases;

import org.testng.annotations.Test;

import com.ideal.pages.IdealDashboardPage;
import com.ideal.pages.IdealIndividualApplicationPage;

public final class IdealIndividualRequest extends BaseTest {
	public IdealIndividualRequest() {
		
	}
	
	
	@Test
	public void individualRequest() throws InterruptedException {
		IdealDashboardPage dPage = new IdealDashboardPage();
		IdealIndividualApplicationPage iPage = new IdealIndividualApplicationPage();
		
		dPage.clickOnIndividualRequest();
		iPage.enterIndividualRequest();
		iPage.submitIndividualRequest();
		iPage.verifySubmittedRequest();
		
		
		
		
		
	}

}
