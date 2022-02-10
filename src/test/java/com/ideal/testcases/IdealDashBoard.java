package com.ideal.testcases;

import org.testng.annotations.Test;

import com.ideal.pages.IdealDashboardPage;

public final class IdealDashBoard extends BaseTest{
	public IdealDashBoard(){
		
	}
	
	@Test
	public void VerifyIdealDashBoadHeaderNav() throws InterruptedException {
		IdealDashboardPage dashTest = new IdealDashboardPage();
		dashTest.verifyHeaderNavbarAttributes();		
				
	}
	
	@Test
	public void verifyIdealDashboardButtons() throws InterruptedException {
		IdealDashboardPage dashTest = new IdealDashboardPage();
				
		dashTest.verifycompRequest();
		dashTest.verifyindividualRequest();
		
	
	}
	
	
	@Test
	public void verifyIdealgridHeaderTitle() throws InterruptedException {
		IdealDashboardPage dashTest = new IdealDashboardPage();
				
		dashTest.verifygridHeaderTitleRequest();
		dashTest.verifygridHeaderTitleApplicant();		
		dashTest.verifygridHeaderTitleDateHour();
		dashTest.verifygridHeaderTitleEmail();
		dashTest.verifygridHeaderTitlePhone();
		dashTest.verifygridHeaderTitleReason();
		dashTest.verifyIdealgridHeaderTitleExp();
		dashTest.verifyIdealgridHeaderTitleStatus();
		
		
	}
	
	@Test
	public void verifyIdealDashboardSearch() throws InterruptedException {
		IdealDashboardPage dashTest = new IdealDashboardPage();
				
		dashTest.verifyIdealDashboardSearch();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
