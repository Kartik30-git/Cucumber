package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By signIn = By.cssSelector("a[href*='sign_in']"); // a regex type css selector
	By title = By.xpath("//div[@class=\"text-center\"]/h2");
	By navBar = By.cssSelector("nav.navbar-collapse.collapse");
	By popup = By.xpath("//button[text()='NO THANKS']"); // to handle cases when pop up displays before clicking on
															// login link on homepage

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement loginElement() {
		return driver.findElement(signIn);
	}

	public WebElement titleElement() {
		return driver.findElement(title);
	}

	public WebElement navElement() {
		return driver.findElement(navBar);
	}

	public int getPopUpSize() {
		return driver.findElements(popup).size();
	}
	public WebElement getPopUp() {
		return driver.findElement(popup);
	}
}
