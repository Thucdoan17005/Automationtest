package automation.bepantoan.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CT_PagURL;
import automation.common.CommonBase;
import automation.page.MuangayPageFactory;

public class Muangay<TimeOutException> extends CommonBase {
	@BeforeMethod
	@Parameters("brower")
	public void openBrower(@Optional("edge") String browerName) {
		setupDriver(browerName);
		driver.get(CT_PagURL.URL_BEPANTOAN);
	}

	@Test
	public void select_Hangsx() {
		click(By.xpath("//a[text()=' Bếp Từ ']"));
		pause(3000);
		String pageurl = driver.getCurrentUrl();
		System.out.println("PageUrl: " + pageurl);
		assertEquals(pageurl, "https://bepantoan.vn/danh-muc/bep-tu");
		pause(2000);
		click(By.xpath("(//a[@class='text-gold-100 text-sm see-more mt-4 inline-block'])[1]"));
		click(By.xpath(
				"(//a[@class='h-[42px] flex justify-center items-center border border-grey-200 rounded-[4px] md:p-[6px] p-[4px]'])[14]"));
		pause(2000);
		String pageurlhsx = driver.getCurrentUrl();
		System.out.println("PageUrl: " + pageurlhsx);
		pause(2000);
		String title = driver.findElement(By.xpath("//h2[text()='Bếp từ Chefs']")).getText().toUpperCase();
		System.out.println("Title: " + title);
		assertEquals(title, "BẾP TỪ CHEFS");
		pause(1000);
		WebElement namepr = driver.findElement(By.xpath("//h4[text()='Bếp từ Chefs EH-DIH366 (New)']"));
		String nameproduct = namepr.getText().toUpperCase();
		System.out.println("Nameproduct: " + nameproduct);
		pause(1000);
		click(By.xpath("(//div[@class='aspect-w-1 aspect-h-1'])[1]"));
		assertEquals(nameproduct, "BẾP TỪ CHEFS EH-DIH366 (NEW)");
		pause(2000);
		click(By.xpath(
				"//a[@class='flex-col justify-center w-full py-1 mb-2 md:px-5 xl:px-2 btn btn-large btn-linear btn-linear-red']"));
		pause(2000);
		String checkoutpage = driver.getCurrentUrl();
		System.out.println("Checkoutpage :" + checkoutpage);
		pause(2000);
		WebElement sl = driver.findElement(By.xpath(
				"(//div[@class='lg:inline-flex hidden items-center justify-center absolute w-[28px] h-[28px] bg-[#ff3700] text-white rounded-full font-medium text-[13px] top-[-42%] right-[-42%] pt-[]2px]'])[1]"));
		String slproduct = sl.getText();
		pause(2000);
		System.out.println("Totalproduct: " + slproduct);
		WebElement price = driver
				.findElement(By.xpath("//span[@class='block mb-1 text-sm font-medium xl:text-base text-grey-800']"));
		String pricepr = price.getText();
		String prString = pricepr.substring(0, pricepr.length() - 2);
		pause(1000);
		System.out.println("Total price: " + prString);
		pause(2000);
		type(By.xpath("//input[@placeholder='Nhập họ và tên']"), "");
		type(By.xpath("//input[@placeholder='Nhập số điện thoại']"), "");
		type(By.xpath("//input[@placeholder='Nhập số nhà, tên đường, phường/ xã, quận/huyện, tỉnh/ thành phố']"), "");
		click(By.xpath("//button[@class='justify-center w-full uppercase btn btn-large btn-linear btn-linear-red']"));

		assertTrue(driver
				.findElement(By.xpath("(//small[@class='absolute text-xs leading-3 text-maroon-600 mt-[6px] '])[1]"))
				.isDisplayed());
		assertTrue(driver
				.findElement(By.xpath("(//small[@class='absolute text-xs leading-3 text-maroon-600 mt-[6px] '])[2]"))
				.isDisplayed());
		assertTrue(driver
				.findElement(By.xpath("(//small[@class='absolute text-xs leading-3 text-maroon-600 mt-[6px] '])[3]"))
				.isDisplayed());
	}
	
