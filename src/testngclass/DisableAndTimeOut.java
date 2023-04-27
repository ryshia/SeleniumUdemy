package testngclass;

import org.testng.annotations.Test;

public class DisableAndTimeOut {
	@Test(enabled=false)
	  public void test1() {
		  System.out.println(" DisableAndTimeOut-> Test 1");
		
	  }
	  
	  @Test (timeOut=300)
	  public void test2() throws InterruptedException {
		  System.out.println("  DisableAndTimeOut-> Test 2");
		  Thread.sleep(200);
	  }
	  
}
