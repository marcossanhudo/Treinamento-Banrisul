package Framework.Report;

import org.openqa.selenium.WebDriver;
import Framework.Utils.CreateFolder;
import Framework.Utils.DateTime;
import java.io.File;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.ExtentReports;

public class ReportFactory {

	public static WebDriver driver;
	public static final String REPORTS_FOLDER_PATH =
			System.getProperty("user.dir") + File.separator
			+ "Reports" + File.separator
			+ "Report_" + DateTime.getReportScreenshotDateTimeFormat();
	public static ExtentSparkReporter extentSparkReporter;
	public static ExtentReports extentReports;
	
	public static void configureExtentReport() {
		CreateFolder.createReportFolder(REPORTS_FOLDER_PATH);
		extentSparkReporter = new ExtentSparkReporter(REPORTS_FOLDER_PATH + File.separator + "Report_" + DateTime.getReportScreenshotDateTimeFormat() + ".html");
		extentSparkReporter.config().setDocumentTitle("Relatório de " + DateTime.getReportScreenshotDateTimeFormat());
		extentSparkReporter.config().setReportName("Relatório de " + DateTime.getReportScreenshotDateTimeFormat());
		extentSparkReporter.config().setTheme(Theme.DARK);
		extentSparkReporter.config().setEncoding("UTF-8");
		extentSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		extentSparkReporter.config().setCss(".nav-wrapper { background-color: #4B0082 !important; } .nav-logo{margin-top: 10px;}.brand-logo { background-color: #4B0082 !important; padding: 0 10px 0 0 !important; margin: 0 !important; position: absolute !important } .report-name { margin-left: 80px !important } .blue.darken-3 { background-color:#4B0082 !important; color: #FFF !important;}");
		extentSparkReporter.config().setJs("$('.nav-logo').html(`<img src='https://promo.banrisul.com.br/bom/multimidia/bomd99im_icone_banrisul-rebrand.png' class='logo-do-banrisul'>`);");
		
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
	}
	
	protected synchronized static ExtentReports getInstance() {
		if (extentReports == null) {
			configureExtentReport();
		}
		return extentReports;		
	}
	
}
