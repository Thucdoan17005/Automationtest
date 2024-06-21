package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class Alert_day16 extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_ALERT);
	}
	
	@Test
	public void AlertWithTextbox() {
		click(By.xpath("//a[text()='Alert with Textbox ']"));
		click(By.xpath("//button[@class='btn btn-info']"));
		driver.switchTo().alert().sendKeys("");
		driver.switchTo().alert().sendKeys("thucdoan");
		driver.switchTo().alert().accept();
		WebElement resultText= getElementPresentDOM(By.xpath("//p[@id='demo1']"));
		assertEquals(resultText.getText(), "Hello thucdoan How are you today");
	}
	
}
