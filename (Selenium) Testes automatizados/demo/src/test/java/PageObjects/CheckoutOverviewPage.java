package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CheckoutOverviewPage {

	private WebDriver driver;
	
	public CheckoutOverviewPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFinishButton() {
		return this.driver.findElement(By.id("finish"));
	}
}
