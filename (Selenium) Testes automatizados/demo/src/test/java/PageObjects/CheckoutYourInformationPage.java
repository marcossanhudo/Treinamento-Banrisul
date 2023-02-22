package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutYourInformationPage {
	
	private WebDriver driver;
	
	public CheckoutYourInformationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFirstNameInput() {
		return this.driver.findElement(By.id("first-name"));
	}
	
	public WebElement getLastNameInput() {
		return this.driver.findElement(By.id("last-name"));
	}
	
	public WebElement getPostalCodeInput() {
		return this.driver.findElement(By.id("postal-code"));
	}
	
	public WebElement getContinueButton() {
		return this.driver.findElement(By.id("continue"));
	}
	
}
