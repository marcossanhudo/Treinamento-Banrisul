package Tasks;

import PageObjects.CartPage;
import Validations.GenericValidation;

import org.openqa.selenium.WebDriver;

public class StartCheckoutTask {

	private WebDriver driver;
	private CartPage cartPage;
	private GenericValidation genericValidation;
	
	public StartCheckoutTask(WebDriver driver) {
		this.driver = driver;
		this.cartPage = new CartPage(this.driver);
		this.genericValidation = new GenericValidation(this.driver);
	}
	
	public void startCheckout() {
		cartPage.getCheckoutButton()
			.click();
		genericValidation.validatePageTitle("CHECKOUT: YOUR INFORMATION");
	}
	
}
