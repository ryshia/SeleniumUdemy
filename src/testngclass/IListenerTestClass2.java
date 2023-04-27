package testngclass;

import org.testng.annotations.Test;

//import listenerpkgs.MyCustomListener2;

import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Listeners;
import org.junit.Assert;
import org.testng.annotations.AfterClass;

//@Listeners(MyCustomListener2.class)
public class IListenerTestClass2 {
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("IListenerTestClass2-> Before class");
  }
  
  @Test
  public void Test1() {
	  System.out.println("IListenerTestClass2-> Test1 ");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void Test2() {
	  System.out.println("IListenerTestClass2-> Test2 ");
	  Assert.assertTrue(false);
  }
  

  @AfterClass
  public void afterClass() {
	  System.out.println("IListenerTestClass2-> After class");
  }

}
