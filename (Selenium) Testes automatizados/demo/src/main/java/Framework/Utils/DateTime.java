package Framework.Utils;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDateTime;

public class DateTime {
	
	public static String getReportDateTimeFormat() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
		Date now = new Date();
		return dateFormat.format(now);
	}

	public static String getReportScreenshotDateTimeFormat() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy_hh'h'mm'm's's'");
		return dateTimeFormatter.format(LocalDateTime.now());
	}
	
}
