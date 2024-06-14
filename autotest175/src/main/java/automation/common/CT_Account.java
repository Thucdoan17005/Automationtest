package automation.common;

import org.openqa.selenium.By;

public class CT_Account {
	public static By Email_Element = By.id("txtLoginUsername");
	public static By Password_Element = By.id("txtLoginPassword");
	public static By Submit = By.xpath("//button[text()='ĐĂNG NHẬP' and @type='submit']");

	public static String Email = "thucdoan1705@gmail.com";
	public static String Pass = "d4nHfrGV2633TvT";
	public static String newPass = "d4nHfrGV2633TvT";
	public static String rePass = "d4nHfrGV2633TvT";
	

	public static By Text_account = By.xpath("//a[@class = 'fleft martop20 khct']");
	public static By name_account = By.xpath("//div[@class='cname fw600 marbot10']");
	
	public static By Label_email = By.id("txtLoginUsername-error");
	public static By Label_pass = By.id("txtLoginPassword-error");
	public static By Label_email_blank = By.id("txtLoginUsername-error");
	public static By Label_pass_blank = By.id("txtLoginPassword-error");
	public static By Label_email_incorect = By.className("cred");
	public static By Label_pass_incorect = By.className("cred");
	
	public static By Label_newpass_e = By.id("txtnewpass-error");
	public static By Label_rewpass_e = By.id("txtrenewpass-error");
	public static By Label_pass_e = By.id("txtpassword-error");
	public static By Label_name_account = By.id("member_firstname-error");
	public static By Label_phonenumber = By.id("member_tel-error");
}
