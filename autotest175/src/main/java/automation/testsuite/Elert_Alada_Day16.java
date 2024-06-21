package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class Elert_Alada_Day16 extends CommonBase{
	@BeforeMethod 
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_ALADA);
	}
	@Test
	public void Login() {
		type(By.id("txtLoginUsername"), "thucdoan1705@gmail.com");
		type(By.id("txtLoginPassword"), "d4nHfrGV2633TvT");
		click(By.xpath("//button[text()='ĐĂNG NHẬP' and @type='submit']"));
	}
	
	@Test
	public void editInfor() {
		//login
		type(By.id("txtLoginUsername"), "thucdoan1705@gmail.com");
		type(By.id("txtLoginPassword"), "d4nHfrGV2633TvT");
		click(By.xpath("//button[text()='ĐĂNG NHẬP' and @type='submit']"));
		//edit
		click(By.xpath("//div[@class='avatar2']"));
		click(By.xpath("//a[@class='fs14']"));
		
		WebElement element = driver.findElement(By.xpath("//div[@class='ptitlegv'][2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element); 
		
		WebElement passCurrent= getElementPresentDOM(By.id("txtpassword"));
		type(By.id("txtpassword"), "d4nHfrGV2633TvT");
		passCurrent.sendKeys(Keys.TAB);
		WebElement passNew= getElementPresentDOM(By.id("txtnewpass"));
		type(By.id("txtnewpass"), "d4nHfrGV2633TvT");
		passCurrent.sendKeys(Keys.TAB);
		WebElement passreNew= getElementPresentDOM(By.id("txtrenewpass"));
		type(By.id("txtrenewpass"), "d4nHfrGV2633TvT");
		click(By.xpath("//button[text()='Lưu mật khẩu mới']"));
		pause(2000);
		String msgSuccess= driver.switchTo().alert().getText();
		assertEquals(msgSuccess, "Cập nhật mật khẩu mới thành công!");
		driver.switchTo().alert().accept();
		//get title
		String pageTitle = driver.getCurrentUrl().substring(8);
		assertEquals(pageTitle, "alada.vn/thong-tin-ca-nhan");
        System.out.println("Page Title: " + pageTitle);
        
	}
}
