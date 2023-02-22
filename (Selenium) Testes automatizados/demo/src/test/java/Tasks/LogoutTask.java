package Tasks;

import PageObjects.CheckoutCompletePage;
import Framework.Browser.Waits;
import Validations.LoginValidation;

import org.openqa.selenium.WebDriver;

public class LogoutTask {

	private WebDriver driver;
	private Waits wait;
	private CheckoutCompletePage checkoutCompletePage;
	private LoginValidation loginValidation;
	
	public LogoutTask(WebDriver driver) {
		this.driver = driver;
		this.wait = new Waits(this.driver);
		this.checkoutCompletePage = new CheckoutCompletePage(this.driver);
		this.loginValidation = new LoginValidation(this.driver);
	}
	
	public void logout() {
		checkoutCompletePage.getSidebarButton()
			.click();
		wait.loadElement(checkoutCompletePage.getSidebarLogoutLink());
		checkoutCompletePage.getSidebarLogoutLink()
			.click();
		loginValidation.validateLoginPage();
	}
	
}
