package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class Test_pacti_elementID extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_ALADA);
	}

	@Test

	public void LocatceElementID() {
		WebElement usernameElement = driver.findElement(By.id("txtLoginUsername"));

	}
	@Test
	public void LocatceElementNAM() {
		WebElement passwodElement = driver.findElement(By.name("txtLoginPassword"));

	}
	
	@Test
	public void LocatceElementClassnam() {
		WebElement linknham = driver.findElement(By.className("link_register"));
	}
	
	@Test
	public void LocatceElementTagnam() {
		WebElement button = driver.findElement(By.tagName("button"));
	}
	
	@Test
	public void LocatceElementlinktxt() {
		WebElement txtx = driver.findElement(By.linkText("Đăng nhập cho giảng viên"));
	}
	
	@Test
	public void LocatceElementlink() {
		WebElement dangnhap = driver.findElement(By.partialLinkText("giảng viên"));
	}
	
}
