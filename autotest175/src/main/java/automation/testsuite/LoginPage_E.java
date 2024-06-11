package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_Account_E;
import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class LoginPage_E extends CommonBase {
	@BeforeMethod
	public void openBrower() {
		driver = initDriverTest(CT_PagURL.URL_ACTIVEZONE);
	}

	@Test
	public void LoginSuccess() {
		WebElement emailbox = driver.findElement(CT_Account_E.Email_Element_E);
		if (emailbox.isEnabled()) {
			emailbox.sendKeys(CT_Account_E.Email_E);
		}
		WebElement passwordbox = driver.findElement(CT_Account_E.Password_Element_E);
		if (passwordbox.isEnabled()) {
			passwordbox.sendKeys(CT_Account_E.Pass_E);
		}
		WebElement Login_btn = driver.findElement(CT_Account_E.Submit_E);
		if (Login_btn.isEnabled()) {
			Login_btn.click();
			assertTrue(driver.findElement(CT_Account_E.Text_account_E).isDisplayed());
		}
	}

	@Test
	public void LoginFail_Email_Incorect() {
		WebElement emailbox = driver.findElement(CT_Account_E.Email_Element_E);
		if (emailbox.isEnabled()) {
			emailbox.sendKeys("thuc@gmail.com");
		}
		WebElement passwordbox = driver.findElement(CT_Account_E.Password_Element_E);
		if (passwordbox.isEnabled()) {
			passwordbox.sendKeys(CT_Account_E.Pass_E);
		}
		WebElement Login_btn = driver.findElement(CT_Account_E.Submit_E);
		if (Login_btn.isEnabled()) {
			Login_btn.click();
			// assertTrue(false);
		}
	}

	@Test
	public void LoginFail_Pass_Incorect() {
		WebElement emailbox = driver.findElement(CT_Account_E.Email_Element_E);
		if (emailbox.isEnabled()) {
			emailbox.sendKeys(CT_Account_E.Email_E);
		}
		WebElement passwordbox = driver.findElement(CT_Account_E.Password_Element_E);
		if (passwordbox.isEnabled()) {
			passwordbox.sendKeys("12345678");
		}
		WebElement Login_btn = driver.findElement(CT_Account_E.Submit_E);
		if (Login_btn.isEnabled()) {
			Login_btn.click();
			// assertTrue(false);
		}
	}

	@Test
	public void LoginFail_All_Incorect() {
		WebElement emailbox = driver.findElement(CT_Account_E.Email_Element_E);
		if (emailbox.isEnabled()) {
			emailbox.sendKeys("thuc@gmail.com");
		}
		WebElement passwordbox = driver.findElement(CT_Account_E.Password_Element_E);
		if (passwordbox.isEnabled()) {
			passwordbox.sendKeys("12345678");
		}
		WebElement Login_btn = driver.findElement(CT_Account_E.Submit_E);
		if (Login_btn.isEnabled()) {
			Login_btn.click();
			// assertTrue(false);
		}
	}

	@Test
	public void Logout() {
		WebElement emailbox = driver.findElement(CT_Account_E.Email_Element_E);
		if (emailbox.isEnabled()) {
			emailbox.sendKeys(CT_Account_E.Email_E);
		}
		WebElement passwordbox = driver.findElement(CT_Account_E.Password_Element_E);
		if (passwordbox.isEnabled()) {
			passwordbox.sendKeys(CT_Account_E.Pass_E);
		}
		WebElement Login_btn = driver.findElement(CT_Account_E.Submit_E);
		if (Login_btn.isEnabled()) {
			Login_btn.click();
			// assertTrue(driver.findElement(CT_Account_E.Text_account_E).isDisplayed());
		}
		// WebElement logout_btnElement = driver.findElement(CT_Account_E.Logout_E);
	}

	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
}
