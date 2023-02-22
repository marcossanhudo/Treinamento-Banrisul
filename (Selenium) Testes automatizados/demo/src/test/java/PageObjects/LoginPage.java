package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class LoginPage {
	
	private WebDriver driver;
	private Waits wait;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new Waits(this.driver);
	}
	
	public WebElement getUsernameInput() {
		return this.driver.findElement(By.id("user-name"));
	}
	
	public WebElement getPasswordInput() {
		return this.driver.findElement(By.id("password"));
	}
	
	public WebElement getLoginButton() {
		return this.driver.findElement(By.id("login-button"));
	}
	
	public WebElement getTitle() {
		return wait.visibilityOfElement(By.xpath("//div[@id='root']/div/div[@class='login_logo']"));
	}
	
}
