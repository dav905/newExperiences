package pages;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistroPage {
	
	    private By registerLinkLocator = By.linkText("Sign in");
	    private By registerPage2Locator = By.id("email_create");

	    private By emailLocator = By.id("email_create");
	    private By registerBtnLocator = By.name("SubmitCreate");
	    private By loginPageLocator = By.className("navigation_page");
	    
	    private By fnLocator = By.cssSelector("input[id='customer_firstname']");//input[id='customer_firstname']
	    private By lnLocator = By.cssSelector("input[id='customer_lastname']");
	    private By passLocator = By.cssSelector("input[id='passwd']");
	    private By addessLocator = By.cssSelector("input[id='address1']");    
	    private By cityLocator = By.cssSelector("input[id='city']");
	    private By state = By.name("id_state");
	    private By codePostLocator = By.cssSelector("input[id='postcode']");
	    private By phoneLocator = By.cssSelector("input[id='phone_mobile']");
	    private By aliasLocator = By.cssSelector("input[id='alias']");
	    private By registerLocator = By.xpath("//*[@id=\"submitAccount\"]");
	     

	    private WebDriver driver;
	    
	    
	    public RegistroPage(WebDriver driver) {
	    	this.driver = driver;
	    }
	    
	    public void registro() throws InterruptedException {
	    	driver.findElement(registerLinkLocator).click();
	    	Thread.sleep(2000);
			if (driver.findElement(registerPage2Locator).isDisplayed()) {
				driver.findElement(emailLocator).sendKeys("kiplin004@gmail.com");
	            driver.findElement(registerBtnLocator).click();
	            
	            driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	            
	            WebElement listState=driver.findElement(state);	         
	            Select sel=new Select(listState);         
	            sel.selectByVisibleText("Alabama");       
	            driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		        
	            assertTrue(driver.findElement(loginPageLocator).isDisplayed());		       
	            driver.findElement(fnLocator).sendKeys("Pepito");
	            driver.findElement(lnLocator).sendKeys("Perez");
	            driver.findElement(passLocator).sendKeys("12345");
	            driver.findElement(addessLocator).sendKeys("Empresa");
	            driver.findElement(cityLocator).sendKeys("Cucuta");
	            driver.findElement(codePostLocator).sendKeys("54321");
	            driver.findElement(phoneLocator).sendKeys("310555555");
	            driver.findElement(aliasLocator).clear();
	            driver.findElement(aliasLocator).sendKeys("Direccion");
	            driver.findElement(registerLocator).click();//XX
	            
	          
	        }

   }
}
