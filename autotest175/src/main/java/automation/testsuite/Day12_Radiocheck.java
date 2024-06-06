package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class Day12_Radiocheck extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_SELENIUM_RADIO);
	}
	
	@Test
	public void radioBox() throws InterruptedException {
		WebElement radiocheck = driver.findElement(By.xpath("//input[@value='0 - 5']"));
		WebElement radiocheck2 = driver.findElement(By.xpath("//input[@value='5 - 15']"));
		WebElement radiocheck3 = driver.findElement(By.xpath("//input[@value='15 - 50']"));
		if(radiocheck.isEnabled()==true && radiocheck.isSelected()==false) {
			radiocheck.click();
			Thread.sleep(3000);
		}
		
		if(radiocheck2.isEnabled()==true && radiocheck2.isSelected()==false) {
			radiocheck2.click();
			Thread.sleep(3000);
		}
		
		if(radiocheck3.isEnabled()==true && radiocheck3.isSelected()==false) {
			radiocheck3.click();
			Thread.sleep(3000);
		}
	}
	
	@AfterClass
	public void closeChrome() {
		driver.close();
	}
}
