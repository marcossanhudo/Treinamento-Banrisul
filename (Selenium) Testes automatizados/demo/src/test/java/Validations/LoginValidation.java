package Validations;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import org.junit.jupiter.api.Assertions;

public class LoginValidation {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private Waits wait;
	
	public LoginValidation(WebDriver driver) {
		this.driver = driver;
		this.loginPage = new LoginPage(this.driver);
		this.wait = new Waits(this.driver);
	}
	
	public void validateLoginPage() {
		try {
			wait.loadElement(loginPage.getTitle());
			Assertions.assertTrue(loginPage.getTitle().isDisplayed());
			Report.log(Status.PASS, "Acessou com sucesso a página de login.", Screenshot.captureFile(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureFile(driver));
		}
		
	}
	
}
