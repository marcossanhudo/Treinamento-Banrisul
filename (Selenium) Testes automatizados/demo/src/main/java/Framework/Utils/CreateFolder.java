package Framework.Utils;

import java.io.File;

public class CreateFolder {

	public static void createReportFolder(String path) {
		File reportPath = new File(path);
		
		if (!reportPath.exists()) {
			reportPath.mkdir();
		}
	}
	
}
