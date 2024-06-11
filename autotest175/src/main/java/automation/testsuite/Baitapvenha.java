package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class Baitapvenha extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_SELENIUM_DROPDOWN1);
	}

	@Test
	public void Statelist() throws InterruptedException {
		Select dropdownSelect = new Select(driver.findElement(By.name("state")));
		// tcs1:check list có bao nhieu phan tu
		int size = dropdownSelect.getOptions().size();
		assertEquals(size, 52);

		// check dropdown select single or multiple
		if (dropdownSelect.isMultiple()) {
			dropdownSelect.selectByIndex(0);
			dropdownSelect.selectByIndex(1);
			dropdownSelect.selectByIndex(2);
			dropdownSelect.selectByIndex(3);
			// ...

		} else {

			System.out.println("Khong phai multi-select ");

		}

		// tcs2: chọn option
		dropdownSelect.selectByVisibleText("California");
		String text1 = dropdownSelect.getFirstSelectedOption().getText();
		assertEquals(text1, "California");
		Thread.sleep(3000);

		dropdownSelect.selectByIndex(10);
		String text2 = dropdownSelect.getFirstSelectedOption().getText();
		assertEquals(text2, "Florida");
		Thread.sleep(3000);
	}

	@Test
	public void radioBox() throws InterruptedException {
		WebElement radiocheck = driver.findElement(By.xpath("//input[@value= 'yes']"));
		WebElement radiocheck2 = driver.findElement(By.xpath("//input[@value= 'no']"));
		if (radiocheck.isEnabled() == true && radiocheck.isSelected() == false) {
			radiocheck.click();
			Thread.sleep(3000);
		}

		if (radiocheck2.isEnabled() == true && radiocheck2.isSelected() == false) {
			radiocheck2.click();
			Thread.sleep(3000);
		}

	}

//	@Test
//	public void Input() throws InterruptedException {
//		WebElement firstnamElement = driver.findElement(By.xpath("//input[@name='first_name']"));
//		firstnamElement.sendKeys("thucdoan");
//
//		WebElement lastnamElement = driver.findElement(By.xpath("//input[@name='last_name']"));
//		lastnamElement.sendKeys("doanthuc");
//
//		WebElement emailElement = driver.findElement(By.xpath("//input[@name='email']"));
//		emailElement.sendKeys("thucdoan1404@gmail.com");
//
//		WebElement sendElement = driver.findElement(By.xpath("//button[@type='submit' and @class= 'btn btn-default']"));
//		sendElement.click();
//
//		Thread.sleep(5000);
//	}

	@AfterMethod
	public void closeChrome() {
		driver.close();
	}

}
