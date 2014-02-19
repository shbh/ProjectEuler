package project.euler.feature;

import org.apache.log4j.Logger;

public class Writer implements KeyConstant {
	
	static Logger logger = Logger.getLogger(Writer.class);
	
	public static void write(final String text) {
	
		logger.info(text);
	
	}

	public static void error(final String text) {
	
		logger.info(text);
	
	}

	public static void write(final String... texts) {
	
		StringBuilder message = new StringBuilder();
		
		for (String text : texts) {
		
			message.append(text).append(COMMA);
		
		}
		
		logger.info(message.substring(0, message.length()-1));
		
	}
	
	

	public static void error(final String... texts) {
		
		StringBuilder error = new StringBuilder();
		
		for (String text : texts) {
		
			error.append(text).append(COMMA);
		
		}
		
		logger.info(error.substring(0, error.length()-1));
		
	}
}
