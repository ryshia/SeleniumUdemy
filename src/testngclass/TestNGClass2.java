package testngclass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseTestSuite;

public class TestNGClass2 extends BaseTestSuite {
	
	  @Test (dependsOnMethods= {"test4"}, alwaysRun=true)
	  public void test1() {
		  System.out.println(" TestNGClass2-> Test 1");
		
	  }
	  
	  @Test(dependsOnMethods= {"test3"})
	  public void test2() {
		  System.out.println("  TestNGClass2-> Test 2");
	  }
	  
	  @Test(dependsOnMethods= {"test1"})
	  public void test3() {
		  System.out.println("  TestNGClass2-> Test 3");
	  }
	  
	  @Test
	  public void test4() {
		  System.out.println("  TestNGClass2-> Test 4");
		  assertEquals(false, true);
	  }
	  
	  
	 // @BeforeMethod
	  public void beforeMethod() {
		  
		  System.out.println("  TestNGClass2-> Before method");
	  }

	 // @AfterMethod
	  public void afterMethod() {
		  System.out.println("  TestNGClass2-> After method");
	  }

	 // @BeforeClass
	  public void beforeClass() {		
		  System.out.println("  TestNGClass2-> Before class");
	  }

	 // @AfterClass
	  public void afterClass() {		 
		  System.out.println("  TestNGClass2-> After class");
	  }
}
