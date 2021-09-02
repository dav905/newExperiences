package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	private By registerLinkLocator = By.linkText("Sign in");
	private By registerPage2Locator = By.id("email_create");
	private By emailLoginLocator = By.name("email");
	private By passLoginLocator = By.name("passwd");
	private By loginBtnLocator = By.name("SubmitLogin");
	private By back = By.xpath("//*[@id=\"header_logo\"]/a/img");
	
	private By addToCar = By.xpath(".//*[text()='Add to cart']");
	private By check = By.xpath(".//a[contains(@title,'Proceed to checkout')]");
	private By summary = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
	private By address = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
	private By shipping = By.xpath("//*[@id=\"form\"]/p/button");
	private By terms = By.xpath("//*[@id=\"cgv\"]");
	private By payBank = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div");
	private By confirm = By.xpath("//*[@id=\"cart_navigation\"]/button");
	private By viewOrders = By.xpath("//*[@id=\"center_column\"]/p/a");
	//private By orders = By.xpath("//*[@id=\"center_column\"]/h1");
	
	private WebDriver driver;    
    
    public ProductPage(WebDriver driver) {
    	this.driver = driver;
    }
    
    public void compra() throws InterruptedException {
        //Thread.sleep(5000);

        driver.findElement(registerLinkLocator).click();
        Thread.sleep(2000);
        if (driver.findElement(registerPage2Locator).isDisplayed()) {
            driver.findElement(emailLoginLocator).sendKeys("kiplin000@gmail.com");
            driver.findElement(passLoginLocator).sendKeys("12345");

            driver.findElement(loginBtnLocator).click();
            driver.findElement(back).click();

            driver.get("http://automationpractice.com/index.php?id_product=4&controller=product");
            driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
            driver.findElement(addToCar).click();;
            driver.findElement(check).click();
            driver.findElement(summary).click();
            driver.findElement(address).click();
            driver.findElement(terms).click();
            driver.findElement(shipping).click();
            driver.findElement(payBank).click();
            driver.findElement(confirm).click();
            driver.findElement(viewOrders).click();
            
        }
        
       
    }

}
