package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import automation.common.CT_Account;

public class UpdateInformation {
	private WebDriver driver;

	public UpdateInformation(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Login_function(String Email, String Pass) {

		Email_Element.sendKeys(Email);
		Password_Element.sendKeys(Pass);
		Submit.click();
	}
	
	public void Update_function(String lastName, String firstName,String Tinhthanh, String ngaySinh, String Sdt, String Address, String Cty) {
		avatar.click();
		linkupElement.click();
		lastname.clear();
		lastname.sendKeys(lastName);
		
		firstname.clear();
		firstname.sendKeys(firstName);
			
		if (rdoNam.isEnabled() == true && rdoNam.isSelected() == false) {
			rdoNam.click();
		} 
		Select selectTinhthanh = new Select(dropTinhthanh);
		selectTinhthanh.selectByValue(Tinhthanh);
		ngaysinh.clear();
		ngaysinh.sendKeys(ngaySinh);
		phonenumber.clear();
		phonenumber.sendKeys(Sdt);
		diachi.clear();
		diachi.sendKeys(Address);
		company.sendKeys(Cty);
		save.click();
	}
	public void Updatepass(String Pass, String newPassword, String rePassword) {
		avatar.click();
		linkupElement.click();
		username.isDisplayed();
		password.sendKeys(Pass);
		newpassword.sendKeys(newPassword);
		repassword.sendKeys(rePassword);
		savepass.click();
	}
//account login
	@FindBy(id= "txtLoginUsername") @CacheLookup WebElement Email_Element;
	@FindBy(id="txtLoginPassword") @CacheLookup WebElement Password_Element;
	@FindBy(xpath = "//button[text()='ĐĂNG NHẬP' and @type='submit']") WebElement Submit;

//thông tin cá nhân
	@FindBy(xpath = "//div[@class='avatar2']") WebElement avatar;
	@FindBy(xpath = "//a[text()='Chỉnh sửa thông tin']") WebElement linkupElement;
	@FindBy(id = "member_lastname") WebElement lastname;
	@FindBy(id = "member_firstname") WebElement firstname;
	@FindBy(xpath = "//label[text()= ' Nam']/child::input") WebElement rdoNam;
	@FindBy(xpath = "//label[text()= ' Nữ']/child::input") WebElement rdoNu;
	@FindBy(id="txtCity") WebElement dropTinhthanh;
	@FindBy(id = "member_birthday") WebElement ngaysinh;
	@FindBy(id = "member_tel") WebElement phonenumber;
	@FindBy(id = "member_address") WebElement diachi;
	@FindBy(id = "member_company") WebElement company;
	@FindBy(xpath = "//button[text()='Lưu thông tin']") WebElement save;

//thông tin đăng nhập
	@FindBy(className = "maxwidth") WebElement username;
	@FindBy(id = "txtpassword") WebElement password;
	@FindBy(id = "txtnewpass") WebElement newpassword;
	@FindBy(id = "txtrenewpass") WebElement repassword;
	@FindBy(xpath = "//button[text()='Lưu mật khẩu mới']") WebElement savepass;
}
