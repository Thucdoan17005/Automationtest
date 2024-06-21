package automation.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.RenderingHints.Key;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.common.CT_PagURL;
import automation.common.CommonBase;

public class HandleDatepicker extends CommonBase{
	@BeforeMethod
	public void openChrome() {
		driver = initDriverTest(CT_PagURL.URL_GURU);
	}
	@Test
	public void nhapNgaysinh() {
		WebElement datebox= getElementPresentDOM(By.xpath("//input[@name='bdaytime']"));
	type(By.xpath("//input[@name='bdaytime']"), "08252021");
	datebox.sendKeys(Keys.TAB);
	type(By.xpath("//input[@name='bdaytime']"), "245PM");
	}
}
