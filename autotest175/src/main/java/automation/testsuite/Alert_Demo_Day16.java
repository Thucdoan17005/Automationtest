package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class Alert_Demo_Day16 extends CommonBase{
@BeforeMethod
public void openChrome() {
	driver = initDriverTest(CT_PagURL.URL_AlertDemo);
}
@Test
public void clickButton() {
	click(By.xpath("//button[text()='Try it']"));
	pause(10000);
	driver.switchTo().alert().getText();
	String msgAlert = driver.switchTo().alert().getText();
	assertEquals(msgAlert, "Welcome to Selenium WebDriver Tutorials");
	driver.switchTo().alert().accept();
}
}
