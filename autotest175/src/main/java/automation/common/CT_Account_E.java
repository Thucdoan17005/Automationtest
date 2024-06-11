package automation.common;

import org.openqa.selenium.By;

public class CT_Account_E {
	public static By Email_Element_E = By.id("email");
	public static By Password_Element_E = By.name("password");
	public static By Submit_E = By.xpath("//button[@type='submit']");

	public static String Email_E = "admin@example.com";
	public static String Pass_E = "123456";

	public static By Text_account_E = By.xpath("//span[contains(text(),'William C. Schroyer')]");

	public static By Logout_E = By.xpath("//span[contains(text(),'William C. Schroyer')]");

}
