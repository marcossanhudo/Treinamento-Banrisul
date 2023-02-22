package Framework.Report;

import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import com.assertthat.selenium_shutterbug.core.PageSnapshot;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;
import Framework.Utils.CreateFolder;
import Framework.Utils.DateTime;
import org.apache.commons.io.FileUtils;
import org.apache.hc.client5.http.utils.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot {

	private static final String SCREENSHOTS_FOLDER_PATH = ReportFactory.REPORTS_FOLDER_PATH + File.separator + "Screenshots";
	
	public static Media captureFile(WebDriver driver) {
		try {
			CreateFolder.createReportFolder(SCREENSHOTS_FOLDER_PATH);
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String screenshotPath = SCREENSHOTS_FOLDER_PATH + File.separator + "Image_" + DateTime.getReportScreenshotDateTimeFormat(); 
			FileUtils.copyFile(screenshot, new File(screenshotPath));
			return MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build();
		} catch (Exception e) {
			String message = "Ocorreu um erro ao capturar a tela. " + e.getMessage();
		}
		return null;
	}
	
	public static Media captureBase64(WebDriver driver) {
		try {
			PageSnapshot screenshot = Shutterbug.shootPage(driver);
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			ImageIO.write(screenshot.getImage(), "png", stream);
			String base64Image = Base64.encodeBase64String(stream.toByteArray());
			return MediaEntityBuilder.createScreenCaptureFromBase64String(base64Image).build();
		} catch (Exception e) {
			String message = "Ocorreu um erro ao capturar a tela. " + e.getMessage();
		}
		return null;
	}
}
