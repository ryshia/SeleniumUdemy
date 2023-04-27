package testngclass;

import org.testng.annotations.Test;

public class PriorityTest {
  @Test(priority=1)
  public void f() {
	  
	  System.out.println(" PriorityTest-> Test 0f");
  }
  
  @Test
  public void test1() {
	  System.out.println(" PriorityTest-> Test 1");
  }
  
  @Test
  public void test2() {
	  System.out.println("  PriorityTest-> Test 2");
  }
  
  @Test
  public void test3() {
	  System.out.println("  PriorityTest-> Test 3");
  }
  
}
