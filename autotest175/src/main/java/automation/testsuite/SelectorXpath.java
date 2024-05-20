package automation.testsuite;

import automation.common.CommonBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;

public class SelectorXpath extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_SELECTOR);
	}

	@Test
	public void ElementName() {
		WebElement usernameEmail = driver.findElement(By.name("email"));
	}

	@Test
	public void ElementID() {
		WebElement pass = driver.findElement(By.id("pass"));
	}

	@Test
	public void ElementClass() {
		WebElement clas = driver.findElement(By.className("form-control"));
	}

	@Test
	public void ElementPlacehoder() {
		WebElement placehoder = driver.findElement(By.name("mobile number"));
	}

}
