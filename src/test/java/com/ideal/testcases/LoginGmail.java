package com.ideal.testcases;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

import com.ideal.driver.DriverManager;

public final class LoginGmail extends BaseTest {
	
	private LoginGmail() {
		
	}
		
	@Test
	public void test1() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);
	}
	
	@Test
	public void test2() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("IDEAL",Keys.ENTER);
		String title = DriverManager.getDriver().getTitle();
		
		assertThat(title)
				  .as("Object is actually null").isNotNull()
				  .as("It does not contains expected text").containsIgnoringCase("google search")
				  .matches("\\w.*"+"Google Search")
				  .hasSizeBetween(15, 100);
		
		/*
		 * Assert.assertTrue(Objects.nonNull(title),"Title is null");
		 * Assert.assertTrue(title.toLowerCase().contains("google search"));
		 * Assert.assertTrue(title.toLowerCase().matches("\\w.*"+"google search"));
		 * Assert.assertTrue(title.length()>15); Assert.assertTrue(title.length()<100);
		 */
		
		List<WebElement> elements = DriverManager.getDriver().findElements(By.xpath("//h3"));
		assertThat(elements)
				  .hasSize(16)
				  .extracting(WebElement :: getText)
				  .contains("BVRIT: Home");
				  
		
		/*
		 * Assert.assertEquals(elements.size(),17); boolean isElementPresent = false;
		 * for(WebElement element: elements) {
		 * if(element.getText().equalsIgnoreCase("BVRIT: Home")) {
		 * isElementPresent=true; break; } }
		 * Assert.assertTrue(isElementPresent,"BVRIT: Home not found");
		 */
		
	}

}
