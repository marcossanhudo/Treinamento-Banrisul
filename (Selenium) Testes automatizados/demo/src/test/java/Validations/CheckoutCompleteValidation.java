package Validations;

import PageObjects.CheckoutCompletePage;
import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import org.junit.jupiter.api.Assertions;

public class CheckoutCompleteValidation {

	private WebDriver driver;
	private Waits wait;
	private CheckoutCompletePage checkoutCompletePage;
	
	public CheckoutCompleteValidation(WebDriver driver) {
		this.driver = driver;
		this.wait = new Waits(this.driver);
		this.checkoutCompletePage = new CheckoutCompletePage(this.driver);
	}
	
	public void validateThankYouMessage() {
		try {
			wait.loadElement(checkoutCompletePage.getThankYouMessage());
			Report.log(Status.PASS, "Leu com sucesso mensagem de agradecimento.", Screenshot.captureFile(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureFile(driver));
		}
	}
	
}
