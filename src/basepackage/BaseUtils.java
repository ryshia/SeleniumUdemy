package basepackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

public class BaseUtils {
	
	public static String takeScreenShot(WebDriver driver, String fileName) throws IOException {
		  fileName= fileName + ".png";
		  String dir =System.getProperty("user.dir") + "//screenshots//";
		  File sourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  String destination=dir + fileName;
		  FileUtils.copyFile(sourceFile, new File (destination));
		  return destination;
	}
	
	public static ExtentReports initiateExtentReports() {
		
		ExtentReports xReport = new ExtentReports("C:\\THAO\\SourceCode\\example\\SeleniumWDTutorial\\XReport\\newtest.html",false);
		xReport.addSystemInfo("Test Framework: ", "Selenium + TestNG").addSystemInfo("Test Environment: ", "Windows");
		return xReport;
	}

}
