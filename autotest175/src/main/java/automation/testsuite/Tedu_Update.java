package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CT_account_TD;
import automation.common.CommonBase;
import automation.page.Tedu_Factory;

public class Tedu_Update extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_TEDU);
	}
	
	@Test
	public void Login() {
		Tedu_Factory login = new Tedu_Factory(driver);
		login.Login_Function(CT_account_TD.UserName, CT_account_TD.Pass);
		assertTrue(driver.findElement(CT_account_TD.Text_account).isDisplayed());
	}

	
	@Test
	public void Update_Infor() throws InterruptedException {
		Tedu_Factory login = new Tedu_Factory(driver);
		login.Login_Function(CT_account_TD.UserName, CT_account_TD.Pass);	
		assertTrue(driver.findElement(CT_account_TD.Text_account).isDisplayed());
		
		Tedu_Factory update = new Tedu_Factory(driver);
		update.Update_Function("Nguyễn Trọng Việt", "01686450890", "Hà Nội", "12/07/2000", "Hoàng Mai", "1000", "VTTV");
		assertTrue(driver.findElement(CT_account_TD.Alert_success).isDisplayed());
	}
	
	@Test
	public void Update_Password() throws InterruptedException {
		Tedu_Factory login = new Tedu_Factory(driver);
		login.Login_Function(CT_account_TD.UserName, CT_account_TD.Pass);	
		assertTrue(driver.findElement(CT_account_TD.Text_account).isDisplayed());
		
		Tedu_Factory changepass =new Tedu_Factory(driver);
		changepass.Update_Password(CT_account_TD.Pass, CT_account_TD.newPass, CT_account_TD.rePass);
		assertTrue(driver.findElement(CT_account_TD.Login_text).isDisplayed());
		assertTrue(driver.findElement(CT_account_TD.Alert_success).isDisplayed());
	}
	
	@Test
	public void Search() throws InterruptedException{
		Tedu_Factory login = new Tedu_Factory(driver);
		login.Login_Function(CT_account_TD.UserName, CT_account_TD.Pass);	
		assertTrue(driver.findElement(CT_account_TD.Text_account).isDisplayed());
		
		Tedu_Factory search =new Tedu_Factory(driver);
		search.Search("ASP Net");
		assertTrue(driver.findElement(CT_account_TD.Result_text).isDisplayed());
	}
	
	@Test
	public void Logout() throws InterruptedException{
		Tedu_Factory login = new Tedu_Factory(driver);
		login.Login_Function(CT_account_TD.UserName, CT_account_TD.Pass);
		assertTrue(driver.findElement(CT_account_TD.Text_account).isDisplayed());
		
		Tedu_Factory logout =new Tedu_Factory(driver);
		logout.Logout();
		assertTrue(driver.findElement(CT_account_TD.Register_text).isDisplayed());
	}
	

//	@AfterMethod
//	public void closeChrome() {
//		driver.close();
//	}
}
