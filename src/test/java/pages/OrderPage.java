package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
	
	private By orders = By.xpath("//*[@id=\"center_column\"]/h1");
	
	private WebDriver driver;    
    
    public OrderPage(WebDriver driver) {
    	this.driver = driver;
    }
	
    public boolean displayPagina() {
		return driver.findElement(orders).isDisplayed();
	}
}
