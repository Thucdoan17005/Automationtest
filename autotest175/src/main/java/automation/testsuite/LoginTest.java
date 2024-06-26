package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_Account;
import automation.common.CT_PagURL;
import automation.common.CommonBase;
import automation.page.LoginPage;

public class LoginTest extends CommonBase {
	@BeforeMethod
	public void openBrower() {
		driver = initDriverTest(CT_PagURL.URL_ALADA);

	}

	@Test
	public void LoginSuccess() {
		LoginPage login = new LoginPage(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());
	}

	@Test
	public void LoginFail_Blank_Email() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.Login_function("", CT_Account.Pass);
	}

	@Test
	public void LoginFail_Blank_Pass() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.Login_function(CT_Account.Email, "");
		assertTrue(driver.findElement(CT_Account.Label_pass_blank).isDisplayed());
	}

	@Test
	public void LoginFail_Blank_All() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.Login_function("", "");
		assertTrue(driver.findElement(CT_Account.Label_email_blank).isDisplayed());
		assertTrue(driver.findElement(CT_Account.Label_pass_blank).isDisplayed());
	}

	@Test
	public void LoginFail_Incorect_Email() {
		LoginPage login = new LoginPage(driver);
		login.Login_function("thuc@gmail.com", CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Label_email_incorect).isDisplayed());
	}

	@Test
	public void LoginFail_Incorect_Pass() {
		LoginPage login = new LoginPage(driver);
		login.Login_function(CT_Account.Email, "123456789");
		assertTrue(driver.findElement(CT_Account.Label_pass_incorect).isDisplayed());
	}

	@Test
	public void LoginFail_Invalid_Email() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.Login_function("thuc@gmail.com", CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Label_email_incorect).isDisplayed());
		assertTrue(driver.findElement(CT_Account.Label_pass_incorect).isDisplayed());
		Thread.sleep(1000);
	}

	@AfterMethod
	public void closeChrome() {
		driver.close();
	}

}
