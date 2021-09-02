package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyCountPage {
	
	private By myConuntLocator = By.xpath("//*[@id=\"center_column\"]/h1");
	private WebDriver driver;
	
	 public MyCountPage(WebDriver driver) {
	    	this.driver = driver;
	    }
	 
	 public boolean displayMensaje() {
		 
		 return driver.findElement(myConuntLocator).isDisplayed();
	 }

}
