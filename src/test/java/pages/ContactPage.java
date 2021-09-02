package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactPage {
	
	private By contacLocator = By.xpath("//*[@id=\"contact-link\"]/a");
	private By subjectLocator = By.name("id_contact");
	private By emailContacLocator = By.cssSelector("input[id='email']");
	private By messagecLocator = By.cssSelector("textarea[id='message']");
	private By sendLocator = By.xpath("//*[@id=\"submitMessage\"]");
	private By confirmSendLocator = By.xpath("//*[@id=\"center_column\"]/p");


    private WebDriver driver;
    
    
    public ContactPage(WebDriver driver) {
    	this.driver = driver;
    }
	
	public void contactenos() throws InterruptedException {
		
		driver.findElement(contacLocator).click();
    	Thread.sleep(2000);
    	if (driver.findElement(messagecLocator).isDisplayed()) {
    		
    		WebElement sub=driver.findElement(subjectLocator);
	        Select sel=new Select(sub);
	        sel.selectByVisibleText("Webmaster");
	        driver.findElement(emailContacLocator).sendKeys("kiplin@gmail.com");
	        driver.findElement(messagecLocator).sendKeys("Abc 123 %&/");
	        driver.findElement(sendLocator).click();
	        
	        
    	}
		
	}
	
	public boolean displayPaginaContact() {
		return driver.findElement(confirmSendLocator).isDisplayed();
		
	}
	
	
}



