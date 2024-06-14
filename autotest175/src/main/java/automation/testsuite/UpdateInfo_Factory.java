package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_Account;
import automation.common.CT_PagURL;
import automation.common.CommonBase;

import automation.page.UpdateInformation;

public class UpdateInfo_Factory extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_ALADA);
	}

	@Test
	public void LoginSuccess() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());
	}

	@Test
	public void UpdateInfo_Pass() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		// assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());

		UpdateInformation update = new UpdateInformation(driver);
		update.Update_function("thuc", "doan", "241", "14-04-2000", "01686450890", "Bac Ninh", "ABZ");
		assertTrue(driver.findElement(CT_Account.name_account).isDisplayed());
	}

	@Test
	public void UpdateInfo_Fail_Blank_Firstname() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());

		UpdateInformation update = new UpdateInformation(driver);
		update.Update_function("thuc", " ", "241", "14-04-2000", "01686450890", "Bac Ninh", "ABZ");
		assertTrue(driver.findElement(CT_Account.Label_name_account).isDisplayed());
	}

	@Test
	public void UpdateInfo_Fail_Blank_Phonenumber() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());

		UpdateInformation update = new UpdateInformation(driver);
		update.Update_function("thuc", "doan", "241", "14-04-2000", " ", "Bac Ninh", "ABZ");
		assertTrue(driver.findElement(CT_Account.Label_phonenumber).isDisplayed());
	}

	@Test
	public void UpdateInfo_Fail_Blank_Firstname_Phonenumber() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());

		UpdateInformation update = new UpdateInformation(driver);
		update.Update_function("thuc", " ", "241", "14-04-2000", "", "Bac Ninh", "ABZ");
		assertTrue(driver.findElement(CT_Account.Label_name_account).isDisplayed());
	}

	@Test
	public void UpdateInfo_Fail_Invalid_Phonenumber() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());

		UpdateInformation update = new UpdateInformation(driver);
		update.Update_function("thuc", "doan", "241", "14-04-2000", "0366957412", "Bac Ninh", "ABZ");
		assertTrue(driver.findElement(CT_Account.Label_phonenumber).isDisplayed());
	}

	@Test
	public void UpdateInfo_Fail_Invalid_Phonenumber_maxlength() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());

		UpdateInformation update = new UpdateInformation(driver);
		update.Update_function("thuc", "doan", "241", "14-04-2000", "0985478963258", "Bac Ninh", "ABZ");
		assertTrue(driver.findElement(CT_Account.Label_phonenumber).isDisplayed());
	}

	@Test
	public void UpdateInfo_Fail_Invalid_Phonenumber_minlength() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());

		UpdateInformation update = new UpdateInformation(driver);
		update.Update_function("thuc", "doan", "241", "14-04-2000", "016864508", "Bac Ninh", "ABZ");
		assertTrue(driver.findElement(CT_Account.Label_phonenumber).isDisplayed());
	}

	@Test
	public void UpdateInfo_Fail_Invalid_Phonenumber_inputText() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());

		UpdateInformation update = new UpdateInformation(driver);
		update.Update_function("thuc", "doan", "241", "14-04-2000", "abcdefghasdas", "Bac Ninh", "ABZ");
		assertTrue(driver.findElement(CT_Account.Label_phonenumber).isDisplayed());
	}

	@Test
	public void UpdatePass_Pass() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());

		UpdateInformation update_pass = new UpdateInformation(driver);
		update_pass.Updatepass(CT_Account.Pass, CT_Account.newPass, CT_Account.rePass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());
//		Alert alert = driver.switchTo().alert();
//		String alertText = alert.getText();
//		System.out.println("Alert text is: " + alertText);
//		alert.accept();
	}

	@Test
	public void UpdatePass_Fail_Click() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());

		UpdateInformation update_pass = new UpdateInformation(driver);
		update_pass.Updatepass(CT_Account.Pass, " ", " ");
		assertTrue(driver.findElement(CT_Account.Label_newpass_e).isDisplayed());
		assertTrue(driver.findElement(CT_Account.Label_rewpass_e).isDisplayed());
	}

	@Test
	public void UpdatePass_Fail_Input_newpass() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());

		UpdateInformation update_pass = new UpdateInformation(driver);
		update_pass.Updatepass(CT_Account.Pass, CT_Account.newPass, " ");
		assertTrue(driver.findElement(CT_Account.Label_rewpass_e).isDisplayed());
	}

	@Test
	public void UpdatePass_Fail_Input_rewpass() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());

		UpdateInformation update_pass = new UpdateInformation(driver);
		update_pass.Updatepass(CT_Account.Pass, "", CT_Account.rePass);
		assertTrue(driver.findElement(CT_Account.Label_newpass_e).isDisplayed());
		assertTrue(driver.findElement(CT_Account.Label_rewpass_e).isDisplayed());
	}

	@Test
	public void UpdatePass_Fail_Input_Different() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());

		UpdateInformation update_pass = new UpdateInformation(driver);
		update_pass.Updatepass(CT_Account.Pass, CT_Account.newPass, "d4nHfrGV2633TvTy");
		assertTrue(driver.findElement(CT_Account.Label_rewpass_e).isDisplayed());

	}

	@Test
	public void UpdatePass_Fail_Blank_All() {
		UpdateInformation login = new UpdateInformation(driver);
		login.Login_function(CT_Account.Email, CT_Account.Pass);
		assertTrue(driver.findElement(CT_Account.Text_account).isDisplayed());

		UpdateInformation update_pass = new UpdateInformation(driver);
		update_pass.Updatepass("", "", "");
		assertTrue(driver.findElement(CT_Account.Label_pass_e).isDisplayed());
		assertTrue(driver.findElement(CT_Account.Label_newpass_e).isDisplayed());
		assertTrue(driver.findElement(CT_Account.Label_rewpass_e).isDisplayed());
	}

	@AfterMethod
	public void closeChrome() {
		driver.close();
	}
}