	@Test
	public void select_Mucgia() {
		click(By.xpath("//a[text()=' Bếp Từ ']"));
		pause(3000);
		String pageurl = driver.getCurrentUrl();
		System.out.println("PageUrl: " + pageurl);
		assertEquals(pageurl, "https://bepantoan.vn/danh-muc/bep-tu");
		pause(2000);
		//click(By.xpath("(//a[@class='text-gold-100 text-sm see-more mt-4 inline-block'])[1]"));
		click(By.xpath(
				"//span[text()[normalize-space() = '< 3.000.000']]"));
		pause(2000);
		String pageurlmg = driver.getCurrentUrl();
		System.out.println("PageUrl: " + pageurlmg);
		pause(2000);
//		String category = driver.findElement(By.xpath("//a[text()='Phổ biến']']")).getText();
//		//System.out.println("Title: " + category);
//		assertEquals(category, "Phổ biến");
		pause(1000);
		WebElement namepr = driver.findElement(By.xpath("//h4[text()='Bếp từ đơn BOSCH PC90']"));
		String nameproduct = namepr.getText().toUpperCase();
		System.out.println("Nameproduct: " + nameproduct);
		pause(1000);
		click(By.xpath("(//div[@class='aspect-w-1 aspect-h-1'])[1]"));
		assertEquals(nameproduct, "BẾP TỪ ĐƠN BOSCH PC90");
		pause(2000);
		click(By.xpath(
				"//a[@class='flex-col justify-center w-full py-1 mb-2 md:px-5 xl:px-2 btn btn-large btn-linear btn-linear-red']"));
		pause(2000);
		String checkoutpage = driver.getCurrentUrl();
		System.out.println("Checkoutpage :" + checkoutpage);
		pause(2000);
		WebElement sl = driver.findElement(By.xpath(
				"(//div[@class='lg:inline-flex hidden items-center justify-center absolute w-[28px] h-[28px] bg-[#ff3700] text-white rounded-full font-medium text-[13px] top-[-42%] right-[-42%] pt-[]2px]'])[1]"));
		String slproduct = sl.getText();
		pause(2000);
		System.out.println("Totalproduct: " + slproduct);
		WebElement price = driver
				.findElement(By.xpath("//span[@class='block mb-1 text-sm font-medium xl:text-base text-grey-800']"));
		String pricepr = price.getText();
		String prString = pricepr.substring(0, pricepr.length() - 2);
		pause(1000);
		System.out.println("Total price: " + prString);
		pause(2000);
		type(By.xpath("//input[@placeholder='Nhập họ và tên']"), "");
		type(By.xpath("//input[@placeholder='Nhập số điện thoại']"), "");
		type(By.xpath("//input[@placeholder='Nhập số nhà, tên đường, phường/ xã, quận/huyện, tỉnh/ thành phố']"), "");
		click(By.xpath("//button[@class='justify-center w-full uppercase btn btn-large btn-linear btn-linear-red']"));

		assertTrue(driver
				.findElement(By.xpath("(//small[@class='absolute text-xs leading-3 text-maroon-600 mt-[6px] '])[1]"))
				.isDisplayed());
		assertTrue(driver
				.findElement(By.xpath("(//small[@class='absolute text-xs leading-3 text-maroon-600 mt-[6px] '])[2]"))
				.isDisplayed());
		assertTrue(driver
				.findElement(By.xpath("(//small[@class='absolute text-xs leading-3 text-maroon-600 mt-[6px] '])[3]"))
				.isDisplayed());
	}
	
