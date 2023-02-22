package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CheckoutCompletePage {

	private WebDriver driver;
	
	public CheckoutCompletePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSidebarButton () {
		return this.driver.findElement(By.id("react-burger-menu-btn"));
	}
	
	public WebElement getSidebarLogoutLink() {
		return this.driver.findElement(By.id("logout_sidebar_link"));
	}
	
	public WebElement getThankYouMessage() {
		return this.driver.findElement(By.xpath("//div[@id='checkout_complete_container']/h2[@class='complete-header']"));
	}
	
}
