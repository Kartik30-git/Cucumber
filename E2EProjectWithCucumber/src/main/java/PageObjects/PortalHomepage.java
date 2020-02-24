package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalHomepage {
	//This page appears after login
	
	public WebDriver driver;

	By searchBox = By.xpath("//input[@name=\"query\"]");

	public PortalHomepage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearchBox() {
		return driver.findElement(searchBox);
	}

}
