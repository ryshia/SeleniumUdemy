package log4jdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDefaultConfig {
	
	private static final Logger logTest=LogManager.getLogger(Log4jDefaultConfig.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	logTest.debug("Test Debug Mode");
	logTest.error("Test Error mode");
	logTest.fatal("Test Fatal mode");

	}

}
