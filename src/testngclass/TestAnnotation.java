package testngclass;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcode.SomeCode;
import basepackage.BaseTestSuite;

public class TestAnnotation extends BaseTestSuite{
	
 // @Test
  public void testNumber() {
	  SomeCode sc=new SomeCode();
	  int a= sc.sumNumber(1, 2);
	  System.out.println("TestAnnotation-> Testing method -Sum number: " + a);
	  Assert.assertEquals(a, 3);
  }
  
  @Test
  public void testNumber_softAssert() {
	  SoftAssert sa =new SoftAssert();
	  SomeCode sc=new SomeCode();
	  int a= sc.sumNumber(1, 2);
	  System.out.println("TestAnnotation-> Start testing method softAssert -Sum number: " + a);
	  sa.assertEquals(a, 2);
	  System.out.println("TestAnnotation-> After test 1 softAssert -Sum number: ");
	  sa.assertEquals(a, 3);
	  System.out.println("TestAnnotation-> After test 2 softAssert -Sum number: ");
	  sa.assertEquals(a, 4);
	  System.out.println("TestAnnotation-> After test 3 softAssert -Sum number: ");
	 // sa.assertAll();
  }
  
 // @Test
  public void testString() {
	  System.out.println("Testing method -String");
	  SomeCode sc=new SomeCode();
	  String a= sc.sumString("Hello","world");
	  Assert.assertEquals(a, "Hello World");
  }
  
 // @Test
  public void testArrary() {
	  System.out.println("Testing method -Array");
	  int[] test = {1, 2, 3,4};
	  SomeCode sc=new SomeCode();
	  int[] expected=sc.getArray();
	  
	  Assert.assertEquals(test, expected);
	  System.out.println("End Testing method -Array");
	  
  }
}
