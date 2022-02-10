package com.ideal.testcases;

import org.testng.annotations.Test;

import com.ideal.pages.IdealCompanyApplicationPage;
import com.ideal.pages.IdealDashboardPage;
import com.ideal.pages.IdealIndividualApplicationPage;

public final class IdealCompanyRequest extends BaseTest {
	public IdealCompanyRequest() {
		
	}
	
	
	@Test
	public void companyRequest() throws InterruptedException {
		IdealDashboardPage dPage = new IdealDashboardPage();
		IdealCompanyApplicationPage cPage = new IdealCompanyApplicationPage();
		
		cPage.clickCompanyRequest();
		cPage.enterCompanyRequest();
		cPage.submitCompanyRequest();
		cPage.verifySubmittedRequest();
		
		
		
		
		
	}

}
