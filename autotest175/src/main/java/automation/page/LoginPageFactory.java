package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.common.CT_Account;

public class LoginPageFactory {
	private WebDriver driver;

	public LoginPageFactory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Login_function(String Email, String Pass) {
		Email_Element.sendKeys(Email);
		Password_Element.sendKeys(Pass);
		Submit.click();
	}

	@FindBy(id = "txtLoginUsername") WebElement Email_Element;
	@FindBy(id = "txtLoginPassword") WebElement Password_Element;
	@FindBy(xpath = "//button[text()='ĐĂNG NHẬP' and @type='submit']") WebElement Submit;
}
