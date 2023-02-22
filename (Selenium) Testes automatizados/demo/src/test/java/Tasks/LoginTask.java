package Tasks;

import PageObjects.LoginPage;
import Validations.LoginValidation;
import Validations.GenericValidation;
import java.lang.Thread;
import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperation;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import java.util.Duration;

public class LoginTask {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private LoginValidation loginValidation;
	private GenericValidation genericValidation;
	
	public LoginTask(WebDriver driver) {
		this.driver = driver;
		this.loginPage = new LoginPage(this.driver);
		this.loginValidation = new LoginValidation(this.driver);
		this.genericValidation = new GenericValidation(this.driver);
	}
	
	public void login() {
		loginValidation.validateLoginPage();
		loginPage.getUsernameInput().sendKeys("standard_user");
		loginPage.getPasswordInput().sendKeys("secret_sauce");
		loginPage.getLoginButton().click();
		genericValidation.validatePageTitle("PRODUCTS");
		genericValidation.validateProductName();
	}
	
	public void login(String username, String password) {
		loginValidation.validateLoginPage();
		loginPage.getUsernameInput().sendKeys(username);
		loginPage.getPasswordInput().sendKeys(password);
		loginPage.getLoginButton().click();
		genericValidation.validatePageTitle("PRODUCTS");
		genericValidation.validateProductName();
	}
	
	public void loginUsingPropsFile() {
		loginValidation.validateLoginPage();
		loginPage.getUsernameInput().sendKeys(FileOperation.getProperties("user").getProperty("name"));
		loginPage.getPasswordInput().sendKeys(FileOperation.getProperties("user").getProperty("password"));
		loginPage.getLoginButton().click();
		genericValidation.validatePageTitle("PRODUCTS");
		genericValidation.validateProductName();
	}
}
