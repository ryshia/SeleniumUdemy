package testngclass;

import org.testng.annotations.Test;

//import listenerpkgs.MyCustomListener;

import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
import org.junit.Assert;
import org.testng.annotations.AfterClass;

//@Listeners(MyCustomListener.class)
public class IListenerTestClass {
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("IListenerTestClass-> Before class");
  }
  
  @Test
  public void Test1() {
	  System.out.println("IListenerTestClass-> Test1 ");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void Test2() {
	  System.out.println("IListenerTestClass-> Test2 ");
	  Assert.assertTrue(false);
  }
  

  @AfterClass
  public void afterClass() {
	  System.out.println("IListenerTestClass-> After class");
  }

}
