package automation.testsuite;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class Day12_Dropdownlist extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_SELENIUM_DROPDOWN);
	}

	@Test
	public void Dropdownlist() throws InterruptedException {
		Select dropdownSelect = new Select(driver.findElement(By.id("select-demo")));
		// tcs1:check list có 8 phan tu
		int size = dropdownSelect.getOptions().size();
		assertEquals(size, 8);

		// tcs2: chọn option
		dropdownSelect.selectByVisibleText("Monday");
		String text1 = dropdownSelect.getFirstSelectedOption().getText();
		assertEquals(text1, "Monday");
		Thread.sleep(4000);

		dropdownSelect.selectByIndex(5);
		String text2 = dropdownSelect.getFirstSelectedOption().getText();
		assertEquals(text2, "Thursday");
		Thread.sleep(4000);

		dropdownSelect.selectByValue("Tuesday");
		String text3 = dropdownSelect.getFirstSelectedOption().getText();
		assertEquals(text3, "Tuesday");
		Thread.sleep(3000);
	}

	@AfterClass
	public void closeChrome() {
		driver.close();
	}

}