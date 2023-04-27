package extentreports;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import basepackage.BaseUtils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Test3 {
	
	ExtentReports xReport;
	ExtentTest xTest;
	
	  @BeforeMethod
  public void beforeMethod() {
	 xReport = BaseUtils.initiateExtentReports();
	 xTest=xReport.startTest("Test 3");	
  }
	  
	  
  @Test
  public void hhf() {
	  
	  xTest.log(LogStatus.INFO,"Start Test");	
	  xTest.log(LogStatus.INFO,"Test in progress");
	  xTest.log(LogStatus.INFO,"Test End");	
  }


  @AfterMethod
  public void afterMethod() {
	  
	  xReport.endTest(xTest);
		xReport.flush();
  }

}
