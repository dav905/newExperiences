package test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.OrderPage;
import pages.ProductPage;

public class CompraTest {
	
	private WebDriver driver;
	ProductPage productPage;
	OrderPage orderPage;
	
	@Before
	public void setUp() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://automationpractice.com/index.php");
	     productPage = new ProductPage(driver);
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		productPage.compra();
		orderPage = new OrderPage(driver);
		assertTrue(orderPage.displayPagina());
	}



}
