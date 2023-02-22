package Tasks;

import PageObjects.AllItemsPage;
import Validations.GenericValidation;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class AddToCartTask {

	private WebDriver driver;
	private AllItemsPage allItemsPage;
	private GenericValidation genericValidation;
	
	public AddToCartTask (WebDriver driver) {
		this.driver = driver;
		allItemsPage = new AllItemsPage(this.driver);
		genericValidation = new GenericValidation(this.driver);
	}
	
	public void addItem4ToCartAndGoToCart() {
		allItemsPage.getItem4AddToCartButton()
			.click();
		allItemsPage.getCartLink()
			.click();
		genericValidation.validatePageTitle("YOUR CART");
		genericValidation.validateProductName();
	}
	
}
