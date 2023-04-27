package testngclass;

import org.testng.annotations.Test;

import basepackage.BaseTestSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeAndAfterAnnotation extends BaseTestSuite{
	
  @Test
  public void test1() {
	  System.out.println(" BeforeAndAfterAnnotation-> Test 1");
  }
  
  @Test
  public void test2() {
	  System.out.println("  BeforeAndAfterAnnotation-> Test 2");
  }
  
  @Test
  public void test3() {
	  System.out.println("  BeforeAndAfterAnnotation-> Test 3");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("  BeforeAndAfterAnnotation-> Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("  BeforeAndAfterAnnotation-> After method");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("  BeforeAndAfterAnnotation-> Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("  BeforeAndAfterAnnotation-> After class");
  }

}
