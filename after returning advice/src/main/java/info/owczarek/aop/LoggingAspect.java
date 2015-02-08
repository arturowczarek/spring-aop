package info.owczarek.aop;

import org.apache.log4j.Logger;

public class LoggingAspect {
	private Logger logger = Logger.getLogger(getClass().getName());
	
	public void logExecution() {
		logger.info("Method executing");
	}
	
	public void warnIfNull(Object returnedValue) {
		if (returnedValue == null) {
			logger.warn("Returned value is null");
		}
	}
}
