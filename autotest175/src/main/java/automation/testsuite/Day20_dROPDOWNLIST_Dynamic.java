package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class Day20_dROPDOWNLIST_Dynamic extends CommonBase{
	@BeforeMethod
	@Parameters("brower")
	public void openBrower(@Optional("edge") String browerName) {
		setupDriver(browerName);
		driver.get(CT_PagURL.URL_TECH);
	}
	
	@Test
	public void select_Dynamic() {
		click(By.xpath("//span[text()='Select a Country']/following-sibling::div/b"));
		type(By.xpath("(//input[@type='text' and @autocomplete='off'])[2]"), "Vietnam");
		type(By.xpath("(//input[@type='text' and @autocomplete='off'])[2]"), Keys.TAB);
		
		String actual=  getText(By.xpath("(//a[@class='chosen-single']/child::span)[2]"));
		assertEquals(actual, "Vietnam");
	}
}