	@Test
	public void select_Xuatxu() {
		click(By.xpath("//a[text()=' Bếp Từ ']"));
		pause(3000);
		String pageurl = driver.getCurrentUrl();
		System.out.println("PageUrl: " + pageurl);
		assertEquals(pageurl, "https://bepantoan.vn/danh-muc/bep-tu");
		pause(2000);
		scrollToElement(By.xpath("//h3[text()='Xuất xứ']"));
		click(By.xpath("(//a[@class='text-gold-100 text-sm see-more mt-4 inline-block'])[2]"));
		pause(2000);
		WebElement check = driver.findElement(By.xpath("(//label[@class='inline-flex items-center cursor-pointer'])[1]"));
		if (check.isEnabled()==true&& check.isSelected()==false) {
			check.click();
			String pageurxx1 = driver.getCurrentUrl();
			System.out.println("PageUrl1: " + pageurxx1);
			String msg = driver.findElement(By.xpath("//span[text()='Rất tiếc, không tìm thấy sản phẩm phù hợp với lựa chọn của bạn']")).getText();
			System.out.println("Msg : " + msg);
			assertEquals(msg, "Rất tiếc, không tìm thấy sản phẩm phù hợp với lựa chọn của bạn");
		}
		if(check.isEnabled()==true && check.isSelected()==true ){
			check.click();
			String pageurxx2 = driver.getCurrentUrl();
			System.out.println("PageUrl2: " + pageurxx2);
		}
		click(By.xpath("(//label[@class='inline-flex items-center cursor-pointer'])[14]"));
		String pageurxx3 = driver.getCurrentUrl();
		System.out.println("PageUrl1: " + pageurxx3);
		pause(1000);
		click(By.xpath("//a[@class='text-gold-100 text-sm see-more mt-4 inline-block active']"));
	}
	
	@Test
	public void select_Sobep() {
		click(By.xpath("//a[text()=' Bếp Từ ']"));
		pause(3000);
		String pageurl = driver.getCurrentUrl();
		System.out.println("PageUrl: " + pageurl);
		assertEquals(pageurl, "https://bepantoan.vn/danh-muc/bep-tu");
		pause(2000);
		scrollToElement(By.xpath("//h3[text()='Số bếp']"));
		click(By.xpath("(//a[@class='text-gold-100 text-sm see-more mt-4 inline-block'])[3]"));
		pause(2000);
		WebElement check= getElementPresentDOM(By.xpath("//input[@name='6-bep-1014']"));
		if (check.isEnabled()==true&& check.isSelected()==false) {
			check.click();
			String pageurxx1 = driver.getCurrentUrl();
			System.out.println("PageUrl1: " + pageurxx1);
		}
//		if(check.isEnabled()==true && check.isSelected()==true ){
//			check.click();
//			String pageurxx2 = driver.getCurrentUrl();
//			System.out.println("PageUrl2: " + pageurxx2);
//		}
		click(By.xpath("(//label[@class='inline-flex items-center cursor-pointer'])[34]"));
		String pageurxx3 = driver.getCurrentUrl();
		System.out.println("PageUrl1: " + pageurxx3);
		pause(1000);
		click(By.xpath("//a[@class='text-gold-100 text-sm see-more mt-4 inline-block active']"));
	}
	
	@Test
	public void select_PhanLoai() {
		click(By.xpath("//a[text()=' Bếp Từ ']"));
		pause(3000);
		String pageurl = driver.getCurrentUrl();
		System.out.println("PageUrl: " + pageurl);
		assertEquals(pageurl, "https://bepantoan.vn/danh-muc/bep-tu");
		pause(2000);
		scrollToElement(By.xpath("//h3[text()='Phân loại']"));
		pause(1000);
		WebElement check = driver.findElement(By.xpath("(//label[@class='inline-flex items-center cursor-pointer'])[42]"));
		if (check.isEnabled()==true&& check.isSelected()==false) {
			check.click();
			String pageurxx1 = driver.getCurrentUrl();
			System.out.println("PageUrl1: " + pageurxx1);
		}
//		if(check.isEnabled()==true && check.isSelected()==true ){
//			check.click();
//			String pageurxx2 = driver.getCurrentUrl();
//			System.out.println("PageUrl2: " + pageurxx2);
//		}
		click(By.xpath("(//label[@class='inline-flex items-center cursor-pointer'])[40]"));
		String pageurxx3 = driver.getCurrentUrl();
		System.out.println("PageUrl2: " + pageurxx3);
	}
	
