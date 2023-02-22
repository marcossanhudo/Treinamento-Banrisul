package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class AllItemsPage {

	private WebDriver driver;
	private Waits wait;
	
	public AllItemsPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new Waits(this.driver);
	}
	
	public WebElement getItem4AddToCartButton() {
		return this.driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	}
	
	public WebElement getCartLink() {
		return this.driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a[@class='shopping_cart_link']"));
	}
	
}
