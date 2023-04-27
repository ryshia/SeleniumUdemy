package listenerpkgs;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class MyCustomListener implements IInvokedMethodListener {

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
 
}
