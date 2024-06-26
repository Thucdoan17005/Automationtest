package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class Day17_IfameHandle extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_IFAME);
	}

	@Test
	public void Iframe() {
		pause(10000);
		int totalIframe = driver.findElements(By.tagName("iframe")).size();
		System.out.println("tong so iframe :" + totalIframe);
		for (int i = 0; i < totalIframe; i++) {
			driver.switchTo().frame(i);
			int elementGuingay = driver
					.findElements(By.xpath("(//button[@class='btn btn-primary base-button button-send-now'])[1]"))
					.size();
			if (elementGuingay != 0) {
				System.out.println("iframe can tim o vi tri :" + i);
			}
			driver.switchTo().defaultContent();
		}
	}

	@Test
	public void findIframe() {
		pause(10000);
		scrollToElement(By.xpath("//h2[contains(text(), 'nghề nghiệp về AWS/Kiểm thử/Lập trình web')]"));
		driver.switchTo().frame(1);
		type(By.id("name"), "Thu");
		type(By.id("phone_number"), "12345678");
		click(By.xpath("(//button[@class='btn btn-primary base-button button-send-now'])[1]"));
		assertTrue(isElementPresent(By.xpath("(//button[@class='btn btn-primary base-button button-send-now'])[1]")));
	}

}
