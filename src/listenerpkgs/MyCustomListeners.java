package listenerpkgs;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class MyCustomListeners implements IInvokedMethodListener, ITestListener, ISuiteListener {

	public void testMyCustomListener1 ()
	{
		System.out.println("TestMyCustomListener1 -> testing any");
	}
	
	public void  beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("Before Invocation =>: " + "ITestResult: " + testResult.getMethod().getMethodName() + "=> IInvokedMethod: " + method.getTestMethod());
	}
	
	public void  afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("After Invocation =>: " + "ITestResult: " + testResult.getMethod().getMethodName() + "=> IInvokedMethod: " + method.getTestMethod());
	}
	 /**
	   * Invoked each time before a test will be invoked. The <code>ITestResult</code> is only partially
	   * filled with the references to class, method, start millis and status.
	   *
	   * @param result the partially filled <code>ITestResult</code>
	   * @see ITestResult#STARTED
	   */
	  public void onTestStart(ITestResult result) {
	    // not implemented
		  System.out.println(" onTestStart....");
	  }

	  /**
	   * Invoked each time a test succeeds.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS
	   */
	  public void onTestSuccess(ITestResult result) {
	    // not implemented
		  System.out.println(" onTestSuccess....");
	  }

	  /**
	   * Invoked each time a test fails.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#FAILURE
	   */
	  public void onTestFailure(ITestResult result) {
	    // not implemented
		  System.out.println(" onTestFailure....");
	  }

	  /**
	   * Invoked each time a test is skipped.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SKIP
	   */
	  public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	  /**
	   * Invoked each time a method fails but has been annotated with successPercentage and this failure
	   * still keeps it within the success percentage requested.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
	   */
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  /**
	   * Invoked each time a test fails due to a timeout.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   */
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  /**
	   * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt;
	   * tag and calling all their Configuration methods.
	   *
	   * @param context The test context
	   */
	  public void onStart(ITestContext context) {
	    // not implemented
		  System.out.println(" onStart of the <Test> xml tag...." + context.getName());
		  ITestNGMethod[] methods= context.getAllTestMethods();
		  for (ITestNGMethod m: methods) {
			  System.out.println(m.getMethodName());
		  }
	  }

	  /**
	   * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have
	   * run and all their Configuration methods have been called.
	   *
	   * @param context The test context
	   */
	  public void onFinish(ITestContext context) {
	    // not implemented
		  System.out.println(" onFinish of the <Test> xml tag...." + context.getName());
	  }
	  /**
	   * This method is invoked before the SuiteRunner starts.
	   *
	   * @param suite The suite
	   */
	  public void onStart(ISuite suite) {
	    // not implemented
		  System.out.println("onStart of the suite: " + suite.getName());
	  }

	  /**
	   * This method is invoked after the SuiteRunner has run all the tests in the suite.
	   *
	   * @param suite The suite
	   */
	  public void onFinish(ISuite suite) {
		  // not implemented
		  System.out.println("onFinish of the suite: " + suite.getName());
	  }
 
}
