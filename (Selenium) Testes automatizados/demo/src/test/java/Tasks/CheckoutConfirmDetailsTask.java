package Tasks;

import PageObjects.CheckoutOverviewPage;
import Validations.GenericValidation;
import org.openqa.selenium.WebDriver;

public class CheckoutConfirmDetailsTask {

	private WebDriver driver;
	private CheckoutOverviewPage checkoutOverviewPage;
	private GenericValidation genericValidation;
	
	public CheckoutConfirmDetailsTask(WebDriver driver) {
		this.driver = driver;
		this.checkoutOverviewPage = new CheckoutOverviewPage(this.driver);
		this.genericValidation = new GenericValidation(this.driver);
	}
	
	public void confirmDetails() {
		checkoutOverviewPage.getFinishButton()
			.click();
		genericValidation.validatePageTitle("CHECKOUT: COMPLETE!");
	}
	
}