	@Test
	public void select_Options() {
		click(By.xpath("//a[text()=' Bếp Từ ']"));
		pause(3000);
		String pageurl = driver.getCurrentUrl();
		System.out.println("PageUrl: " + pageurl);
		assertEquals(pageurl, "https://bepantoan.vn/danh-muc/bep-tu");
		pause(2000);
		scrollToElement(By.xpath("//h3[text()='Phân loại']"));
		pause(1000);
		WebElement check = driver.findElement(By.xpath("(//label[@class='inline-flex items-center cursor-pointer'])[42]"));
		if (check.isEnabled()==true&& check.isSelected()==false) {
			check.click();
			String pageurxx1 = driver.getCurrentUrl();
			System.out.println("PageUrl1: " + pageurxx1);
		}
//		if(check.isEnabled()==true && check.isSelected()==true ){
//			check.click();
//			String pageurxx2 = driver.getCurrentUrl();
//			System.out.println("PageUrl2: " + pageurxx2);
//		}
		click(By.xpath("(//label[@class='inline-flex items-center cursor-pointer'])[40]"));
		String pageurxx3 = driver.getCurrentUrl();
		System.out.println("PageUrl2: " + pageurxx3);
	}

	@Test
	public void Thanhtoan_onepr_pass() {
		click(By.xpath("//a[text()=' Bếp Từ ']"));
		pause(3000);
		String pageurl = driver.getCurrentUrl();
		System.out.println("PageUrl: " + pageurl);
		assertEquals(pageurl, "https://bepantoan.vn/danh-muc/bep-tu");
		pause(2000);
		WebElement namepr = driver.findElement(By.xpath("//h4[text()='BẾP TỪ ĐÔI KAINER KA-265']"));
		String nameproduct = namepr.getText();
		System.out.println("Nameproduct: " + nameproduct);

		click(By.xpath("(//div[@class='aspect-w-1 aspect-h-1'])[1]"));
		assertEquals(nameproduct, "BẾP TỪ ĐÔI KAINER KA-265");
//		WebElement giapr = driver.findElement(By.xpath("(//div[@class= 'flex items-center'])[1]"));
//		String giaproduct = giapr.getText();
//		System.out.println("Giaproduct: " +giaproduct);

//		pause(2qqqqqqqqq000);
		click(By.xpath(
				"//a[@class='flex-col justify-center w-full py-1 mb-2 md:px-5 xl:px-2 btn btn-large btn-linear btn-linear-red']"));
		pause(2000);
		String checkoutpage = driver.getCurrentUrl();
		System.out.println("Checkoutpage :" + checkoutpage);
		pause(2000);
		WebElement sl = driver.findElement(By.xpath(
				"(//div[@class='lg:inline-flex hidden items-center justify-center absolute w-[28px] h-[28px] bg-[#ff3700] text-white rounded-full font-medium text-[13px] top-[-42%] right-[-42%] pt-[]2px]'])[1]"));
		String slproduct = sl.getText();
		pause(2000);
		System.out.println("Totalproduct: " + slproduct);
		WebElement price = driver
				.findElement(By.xpath("//span[@class='block mb-1 text-sm font-medium xl:text-base text-grey-800']"));
		String pricepr = price.getText();
		String prString = pricepr.substring(0, pricepr.length() - 2);
		pause(1000);
		System.out.println("Total price: " + prString);
		pause(2000);
		type(By.xpath("//input[@placeholder='Nhập họ và tên']"), "thu");
		type(By.xpath("//input[@placeholder='Nhập số điện thoại']"), "0369852147");
		type(By.xpath("//input[@placeholder='Nhập số nhà, tên đường, phường/ xã, quận/huyện, tỉnh/ thành phố']"),
				"ha noi");
		click(By.xpath("//button[@class='justify-center w-full uppercase btn btn-large btn-linear btn-linear-red']"));
	}
	
