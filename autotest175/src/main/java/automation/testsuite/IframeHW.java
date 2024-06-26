package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class IframeHW extends CommonBase {
	@BeforeMethod
	@Parameters("brower")
	public void openChrome(@Optional("edge") String browerName) {
		setupDriver(browerName);
		driver.get(CT_PagURL.URL_IFAMEHW);
	}

	@Test
	public void mediamartIframe() {
		pause(5000);
		int iframe = driver.findElements(By.tagName("iframe")).size();
		System.out.println("tong so iframe :" + iframe);
		for (int i = 0; i < iframe; i++) {
			driver.switchTo().frame(i);
			int elementzalo = driver.findElements(By.xpath("//div[@class='logo']")).size();
			if (elementzalo != 0) {
				System.out.println("iframe can tim o vi tri :" + i);
			}
			driver.switchTo().defaultContent();
		}
	}

	@Test
	public void findIframe() {
		pause(10000);
		driver.switchTo().frame(0);
		click(By.xpath("//div[@class='logo']"));
		assertTrue(isElementPresent(By.xpath("//p[@class='text-hint-welcome']")));
	}
}
