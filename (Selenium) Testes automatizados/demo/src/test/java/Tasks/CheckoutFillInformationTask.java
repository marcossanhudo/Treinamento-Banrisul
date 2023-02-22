package Tasks;

import PageObjects.CheckoutYourInformationPage;
import Framework.Utils.FakeGenerator;
import Framework.Utils.FileOperation;
import Validations.GenericValidation;
import Validations.CheckoutValidation;
import org.openqa.selenium.WebDriver;

public class CheckoutFillInformationTask {

	private WebDriver driver;
	private CheckoutYourInformationPage checkoutYourInformationPage;
	private FakeGenerator fakeGenerator;
	private GenericValidation genericValidation;
	private CheckoutValidation checkoutValidation;
	
	public CheckoutFillInformationTask(WebDriver driver) {
		this.driver = driver;
		this.checkoutYourInformationPage = new CheckoutYourInformationPage(this.driver);
		this.genericValidation = new GenericValidation(this.driver);
		this.checkoutValidation = new CheckoutValidation(this.driver);
		this.fakeGenerator = new FakeGenerator();
	}
	
	public void fillAllFieldsInAndContinue() {
		fillFirstNameIn();
		fillLastNameIn();
		fillPostalCodeIn();
		checkoutValidation.validateFormFilling();
		
		clickContinueButton();
		genericValidation.validatePageTitle("CHECKOUT: OVERVIEW");
		genericValidation.validateProductName();
	}
	
	public void props_fillAllFieldsInAndContinue() {
		props_fillFirstNameIn();
		props_fillLastNameIn();
		props_fillPostalCodeIn();
		checkoutValidation.props_validateFormFilling();
		
		clickContinueButton();
		genericValidation.validatePageTitle("CHECKOUT: OVERVIEW");
		genericValidation.validateProductName();
	}
	public void fillFirstNameIn() {
		checkoutYourInformationPage.getFirstNameInput()
			.sendKeys(fakeGenerator.getFirstName());
	}
	
	public void fillLastNameIn() {
		checkoutYourInformationPage.getLastNameInput()
			.sendKeys(fakeGenerator.getLastName());
	}
	
	public void fillPostalCodeIn() {
		checkoutYourInformationPage.getPostalCodeInput()
			.sendKeys(fakeGenerator.getPostalCode());
	}
	
	public void clickContinueButton() {
		checkoutYourInformationPage.getContinueButton()
			.click();
	}
	
	public void props_fillFirstNameIn() {
		String firstName = fakeGenerator.getFirstName();
		checkoutYourInformationPage.getFirstNameInput()
			.sendKeys(firstName);
		FileOperation.setProperties("form", "firstName", firstName);
	}
	
	public void props_fillLastNameIn() {
		String lastName = fakeGenerator.getLastName();
		checkoutYourInformationPage.getLastNameInput()
			.sendKeys(lastName);
		FileOperation.setProperties("form", "lastName", lastName);
	}
	
	public void props_fillPostalCodeIn() {
		String postalCode = fakeGenerator.getPostalCode();
		checkoutYourInformationPage.getPostalCodeInput()
			.sendKeys(postalCode);
		FileOperation.setProperties("form", "postalCode", postalCode);
	}
	
}
