package info.owczarek.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

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
	
	public void serveException(RuntimeException exception) {
		logger.error("Exception: " + exception.getMessage());
	}
	
	public void methodExecuted(JoinPoint joinPoint) {
		joinPoint.getKind();
		joinPoint.getArgs();
		joinPoint.getSignature().toLongString();
		joinPoint.getSignature().toShortString();
		joinPoint.getSignature().getModifiers(); // java.lang.reflect.Modifier.*
		joinPoint.getTarget(); // oryginalny obiekt
		joinPoint.getThis(); // proxy
		logger.info("Method " + joinPoint.getSignature().getName() + " has already been executed");
	}
}
