package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateCountPage {
	
	private By welcomeLocator = By.xpath("//*[@id=\"center_column\"]/p"); 
	private WebDriver driver;
	
	public CreateCountPage(WebDriver driver) {
    	this.driver = driver;
    }
 
	public boolean displayPaginaWelcome() {
	 
	 return driver.findElement(welcomeLocator).isDisplayed();
	 //return true;
 }
 
}
