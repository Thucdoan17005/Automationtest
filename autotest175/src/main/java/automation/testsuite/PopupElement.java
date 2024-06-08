package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class PopupElement extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_SELENIUM_POPUP);
	}

	@Test
	public void PopupElent() throws InterruptedException {
		WebElement openPopup = driver.findElement(By.xpath("//div[@class='IconBox FlightSearchOccupancy__IconBox']"));
		openPopup.click();
		Thread.sleep(2000);

		WebElement increasE = driver.findElement(
				By.xpath("//span[@class='sc-pFZIQ gbgfMs' and @data-element-name='flight-occupancy-adult-increase']"));
		int add = 5;
		for (int i = 0; i < add; i++) {
			increasE.click();
			Thread.sleep(1000);
		}
		int decrease = 5;
		WebElement decreaseE = driver.findElement(
				By.xpath("//span[@class='sc-fubCfw irPtrP' and @data-element-name='flight-occupancy-adult-decrease']"));
		for (int i1 = 0; i1 < decrease; i1++) {
			decreaseE.click();
			Thread.sleep(1000);
		}

		WebElement continued = driver.findElement(By.xpath(
				"//span[@class='Spanstyled__SpanStyled-sc-16tp9kb-0 ecwFCQ kite-js-Span Box-sc-kv6pi1-0 jJvGxG']"));
		continued.click();
		Thread.sleep(2000);
		
		WebElement closePopup = driver.findElement(By.xpath("//div[@class='IconBox FlightSearchOccupancy__IconBox']"));
		openPopup.click();
		Thread.sleep(2000);
	}

	@AfterClass
	public void closeChrome() {
		driver.close();
	}
}
