package automation.testsuite;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class Day12_Checkbox extends CommonBase {

	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_SELENIUM_ES);
	}

	@Test
	public void SingleCheckbox() {
		// tcs 1:đã check
		boolean isChecSelected = driver
				.findElement(By.xpath("//label[text()[normalize-space() = 'Default Checked']]/child::input"))
				.isSelected();
		assertEquals(isChecSelected, true);

		// tcs 1:chưa check
		WebElement Checkbox = driver.findElement(By.id("isAgeSelected"));
		boolean isCheck2 = Checkbox.isSelected();
		if (isCheck2 == false) {
			Checkbox.click();
		}
	}

	public void multipleCheck() throws InterruptedException {
		List<WebElement> lischeckbox = driver.findElements(By.xpath(
				"//div[text()='Multiple Checkbox Demo']/following-sibling::div[@class='panel-body']/child::div[@class='checkbox']//input"));

		System.out.println("tong so luong checkbox:" + lischeckbox.size());

		for (int i = 0; i < lischeckbox.size(); i++) {
			WebElement checkbox = lischeckbox.get(i);
			if (checkbox.isSelected() == true) {
				System.out.println("checkbox o vi tri " + (i + 1) + "da duoc check");
			} else {
				checkbox.click();
			}
			Thread.sleep(3000);
		}
	}

	@AfterClass
	public void closeChrome() {
		driver.close();
	}

}