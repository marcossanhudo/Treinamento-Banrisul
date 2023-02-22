package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class GenericPage {

	private WebDriver driver;
	private Waits wait;
	
	public GenericPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new Waits(this.driver);
	}
	
	public WebElement getPageTitle() {
		return wait.visibilityOfElement(By.xpath("//div[@id='header_container']/div[@class='header_secondary_container']/span[@class='title']"));
	}
	
	public WebElement getProductName() {
		return wait.visibilityOfElement(By.className("inventory_item_name"));
	}
}
