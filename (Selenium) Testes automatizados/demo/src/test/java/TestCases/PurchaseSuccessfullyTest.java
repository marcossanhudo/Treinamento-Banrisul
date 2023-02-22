package TestCases;

import Tasks.*;
import Framework.TestBase;
import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class PurchaseSuccessfullyTest extends TestBase {
	
	private WebDriver driver = super.getDriverFromDriverManager();
	
	LoginTask loginTask = new LoginTask(driver);
	AddToCartTask addToCartTask = new AddToCartTask(driver);
	StartCheckoutTask startCheckoutTask = new StartCheckoutTask(driver);
	CheckoutFillInformationTask checkoutFillInformationTask = new CheckoutFillInformationTask(driver);
	CheckoutConfirmDetailsTask checkoutConfirmDetailsTask = new CheckoutConfirmDetailsTask(driver);
	LogoutTask logoutTask = new LogoutTask(driver);
	
	@Test
	@Tags({@Tag("regressão"), @Tag("positivo")})
	public void purchase() {
		try {
			
			Report.createTest("Realizar compra com sucesso", ReportType.GROUP);
			
			Report.createStep("Realizar login");
			loginTask.login();
			
			Report.createStep("Adicionar ao carrinho e visitar carrinho");
			addToCartTask.addItem4ToCartAndGoToCart();
			
			Report.createStep("Realizar checkout");
			startCheckoutTask.startCheckout();
			checkoutFillInformationTask.fillAllFieldsInAndContinue();
			checkoutConfirmDetailsTask.confirmDetails();
			
			Report.createStep("Realizar logout");
			logoutTask.logout();
			
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureFile(driver));
		}
	}
	
}
