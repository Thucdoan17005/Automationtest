package automation.page;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tedu_Factory {
	private WebDriver driver; 

	public Tedu_Factory(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Login_Function(String UserName, String Pass) {
		Email_Element.sendKeys(UserName);
		Password_Element.sendKeys(Pass);
		Submit.click();
	}
	
	
	public void Update_Function(String fullName, String phonenumber, String Bio, String Birth, String Occupastion, String Salary, String Company) throws InterruptedException {
		Thread.sleep(2000);
		btnLater.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", accountname);
		account.click();
		edit.click();
		fullname.clear();
		fullname.sendKeys(fullName);
		phoneNumber.clear();
		phoneNumber.sendKeys(phonenumber);
		bio.sendKeys(Bio);
		birthDate.sendKeys(Birth);
		occupation.sendKeys(Occupastion);
		salary.sendKeys(Salary);
		company.sendKeys(Company);
		update.click();
	}
	
	public void Update_Password(String Oldpass, String Newpass, String Repass) throws InterruptedException {
		Thread.sleep(2000);
		btnLater.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", accountname);
        changePass.click();
        oldPass.sendKeys(Oldpass);
        newPass.sendKeys(Newpass);
        rePass.sendKeys(Repass);
        update.click();
	}
	
	public void Search(String Search) throws InterruptedException {
		Thread.sleep(2000);
		btnLater.click();
		search.sendKeys(Search);
		btnsearch.click();
	}
	
	public void Logout() throws InterruptedException {
		Thread.sleep(2000);
		btnLater.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", accountname);
        btnLogout.click();
	}
	
	//login
	@FindBy(id="UserName") WebElement Email_Element;
	@FindBy(id="Password") WebElement Password_Element;
	@FindBy(xpath = "//button[text()='Đăng nhập']") WebElement Submit;
	
	//update
	@FindBy(id= "onesignal-slidedown-cancel-button") WebElement btnLater;
	@FindBy(xpath = "//span[text() = 'hai@hnue.edu.vn']") WebElement accountname;
	@FindBy(xpath = "//a[text() = ' Tài khoản']") WebElement account;
	@FindBy(xpath = "//a[@title='Đổi mật khẩu']") WebElement changePass;
	@FindBy(xpath  = "//a[@class=  'btn btn-success']") WebElement edit;
	@FindBy(id = "FullName") WebElement fullname;
	@FindBy(id = "PhoneNumber") WebElement phoneNumber;
	@FindBy(id = "Bio") WebElement bio;
	@FindBy(id = "BirthDate") WebElement birthDate;
	@FindBy(id = "Occupation") WebElement occupation;
	@FindBy(id = "Salary") WebElement salary;
	@FindBy(id = "Company") WebElement company;
	@FindBy(xpath = "//input[@value= 'Cập nhật']") WebElement update;
	
	//update password
	@FindBy(id = "OldPassword") WebElement oldPass;
	@FindBy(id = "NewPassword") WebElement newPass;
	@FindBy(id = "ConfirmNewPassword") WebElement rePass;
	
	//search
	@FindBy(xpath = "//input[@class= 'autosearch-input form-control']") WebElement search;
	@FindBy(xpath = "//button[@class= 'button-search btn btn-primary']") WebElement btnsearch;
	@FindBy(xpath = "//div[@class= 'post-title']") WebElement result;
	
	//logout
	@FindBy(xpath="//a[@id='btnLogout']") WebElement btnLogout;
}
