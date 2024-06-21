package automation.testsuite;

import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class AlertWithClick extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_GURU99);
	}
	@Test
	public void alertWithClick() {
		type(By.name("cusid"), "123456");
		click(By.name("submit"));
		String mesgElert = driver.switchTo().alert().getText();
		assertEquals(mesgElert, "Do you really want to delete this Customer?");
		driver.switchTo().alert().accept();
		String mesgedElert = driver.switchTo().alert().getText();
		assertEquals(mesgedElert, "Customer Successfully Delete!");
		pause(2000);
		driver.switchTo().alert().accept();
	}
}
