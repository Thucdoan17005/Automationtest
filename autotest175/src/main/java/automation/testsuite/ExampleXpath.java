package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class ExampleXpath extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_SELECTOR);
	}

	@Test

	public void LocatceElementID() {
		WebElement usernameElement = driver.findElement(By.xpath("//tr[@class='usr_acn' | @class='plan rit']"));

}
	}
