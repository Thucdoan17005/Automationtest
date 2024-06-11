package automation.common;

import org.openqa.selenium.By;

public class CT_Account {
	public static By Email_Element = By.id("txtLoginUsername");
	public static By Password_Element = By.id("txtLoginPassword");
	public static By Submit = By.xpath("//button[text()='ĐĂNG NHẬP' and @type='submit']");

	public static String Email = "thucdoan1705@gmail.com";
	public static String Pass = "d4nHfrGV2633TvN";

	public static By Text_account = By.xpath("//a[@class = 'fleft martop20 khct']");
	public static By Label_email = By.id("txtLoginUsername-error");
	public static By Label_pass = By.id("txtLoginPassword-error");
	public static By Label_email_blank = By.id("txtLoginUsername-error");
	public static By Label_pass_blank = By.id("txtLoginPassword-error");
	public static By Label_email_incorect = By.className("cred");
	public static By Label_pass_incorect = By.className("cred");
}
