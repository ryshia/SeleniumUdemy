package testngclass;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ItestResult_ScreenShot {
	private WebDriver driver;
	private String baseUrl;
	
	@BeforeMethod
   public void beforeMethod() {
		driver= new FirefoxDriver();	
		baseUrl="https://www.facebook.com/login.php/";	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(baseUrl);
	  }
	
  @Test
  public void ftest() {
	  driver.findElement(By.id("email")).sendKeys("abc");
	  driver.findElement(By.id("pass")).sendKeys("bdfsd");
	  driver.findElement(By.id("LoginButton")).click();
  }
  
  @AfterMethod
  public void afterMethod(ITestResult rs) throws IOException {
	  if (rs.getStatus()==ITestResult.FAILURE) {
 		  System.out.println("Test_Failed: " + rs.getName());
 		  String fileName= rs.getClass().getName() +"_"+ rs.getName() + ".png";
 		  String dir =System.getProperty("user.dir") + "//screenshots//";
 		  File sourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 		  FileUtils.copyFile(sourceFile, new File (dir + fileName));
 		  
	  }
	  if (rs.getStatus()==ITestResult.SUCCESS)
		  System.out.println("Test_Passed: " + rs.getMethod().getMethodName());
  
	  driver.quit();
  }
  
 

}
