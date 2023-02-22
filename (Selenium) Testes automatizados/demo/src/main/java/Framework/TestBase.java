package Framework;

import Framework.Browser.BrowserType;
import Framework.Browser.DriverManager;
import Framework.Report.Report;
import Framework.Utils.FileOperation;

import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class TestBase extends DriverManager {

	private static WebDriver driver;
	private static String URL = FileOperation.getProperties("url").getProperty("url.index");
	
	public static WebDriver getDriverFromDriverManager() {
		driver = getDriver(BrowserType.FIREFOX);
		return driver;
	}
	
	@BeforeEach
	public void setUp() {
		getDriverFromDriverManager().get(URL);
	}
	
	@AfterEach
	public void finish() {
		Report.close();
		quitDriver();
	}
}
