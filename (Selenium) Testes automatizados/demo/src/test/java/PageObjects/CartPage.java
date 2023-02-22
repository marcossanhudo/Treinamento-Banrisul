package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CartPage {

	private WebDriver driver;
	
	public CartPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCheckoutButton() {
		return this.driver.findElement(By.id("checkout"));
	}
	
}
