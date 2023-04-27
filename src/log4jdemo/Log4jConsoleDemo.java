package log4jdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jConsoleDemo {
	
	private static final Logger logTest=LogManager.getLogger(Log4jConsoleDemo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logTest.trace("Test  Trace Mode update");
		logTest.info("Test  Info Mode");
		logTest.debug("Test  Debug Mode");
		logTest.error("Test  Error mode");
		logTest.fatal("Test  Fatal mode");

	}

}
