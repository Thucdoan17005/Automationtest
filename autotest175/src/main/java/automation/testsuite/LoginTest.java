package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_Account;
import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class LoginTest extends CommonBase {
	@BeforeMethod
	public void openBrower() {
		driver = initDriverTest(CT_PagURL.URL_ALADA);

	}

	@Test
	public void LoginSuccess() {
		WebElement emailboxElement = driver.findElement(CT_Account.Email_Element);
		if (emailboxElement.isEnabled()) {
			emailboxElement.sendKeys(CT_Account.Email);
		}

		WebElement passwordboxElement = driver.findElement(CT_Account.Password_Element);
		if (passwordboxElement.isEnabled()) {
			passwordboxElement.sendKeys(CT_Account.Pass);
		}

		WebElement buttonLoginElement = driver.findElement(CT_Account.Submit);
		if (buttonLoginElement.isEnabled()) {
			buttonLoginElement.click();
			assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());
		}
	}
	
	@Test
	public void LoginFail_Blank_Email() throws InterruptedException {
		WebElement emailboxElement = driver.findElement(CT_Account.Email_Element);
		if (emailboxElement.isEnabled()) {
			emailboxElement.sendKeys(" ");
			Thread.sleep(1000);
		}
		WebElement passwordboxElement = driver.findElement(CT_Account.Password_Element);
		if (passwordboxElement.isEnabled()) {
			passwordboxElement.sendKeys(CT_Account.Pass);
			Thread.sleep(1000);
		}
		WebElement buttonLoginElement = driver.findElement(CT_Account.Submit);
		if (buttonLoginElement.isEnabled()) {
			buttonLoginElement.click();
			Thread.sleep(1000);
			assertTrue(driver.findElement(CT_Account.Label_email_blank).isDisplayed());
		}
	}
	
	@Test
	public void LoginFail_Blank_Pass() throws InterruptedException {
		WebElement emailboxElement = driver.findElement(CT_Account.Email_Element);
		if (emailboxElement.isEnabled()) {
			emailboxElement.sendKeys("thucdoan1705@gmail.com");
			Thread.sleep(1000);
		}
		WebElement passwordboxElement = driver.findElement(CT_Account.Password_Element);
		if (passwordboxElement.isEnabled()) {
			passwordboxElement.sendKeys("");
			Thread.sleep(1000);
		}
		WebElement buttonLoginElement = driver.findElement(CT_Account.Submit);
		if (buttonLoginElement.isEnabled()) {
			buttonLoginElement.click();
			Thread.sleep(1000);
			assertTrue(driver.findElement(CT_Account.Label_pass_blank).isDisplayed());
		}
		
	}
	
	@Test
	public void LoginFail_Blank_All() throws InterruptedException {
		WebElement emailboxElement = driver.findElement(CT_Account.Email_Element);
		if (emailboxElement.isEnabled()) {
			emailboxElement.sendKeys("");
			Thread.sleep(1000);
		}
		WebElement passwordboxElement = driver.findElement(CT_Account.Password_Element);
		if (passwordboxElement.isEnabled()) {
			passwordboxElement.sendKeys("");
			Thread.sleep(1000);
		}
		WebElement buttonLoginElement = driver.findElement(CT_Account.Submit);
		if (buttonLoginElement.isEnabled()) {
			buttonLoginElement.click();
			Thread.sleep(1000);
			assertTrue(driver.findElement(CT_Account.Label_email_blank).isDisplayed());
			assertTrue(driver.findElement(CT_Account.Label_pass_blank).isDisplayed());
		}
		
	}
	
	@Test
	public void LoginFail_Incorect_Email() {
		WebElement emailboxElement = driver.findElement(CT_Account.Email_Element);
		if (emailboxElement.isEnabled()) {
			emailboxElement.sendKeys("thucdoan1404@gmail.com");
		}
		WebElement passwordboxElement = driver.findElement(CT_Account.Password_Element);
		if (passwordboxElement.isEnabled()) {
			passwordboxElement.sendKeys(CT_Account.Pass);
		}
		WebElement buttonLoginElement = driver.findElement(CT_Account.Submit);
		if (buttonLoginElement.isEnabled()) {
			buttonLoginElement.click();
			assertTrue(driver.findElement(CT_Account.Label_email_incorect).isDisplayed());
		}
	}
	@Test
	public void LoginFail_Incorect_Pass() {
		WebElement emailboxElement = driver.findElement(CT_Account.Email_Element);
		if (emailboxElement.isEnabled()) {
			emailboxElement.sendKeys(CT_Account.Email);
		}
		WebElement passwordboxElement = driver.findElement(CT_Account.Password_Element);
		if (passwordboxElement.isEnabled()) {
			passwordboxElement.sendKeys("12345678798");
		}
		WebElement buttonLoginElement = driver.findElement(CT_Account.Submit);
		if (buttonLoginElement.isEnabled()) {
			buttonLoginElement.click();
			assertTrue(driver.findElement(CT_Account.Label_pass_incorect).isDisplayed());
		}
	}
	@Test
	public void LoginFail_Invalid_Email() throws InterruptedException {
		WebElement emailboxElement = driver.findElement(CT_Account.Email_Element);
		if (emailboxElement.isEnabled()) {
			emailboxElement.sendKeys("thuc1705gmail.com");
		}
		WebElement passwordboxElement = driver.findElement(CT_Account.Password_Element);
		if (passwordboxElement.isEnabled()) {
			passwordboxElement.sendKeys(CT_Account.Pass);
		}
		WebElement buttonLoginElement = driver.findElement(CT_Account.Submit);
		if (buttonLoginElement.isEnabled()) {
			buttonLoginElement.click();
			assertTrue(driver.findElement(CT_Account.Label_email_incorect).isDisplayed());
			assertTrue(driver.findElement(CT_Account.Label_pass_incorect).isDisplayed());
			Thread.sleep(1000);
		}
	}

	@AfterMethod
	public void closeChrome() {
		driver.close();
	}

}