	@Test
	public void Thanhtoan_onepr_fail() {
		click(By.xpath("//a[text()=' Bếp Từ ']"));
		pause(3000);
		String pageurl = driver.getCurrentUrl();
		System.out.println("PageUrl: " + pageurl);
		assertEquals(pageurl, "https://bepantoan.vn/danh-muc/bep-tu");
		pause(2000);
		WebElement namepr = driver.findElement(By.xpath("//h4[text()='BẾP TỪ ĐÔI KAINER KA-265']"));
		String nameproduct = namepr.getText();
		System.out.println("Nameproduct: " + nameproduct);

		click(By.xpath("(//div[@class='aspect-w-1 aspect-h-1'])[1]"));
		assertEquals(nameproduct, "BẾP TỪ ĐÔI KAINER KA-265");
//		WebElement giapr = driver.findElement(By.xpath("(//div[@class= 'flex items-center'])[1]"));
//		String giaproduct = giapr.getText();
//		System.out.println("Giaproduct: " +giaproduct);

		pause(2000);
		click(By.xpath(
				"//a[@class='flex-col justify-center w-full py-1 mb-2 md:px-5 xl:px-2 btn btn-large btn-linear btn-linear-red']"));
		pause(2000);
		String checkoutpage = driver.getCurrentUrl();
		System.out.println("Checkoutpage :" + checkoutpage);
		pause(2000);
		WebElement sl = driver.findElement(By.xpath(
				"(//div[@class='lg:inline-flex hidden items-center justify-center absolute w-[28px] h-[28px] bg-[#ff3700] text-white rounded-full font-medium text-[13px] top-[-42%] right-[-42%] pt-[]2px]'])[1]"));
		String slproduct = sl.getText();
		pause(2000);
		System.out.println("Totalproduct: " + slproduct);
		WebElement price = driver
				.findElement(By.xpath("//span[@class='block mb-1 text-sm font-medium xl:text-base text-grey-800']"));
		String pricepr = price.getText();
		String prString = pricepr.substring(0, pricepr.length() - 2);
		pause(1000);
		System.out.println("Total price: " + prString);
		pause(2000);
		type(By.xpath("//input[@placeholder='Nhập họ và tên']"), "");
		type(By.xpath("//input[@placeholder='Nhập số điện thoại']"), "");
		type(By.xpath("//input[@placeholder='Nhập số nhà, tên đường, phường/ xã, quận/huyện, tỉnh/ thành phố']"), "");
		click(By.xpath("//button[@class='justify-center w-full uppercase btn btn-large btn-linear btn-linear-red']"));

		assertTrue(driver
				.findElement(By.xpath("(//small[@class='absolute text-xs leading-3 text-maroon-600 mt-[6px] '])[1]"))
				.isDisplayed());
		assertTrue(driver
				.findElement(By.xpath("(//small[@class='absolute text-xs leading-3 text-maroon-600 mt-[6px] '])[2]"))
				.isDisplayed());
		assertTrue(driver
				.findElement(By.xpath("(//small[@class='absolute text-xs leading-3 text-maroon-600 mt-[6px] '])[3]"))
				.isDisplayed());
	}

