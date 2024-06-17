package automation.common;

import org.openqa.selenium.By;

public class CT_account_TD {
	public static By Email_Element = By.id("UserName");
	public static By Password_Element = By.id("Password");
	public static By Submit = By.xpath("//button[text()='Đăng nhập']");

	public static String UserName = "hai@hnue.edu.vn";
	public static String Pass = "haind12345";
	public static String newPass = "haind12345";
	public static String rePass = "haind12345";

	public static By Text_account = By.xpath("//span[text()='hai@hnue.edu.vn']");
	public static By Alert_success = By.xpath("//div[@class='alert alert-success']");
	public static By Login_text = By.xpath("//h2[@class='text-uppercase']");
	public static By Register_text = By.xpath("//a[@title='Đăng ký']");
	
	public static By Result_text = By.xpath("//div[@class= 'post-title']");
}
