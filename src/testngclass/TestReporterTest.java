package testngclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestReporterTest {
  @Test
  public void Test1() {
	  Reporter.log("TestReporterTest -> Test1",false);  
	  Assert.assertTrue(true);
  }
  @Test
  public void Test2() {
	  
	  Reporter.log("TestReporterTest -> Test2",false);  
	  Assert.assertTrue(false);
  }
  @Test (dependsOnMethods = {"Test2"})
  public void Test3() {
	  
	  Reporter.log("TestReporterTest -> Test3",false);  
	 
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("TestReporterTest -> beforeMethod",false);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("TestReporterTest -> afterMethod",false);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("TestReporterTest -> beforeClass",false);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("TestReporterTest -> afterClass",false);
  }

}
