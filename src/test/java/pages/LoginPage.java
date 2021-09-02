package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private By registerLinkLocator = By.linkText("Sign in");
	private By registerPage2Locator = By.id("email_create");
	private By emailLoginLocator = By.name("email");
	private By passLoginLocator = By.name("passwd");
	private By loginBtnLocator = By.name("SubmitLogin");	
	
	//private By back = By.xpath("//*[@id=\"header_logo\"]/a/img");
	
	private WebDriver driver;
    
    
    public LoginPage(WebDriver driver) {
    	this.driver = driver;
    }
    
    public void login() throws InterruptedException {
    	
    	
    	 driver.findElement(registerLinkLocator).click();
         Thread.sleep(2000);
        if (driver.findElement(registerPage2Locator).isDisplayed()) {
        	driver.findElement(emailLoginLocator).sendKeys("kiplin000@gmail.com");
            driver.findElement(passLoginLocator).sendKeys("12345");

            driver.findElement(loginBtnLocator).click();
            //driver.findElement(back).click();
	    }
	
	}

}
