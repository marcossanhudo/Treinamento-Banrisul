package Validations;

import PageObjects.CheckoutYourInformationPage;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Report.Report;
import Framework.Report.Screenshot;
import Framework.Utils.FileOperation;

import org.junit.jupiter.api.Assertions;

public class CheckoutValidation {

	private WebDriver driver;
	private CheckoutYourInformationPage checkoutYourInformationPage;
	
	public CheckoutValidation(WebDriver driver) {
		this.driver = driver;
		this.checkoutYourInformationPage = new CheckoutYourInformationPage(this.driver);
	}
	
	public void validateFormFilling() {
		try {
			Assertions.assertFalse(checkoutYourInformationPage.getFirstNameInput().getAttribute("value")
				.equalsIgnoreCase(" ")
				);
			Report.log(Status.PASS, "Preencheu corretamente os campos de informação para checkout.", Screenshot.captureFile(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureFile(driver));
		}	
	}
	
	public void props_validateFormFilling() {
		try {
			Assertions.assertEquals(FileOperation.getProperties("form").getProperty("firstName"), checkoutYourInformationPage.getFirstNameInput().getAttribute("value"));
			Assertions.assertEquals(FileOperation.getProperties("form").getProperty("lastName"), checkoutYourInformationPage.getLastNameInput().getAttribute("value"));
			Assertions.assertEquals(FileOperation.getProperties("form").getProperty("postalCode"), checkoutYourInformationPage.getPostalCodeInput().getAttribute("value"));
			Report.log(Status.PASS, "Preencheu corretamente os campos de informação para checkout.", Screenshot.captureFile(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureFile(driver));
		}	
	}
	
}
