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
import org.junit.jupiter.params.provider.MethodSource;

public class PurchaseSuccessfullyWithDataClassesTest extends TestBase {
	
	private WebDriver driver = super.getDriverFromDriverManager();
	
	LoginTask loginTask = new LoginTask(driver);
	AddToCartTask addToCartTask = new AddToCartTask(driver);
	StartCheckoutTask startCheckoutTask = new StartCheckoutTask(driver);
	CheckoutFillInformationTask checkoutFillInformationTask = new CheckoutFillInformationTask(driver);
	CheckoutConfirmDetailsTask checkoutConfirmDetailsTask = new CheckoutConfirmDetailsTask(driver);
	LogoutTask logoutTask = new LogoutTask(driver);
	
	@ParameterizedTest
	@Tags({@Tag("regressão"), @Tag("positivo")})
	@MethodSource("Framework.Utils.DataClass#loginTestData")
	public void purchase(String user, String password) {
		try {
			
			Report.createTest("(DataClasses) Realizar compra com sucesso", ReportType.GROUP);
			
			Report.createStep("Realizar login");
			loginTask.login(user, password);
			
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
