package Framework.Browser;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.CapabilityType;

public class DriverManager {

	private static WebDriver driver;
	
	private static WebDriver getDriverManager(BrowserType browserType) {
		switch (browserType) {
			case CHROME:
				WebDriverManager.chromedriver().setup();
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--start-maximized");
				chromeOptions.addArguments("--incognito");
				driver = new ChromeDriver(chromeOptions);
				break;
			case FIREFOX:
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions firefoxOptions = new FirefoxOptions();
				firefoxOptions.addArguments("--start-maximized");
				firefoxOptions.addArguments("--incognito");
				driver = new FirefoxDriver(firefoxOptions);
				break;
			case IE:
				WebDriverManager.iedriver().setup();
				MutableCapabilities capabilities = new MutableCapabilities();
				capabilities.setCapability(CapabilityType.BROWSER_NAME, Browser.IE);
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				driver = new InternetExplorerDriver();
				break;
			case EDGE:
				WebDriverManager.edgedriver().setup();
				EdgeOptions edgeOptions = new EdgeOptions();
				edgeOptions.addArguments("--start-maximized");
				edgeOptions.addArguments("--incognito");
				driver = new EdgeDriver(edgeOptions);
				break;
			case HEADLESS:
				WebDriverManager.chromedriver().setup();
				ChromeOptions headlessChromeOptions = new ChromeOptions();
				headlessChromeOptions.addArguments("--headless");
				headlessChromeOptions.addArguments("--window-size(1920,1080)");
				driver = new ChromeDriver(headlessChromeOptions);
				break;
			default:
				break;
		}
		return driver;
	}
	
	public static WebDriver getDriver(BrowserType browserType) {
		if (driver == null) {
			driver = getDriverManager(browserType);
		}
		return driver;
	}
	
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
	
}
