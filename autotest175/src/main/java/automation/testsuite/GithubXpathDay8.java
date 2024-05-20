package automation.testsuite;

import automation.common.CommonBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;

public class GithubXpathDay8 extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_GITHUB);
	}

	@Test
	public void ElementName() {
		WebElement name = driver.findElement(By.id("name"));
	}

	@Test
	public void ElementAddress() {
		WebElement addressElement = driver.findElement(By.name("address"));
	}

	@Test
	public void ElementEmail() {
		WebElement email = driver.findElement(By.id("email"));
	}

	@Test
	public void ElementPassword() {
		WebElement password = driver.findElement(By.id("password"));
	}

	@Test
	public void ElementSubmit() {
		WebElement submit = driver.findElement(By.id("password"));
		submit.click();
	}

}
