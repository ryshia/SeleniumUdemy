package log4jcustom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Log4JCustomTest {
	
	private static final Logger logTest=LogManager.getLogger(Log4JCustomTest.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	logTest.trace("Test custom Trace Mode");
	logTest.info("Test custom Info Mode");
	logTest.debug("Test custom Debug Mode");
	logTest.error("Test custom Error mode");
	logTest.fatal("Test custom Fatal mode");

	}
	
	@Test
	public void TestNGMethod() {
		
	}

}
