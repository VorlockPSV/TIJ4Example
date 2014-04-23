package thinking._12_exceptions.LoggingExceptions2;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

//: exceptions/LoggingExceptions2.java
// Logging caught exceptions.
public class LoggingExceptions2 {
	private Logger logger = Logger.getLogger("LoggingExceptions2");

	void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}

	public LoggingExceptions2() {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			logException(e);
		}
	}
} /* Output
���� 16, 2014 11:36:40 ���� thinking._12_exceptions.LoggingExceptions2.LoggingExceptions2 logException
����: java.lang.NullPointerException
	at thinking._12_exceptions.LoggingExceptions2.LoggingExceptions2.<init>(LoggingExceptions2.java:20)
	at thinking._12_exceptions.LoggingExceptions2.Test.<init>(Test.java:5)
	at hyc.com.run.Main.main(Main.java:6)
*///:~
