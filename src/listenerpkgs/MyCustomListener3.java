package listenerpkgs;


import org.testng.ISuite;
import org.testng.ISuiteListener;


public class MyCustomListener3 implements ISuiteListener {

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
