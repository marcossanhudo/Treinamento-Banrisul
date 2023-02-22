package Validations;

import PageObjects.GenericPage;
import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import org.junit.jupiter.api.Assertions;

public class GenericValidation {
	
	private WebDriver driver;
	private GenericPage genericPage;
	private Waits wait;

	public GenericValidation(WebDriver driver) {
		this.driver = driver;
		this.genericPage = new GenericPage(this.driver);
		this.wait = new Waits(this.driver);
	}
	
	public void validatePageTitle(String expectedPageTitle) {
		try {
			wait.loadElement(genericPage.getPageTitle());
			Assertions.assertEquals(expectedPageTitle, genericPage.getPageTitle().getText());
			Report.log(Status.PASS, "Acessou com sucesso a página " + expectedPageTitle + ".", Screenshot.captureFile(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureFile(driver));
		}
	}
	
	public void validateProductName() {
		try {
			wait.loadElement(genericPage.getProductName());
			Assertions.assertEquals("Sauce Labs Backpack", genericPage.getProductName().getText());
			Report.log(Status.PASS, "Produto renderizado.", Screenshot.captureFile(driver));
			Report.log(Status.INFO, "Encontrou com sucesso o item \"" + genericPage.getProductName().getText() + "\".");
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureFile(driver));
		}
	}
	
	/*public void validateProductsPageTitle() {
		try {
			wait.loadElement(genericPage.getPageTitle());
			Assertions.assertEquals("PRODUCTS", genericPage.getPageTitle().getText());
			Report.log(Status.PASS, "Acessou com sucesso a página \"" + genericPage.getPageTitle().getText() + "\".", Screenshot.captureFile(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureFile(driver));
		}
	}
	
	public void validatePageTitle(String expectedPageTitle) {
		try {
			wait.loadElement(genericPage.getPageTitle());
			Assertions.assertEquals(expectedPageTitle, genericPage.getPageTitle().getText());
			Report.log(Status.PASS, "Acessou com sucesso a página " + expectedPageTitle + ".", Screenshot.captureFile(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureFile(driver));
		}
	}
	
	public void validateCartPageTitle() {
		try {
			wait.loadElement(genericPage.getPageTitle());
			Assertions.assertEquals("YOUR CART", genericPage.getPageTitle().getText());
			Report.log(Status.PASS, "Acesso com sucesso a página \"" + genericPage.getPageTitle().getText() + "\".", Screenshot.captureFile(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureFile(driver));
		}
	}
	
	public void validateProductName() {
		try {
			wait.loadElement(genericPage.getProductName());
			Assertions.assertEquals("Sauce Labs Backpack", genericPage.getProductName().getText());
			Report.log(Status.PASS, "Produto renderizado.", Screenshot.captureFile(driver));
			Report.log(Status.INFO, "Encontrou com sucesso o item \"" + genericPage.getProductName().getText() + "\".");
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureFile(driver));
		}
	}
	
	public void validateCheckoutYourInformationPageTitle() {
		try {
			wait.loadElement(genericPage.getPageTitle());
			Assertions.assertEquals("CHECKOUT: YOUR INFORMATION", genericPage.getPageTitle().getText());
			Report.log(Status.PASS, "Acessou com sucesso a página \"" + genericPage.getPageTitle().getText() + "\".", Screenshot.captureFile(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureFile(driver));
		}
	}
	
	public void validateCheckoutOverviewPageTitle() {
		try {
			wait.loadElement(genericPage.getPageTitle());
			Assertions.assertEquals("CHECKOUT: OVERVIEW", genericPage.getPageTitle().getText());
			Report.log(Status.PASS, "Acessou com sucesso a página \"" + genericPage.getPageTitle().getText() + "\".", Screenshot.captureFile(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureFile(driver));
		}
	}
	
	public void validateCheckoutCompletePageTitle() {
		try {
			wait.loadElement(genericPage.getPageTitle());
			Assertions.assertEquals("CHECKOUT: COMPLETE!", genericPage.getPageTitle().getText());
			Report.log(Status.PASS, "Acessou com sucesso a página \"" + genericPage.getPageTitle().getText() + "\".", Screenshot.captureFile(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureFile(driver));
		}
	}*/
	
}
