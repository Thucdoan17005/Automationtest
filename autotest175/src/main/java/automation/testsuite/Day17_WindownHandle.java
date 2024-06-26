package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.*;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

@Test
public class Day17_WindownHandle extends CommonBase{
@BeforeMethod 
public void openChrome() {
	driver = initDriverTest(CT_PagURL.URL_GURU992);
}
public void WindowHandle() {
	click(By.xpath("//a[text()='Click Here']"));
	String mainWindown = driver.getWindowHandle();
	Set<String> listWindown = driver.getWindowHandles();
	for (String windownItem : listWindown) {
		if (!windownItem.equals(mainWindown)) {
			driver.switchTo().window(windownItem);
			type(By.name("emailid"), "thuc@gmail.com");
			click(By.name("btnLogin"));
			assertTrue(isElementPresent(By.xpath("//h2[text()='Access details to demo site.']")));
			driver.close();
		}
	}
	driver.switchTo().window(mainWindown);
	System.out.println("Da nhan vafo windown");
	
}
}
