package test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.MyCountPage;

public class LoginTest {
	
	private WebDriver driver;
	LoginPage loginPage;
	MyCountPage myCountPage;

	@Before
	public void setUp() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://automationpractice.com/index.php");
	     loginPage = new LoginPage(driver);
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void login() throws InterruptedException {
		loginPage.login();
		myCountPage = new MyCountPage(driver);
		assertTrue(myCountPage.displayMensaje());
	}

}
