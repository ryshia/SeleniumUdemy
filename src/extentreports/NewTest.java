package extentreports;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.ITest;

import basepackage.BaseUtils;
import basictest.GenericMethods;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
	String baseUrl;
	ExtentReports xReport;
	ExtentTest xTest;
 
  @BeforeClass
  public void beforeClass() {
	  
	  xReport = BaseUtils.initiateExtentReports();
	  xTest=xReport.startTest("Welcome NewTest");	
	  System.out.println("Before method executed...");
		driver= new FirefoxDriver();		
		baseUrl="https://courses.letskodeit.com/practice";	
		driver.get(baseUrl);
		
		xTest.log(LogStatus.INFO, "Browser start here");
		
		driver.manage().window().maximize();
		
		xTest.log(LogStatus.INFO, "Browser maximizing");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		xTest.log(LogStatus.INFO, "Browser waiting to be fully loaded");
  }

  @Test
  public void Test1() {
	  
	  //Click on Sign-In	
	  
	  driver.findElement(By.xpath("//a[@href='/login']")).click();
	  xTest.log(LogStatus.INFO, "Clicked on login link");
	  //enter username
	  
	  driver.findElement(By.id("email")).sendKeys("abcdef");
	  xTest.log(LogStatus.INFO, "Entered email");
	  //enter password
	  
	  driver.findElement(By.id("password")).sendKeys("a123456");
	  xTest.log(LogStatus.INFO, "Entered password");
	//Click on Login	
	  
	  driver.findElement(By.xpath("//input[@value='Login']")).click();
	  xTest.log(LogStatus.INFO, "Clicked on Login link");
	  
	  Assert.assertTrue(false);
	  
	  xTest.log(LogStatus.PASS, "Test passed all steps");	  
  }
  
  @AfterMethod
  public void afterMethod(ITestResult res) throws InterruptedException, IOException {
	  
	  if (res.getStatus() == ITestResult.FAILURE) {
			String path = BaseUtils.takeScreenShot(driver, res.getClass().getName()+"_"+res.getName());
			String imagePath = xTest.addScreenCapture(path);
			xTest.log(LogStatus.FAIL, "Verify Welcome Text Failed", imagePath);
		}
	  Thread.sleep(3000);
		driver.quit();
		xReport.endTest(xTest);
		xReport.flush();
  }

}
