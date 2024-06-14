package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.common.CT_Account;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void Login_function(String Email, String Pass) {

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
		}
	}
}
