package testngclass;

import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ItestResult_Test {
 
  @Test
  public void Test1() {
	  System.out.println("Test1_Test: ");
	  Assert.assertTrue(false);
  }
  
  @Test
  public void Test2() {
	  System.out.println("Test2_Test: ");
	  Assert.assertTrue(true);
  }
  
  
  @Test
  public void Test3() {
	  System.out.println("Test3_Test: ");
	  Assert.assertTrue(false);
  }
  
  @Test
  public void Test4() {
	  System.out.println("Test4_Test: ");
	  Assert.assertTrue(true);
  }
  
  @AfterMethod
  public void f(ITestResult rs) {
	  
	  if (rs.getStatus()==ITestResult.FAILURE)
	 		  System.out.println("Test_Failed: " + rs.getName());
		
	  if (rs.getStatus()==ITestResult.SUCCESS)
 		  System.out.println("Test_Passed: " + rs.getMethod().getMethodName());

	 
  }
}