	@Test
	public void Thanhtoan_twopr_pass() throws InterruptedException {
		click(By.xpath("//a[text()=' Bếp Từ ']"));
		pause(3000);
		String pageurl = driver.getCurrentUrl();
		System.out.println("PageUrl: " + pageurl);
		assertEquals(pageurl, "https://bepantoan.vn/danh-muc/bep-tu");
		pause(2000);
		WebElement namepr = driver.findElement(By.xpath("//h4[text()='BẾP TỪ ĐÔI KAINER KA-265']"));
		String nameproduct = namepr.getText();
		System.out.println("Nameproduct: " + nameproduct);

		click(By.xpath("(//div[@class='aspect-w-1 aspect-h-1'])[1]"));
		assertEquals(nameproduct, "BẾP TỪ ĐÔI KAINER KA-265");
		pause(2000);
		click(By.xpath(
				"//a[@class='flex-col justify-center w-full py-1 mb-2 md:px-5 xl:px-2 btn btn-large btn-linear btn-linear-red']"));
		
		click(By.xpath("//a[text()=' Bếp Từ ']"));
		pause(1000);
		WebElement namepr2 = driver.findElement(By.xpath("//h4[text()='BẾP TỪ ĐÔI KAINER KA-1006']"));
		String nameproduct2 = namepr2.getText();
		System.out.println("Nameproduct: " + nameproduct2);

		click(By.xpath("(//div[@class='aspect-w-1 aspect-h-1'])[2]"));
		assertEquals(nameproduct2, "BẾP TỪ ĐÔI KAINER KA-1006");
		pause(2000);
		click(By.xpath(
				"//a[@class='flex-col justify-center w-full py-1 mb-2 md:px-5 xl:px-2 btn btn-large btn-linear btn-linear-red']"));
		pause(2000);
		String checkoutpage = driver.getCurrentUrl();
		System.out.println("Checkoutpage :" + checkoutpage);
		pause(2000);
		WebElement sl = driver.findElement(By.xpath(
				"(//div[@class='lg:inline-flex hidden items-center justify-center absolute w-[28px] h-[28px] bg-[#ff3700] text-white rounded-full font-medium text-[13px] top-[-42%] right-[-42%] pt-[]2px]'])[1]"));
		String slproduct = sl.getText();
		pause(2000);
		System.out.println("Totalproduct: " + slproduct);
		
		WebElement pricea = driver
				.findElement(By.xpath("(//span[@class='block mb-1 text-sm font-medium xl:text-base text-grey-800'])[1]"));
		String pricepra = pricea.getText();
		String pra = pricepra.substring(0, pricepra.length() - 2);
		System.out.println("product1Price: " + pra);
		
		//double pria = parsePrice(pra);
		pause(1000);
		
		WebElement priceb = driver
				.findElement(By.xpath("(//span[@class='block mb-1 text-sm font-medium xl:text-base text-grey-800'])[2]"));
		String priceprb = priceb.getText();
		String prb = priceprb.substring(0, priceprb.length() - 2);
		System.out.println("product2Price: " + prb);
		
		//double prib = parsePrice(prb);
		pause(1000);
		//System.out.println("Total price: " + Totalprice);
		
//		WebElement pricet = driver
//				.findElement(By.xpath("//span[@class='block text-2xl font-medium text-maroon-500']"));
//		String priceprt = pricet.getText();
//		String prt = priceprt.substring(0, priceprt.length() - 2);
//		double prtt = parsePrice(priceprt);
//		System.out.println("Total: " + prtt);
//		assertEquals(Totalprice, prtt);
		
		type(By.xpath("//input[@placeholder='Nhập họ và tên']"), "thu");
		type(By.xpath("//input[@placeholder='Nhập số điện thoại']"), "0369852147");
		type(By.xpath("//input[@placeholder='Nhập số nhà, tên đường, phường/ xã, quận/huyện, tỉnh/ thành phố']"),
				"ha noi");
		click(By.xpath("//button[@class='justify-center w-full uppercase btn btn-large btn-linear btn-linear-red']"));
		pause(2000);
		String ordersc = driver.getCurrentUrl();
		System.out.println("Orderscpage :" + ordersc);
		Thread.sleep(5000);
		WebElement accountname= getElementPresentDOM(By.xpath("//span[text()='Mua Tiếp']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", accountname);
        //click(By.xpath("//span[text()='Mua Tiếp']"));
        
 
		String homepage = driver.getCurrentUrl();
		System.out.println("Homepage :" + homepage);
	}

}
